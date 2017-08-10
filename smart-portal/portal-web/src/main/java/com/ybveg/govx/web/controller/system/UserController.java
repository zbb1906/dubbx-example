package com.ybveg.govx.web.controller.system;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ybveg.govx.dto.UserDto;
import com.ybveg.govx.mvc.BaseController;
import com.ybveg.govx.mvc.R;
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
public class UserController extends BaseController {

  @Reference
  private UserService userService;

  @GetMapping("single/{id}")
  public R singleUser(String id) {
    UserDto user = userService.findUser(id);
    return R.ok(user);
  }

  @GetMapping("info")
  public R info(String id) {
    UserDto user = userService.findUser(id);
    return R.ok(user);
  }
}
