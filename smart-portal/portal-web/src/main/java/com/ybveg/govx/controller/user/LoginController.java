package com.ybveg.govx.controller.user;

import com.ybveg.auth.AuthManager;
import com.ybveg.auth.token.Token;
import com.ybveg.govx.mvc.BaseController;
import com.ybveg.govx.mvc.R;
import com.ybveg.govx.mvc.SessionModel;
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

  @Autowired
  private AuthManager manager;

  @PostMapping("login")
  public R login(String username, String password) {
    SessionModel session = new SessionModel();
    session.setAreaCode("510108");
    session.setDpCode("510108");
    session.setId("1245645612312313");
    session.setDpName("成都顺点科技");
    session.setRealname("章彬彬");
    session.setUsername("zhangbinbin");
    session.setType("1");
    Token token = manager.createAccessToken(session.getId(), session);
    return R.ok(token);
  }


  @PostMapping("logout")
  public R login() {
    return R.ok(new Date().toString());
  }
}
