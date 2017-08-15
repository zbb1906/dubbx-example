package com.ybveg.govx.controller.admin;


import com.alibaba.dubbo.config.annotation.Reference;
import com.ybveg.auth.Module;
import com.ybveg.govx.module.RoleModule;
import com.ybveg.govx.mvc.BaseController;
import com.ybveg.govx.system.api.RoleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 模块管理
 */
@RestController
@RequestMapping("admin/role")
@Module(RoleModule.class)
public class RoleController extends BaseController {

  @Reference(version = "1.0")
  private RoleService service;
/*
  @PostMapping("scan")
  @Function(Scan.class)
  public R scan() {
    return R.ok();
  }

  @PostMapping("page/{pageSize}/{pageNum}")
  public R pageMoudle(@RequestBody Map<String, Object> params, int pageSize, int pageNum) {
    return R.ok();
  }*/

  @GetMapping("test")
  public void test() throws Exception {
    service.test();
  }

}
