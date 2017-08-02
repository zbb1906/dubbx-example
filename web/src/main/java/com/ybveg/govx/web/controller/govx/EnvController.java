package com.ybveg.govx.web.controller.govx;


import com.ybveg.govx.common.R;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 环境信息
 */
@RestController
@RequestMapping("env")
public class EnvController {

  @PostMapping("")
  public R env() {
    return R.ok();
  }
}
