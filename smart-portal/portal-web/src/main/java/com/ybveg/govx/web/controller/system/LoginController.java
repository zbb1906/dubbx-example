package com.ybveg.govx.web.controller.system;

import com.ybveg.govx.common.web.R;
import com.ybveg.govx.system.api.UserService;
import java.util.Date;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 登录
 *
 * @auther zbb
 * @create 2017/8/2
 */
@RestController
@RequestMapping("")
public class LoginController {

  @Reference
  private UserService userService;

  @PostMapping("login")
  public R login(String login, String password) {
    return R.ok(new Date().toString());
  }


  @PostMapping("logout")
  public R login() {
    return R.ok(new Date().toString());
  }
}
