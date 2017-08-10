package com.ybveg.govx.web.controller.system;

import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.ybveg.govx.dto.UserDto;
import com.ybveg.govx.mvc.BaseController;
import com.ybveg.govx.mvc.R;
import com.ybveg.govx.mvc.SessionModel;
import com.ybveg.govx.system.api.UserService;
import com.ybveg.jwt.token.Token;
import com.ybveg.jwt.token.TokenFactory;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录
 *
 * @auther zbb
 * @create 2017/8/2
 */
@Slf4j
@RestController
@RequestMapping("")
public class LoginController extends BaseController {

  @Reference
  private UserService userService;

  @Autowired
  private TokenFactory factory;

  @PostMapping("login")
  public R login(String login, String password) {
    SessionModel session = new SessionModel();
    session.setAreaCode("510108");
    session.setDpCode("510108");
    session.setId("1245645612312313");
    session.setDpName("成都顺点科技");
    session.setRealname("章彬彬");
    session.setUsername("zhangbinbin");
    session.setType("1");
    Token token = factory.createAccessToken(session.getId(), session);
    UserDto user = userService.findUser("123");
    log.info(JSON.toJSONString(user));
    return R.ok(token);
  }


  @PostMapping("logout")
  public R login() {
    return R.ok(new Date().toString());
  }
}
