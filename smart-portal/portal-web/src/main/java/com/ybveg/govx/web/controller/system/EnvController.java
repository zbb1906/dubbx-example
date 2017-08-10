package com.ybveg.govx.web.controller.system;


import com.ybveg.govx.mvc.BaseController;
import com.ybveg.govx.mvc.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 环境信息
 */
@RestController
@RequestMapping("env")
public class EnvController extends BaseController {

  @PostMapping("")
  public R env() {
    return R.ok();
  }
}
