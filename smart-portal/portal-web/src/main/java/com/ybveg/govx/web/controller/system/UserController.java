package com.ybveg.govx.web.controller.system;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ybveg.govx.common.web.R;
import com.ybveg.govx.system.api.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 用户Controller
 *
 * @auther zbb
 * @create 2017/8/2
 */
@RestController
@RequestMapping("user")
public class UserController {

  @Reference
  private UserService userService;

  @GetMapping("single/{id}")
  public R login(String id) {
    return R.ok(userService.findUser(id));
  }
}
