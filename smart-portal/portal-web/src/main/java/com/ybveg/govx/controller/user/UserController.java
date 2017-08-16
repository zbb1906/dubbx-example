package com.ybveg.govx.controller.user;

import com.ybveg.govx.mvc.BaseController;
import com.ybveg.govx.mvc.R;
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

  @GetMapping("single/{id}")
  public R singleUser(String id) {
    return null;
  }

  @GetMapping("info")
  public R getInfo() {
    return null;
  }
}
