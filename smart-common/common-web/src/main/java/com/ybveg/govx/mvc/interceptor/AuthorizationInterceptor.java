package com.ybveg.govx.mvc.interceptor;

import com.ybveg.auth.AuthAbstractManager;
import com.ybveg.auth.FreeLogin;
import com.ybveg.auth.token.Token;
import com.ybveg.govx.mvc.SessionModel;
import java.lang.annotation.Annotation;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class AuthorizationInterceptor extends HandlerInterceptorAdapter {

  private AuthAbstractManager manager;

  public AuthorizationInterceptor(AuthAbstractManager manager) {
    this.manager = manager;
  }

  public boolean preHandle(HttpServletRequest request,
      HttpServletResponse response, Object handler) throws Exception {
    // 如果不是映射到方法直接通过

    if (!(handler instanceof HandlerMethod)) {
      if (RequestMethod.OPTIONS.name().equals(request.getMethod())) {  //如果是options 请求
        response.setStatus(204);
      }
      return true;
    }
    HandlerMethod handlerMethod = (HandlerMethod) handler;
    Class clazz = handlerMethod.getBeanType();
    Annotation freeLogin = clazz.getAnnotation(FreeLogin.class);
    if (freeLogin != null) {  // 如果有FreeLogin 注解无需登录验证
      return true;
    }

    String rawToken = request.getHeader(Token.TOKEN_NAME);
    Token token = manager.parseToken(rawToken);
    if (token.isRefresh()) {  //如果更新了Token
      response.setHeader(Token.TOKEN_NAME, token.getToken());
    }

    SessionModel session = token.getData(SessionModel.class);
    request.setAttribute(SessionModel.KEY, session);
    return true;
  }
}