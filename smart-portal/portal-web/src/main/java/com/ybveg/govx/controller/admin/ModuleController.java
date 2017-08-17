package com.ybveg.govx.controller.admin;


import com.alibaba.dubbo.config.annotation.Reference;
import com.ybveg.auth.Function;
import com.ybveg.auth.Module;
import com.ybveg.govx.module.ModuleModule;
import com.ybveg.govx.module.function.Scan;
import com.ybveg.govx.mvc.BaseController;
import com.ybveg.govx.mvc.R;
import com.ybveg.govx.system.api.ModuleService;
import java.util.Map;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 模块管理
 */
@RestController
@RequestMapping("admin/module")
@Module(ModuleModule.class)
public class ModuleController extends BaseController {

  @Reference(version = "1.0")
  private ModuleService service;

  @PostMapping("scan")
  @Function(Scan.class)
  public R scan() {
    return R.ok();
  }

  @GetMapping("page")
  public R pageMoudle(int pageSize, int pageNum) throws Exception {
    return R.ok(service.listForPage(pageNum, pageSize));
  }
}
