package com.ybveg.govx.controller.admin;

import com.ybveg.govx.mvc.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("admin/dept")
public class DeptController {

  @RequestMapping("add")
  public R add() {
    return null;
  }

  @RequestMapping("delete")
  public R delete() {
    return null;
  }

  @RequestMapping("update")
  public R update() {
    return null;
  }

  @PostMapping("page/{size}/{num}")
  public R list(@RequestBody Map<String, Object> params, int size, int num) {
    return R.ok();
  }

  @RequestMapping("search")
  public R search() {
    return null;
  }

}
