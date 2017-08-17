package com.ybveg.govx.controller.user;

import com.ybveg.govx.mvc.BaseController;
import com.ybveg.govx.mvc.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
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
@Slf4j
public class UserController extends BaseController {

  @GetMapping("single/{id}")
  public R singleUser(String id) {
    return R.ok();
  }

  @GetMapping("info")
  public R getInfo() {
    log.info("getInfo");
    Map<String, Object> map = new HashMap<>();
    map.put("menus", new ArrayList<String>() {
      {
        add("123");
      }
    });
    return R.ok(map);
  }
}
