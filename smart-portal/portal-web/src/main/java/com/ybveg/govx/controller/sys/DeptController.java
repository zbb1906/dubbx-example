package com.ybveg.govx.controller.sys;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("sys/dept")
public class DeptController {
  
  
  
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
  
  @RequestMapping("search")
  public Object search() {
    return "";
  }
  
}
