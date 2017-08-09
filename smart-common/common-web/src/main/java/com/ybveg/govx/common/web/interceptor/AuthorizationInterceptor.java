package com.ybveg.govx.common.web.interceptor;

import com.ybveg.govx.common.web.SessionModel;
import com.ybveg.jwt.token.Token;
import com.ybveg.jwt.token.TokenFactory;
import java.lang.reflect.Method;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthorizationInterceptor extends HandlerInterceptorAdapter {

  @Autowired
  private TokenFactory factory;

  public boolean preHandle(HttpServletRequest request,
      HttpServletResponse response, Object handler) throws Exception {
    // 如果不是映射到方法直接通过

    if (!(handler instanceof HandlerMethod)) {
      return true;
    }

    HandlerMethod handlerMethod = (HandlerMethod) handler;

    Method method = handlerMethod.getMethod();

    String rawToken = request.getHeader(Token.TOKEN_NAME);
    // 验证 token
    Token token = factory.parseToken(rawToken);

    if (token.isRefresh()) {  //如果更新了Token
      response.setHeader(Token.TOKEN_NAME, token.getToken());
    }

    SessionModel session = token.getData(SessionModel.class);
    request.setAttribute(SessionModel.KEY, session);
    return true;
  }
}