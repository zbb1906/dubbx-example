package com.ybveg.govx.controller.admin;

import com.ybveg.govx.mvc.R;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("admin/area")
public class AreaController {

  @RequestMapping("add")
  public Object add() {
    return "";
  }

  @RequestMapping("delete")
  public Object delete() {
    return "";
  }

  @RequestMapping("update")
  public Object update() {
    return "";
  }

  @PostMapping("page/{pageSize}/{pageNum}")
  public R list(){

    return null;
  }

  @RequestMapping("search")
  public Object search() {
    return "";
  }
}
