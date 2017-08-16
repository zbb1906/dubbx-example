package com.ybveg.govx.controller.admin;

import com.ybveg.govx.mvc.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

  @PostMapping("page/{pageSize}/{pageNum}")
  public R list() {
    return null;
  }

  @RequestMapping("search")
  public R search() {
    return null;
  }

}
