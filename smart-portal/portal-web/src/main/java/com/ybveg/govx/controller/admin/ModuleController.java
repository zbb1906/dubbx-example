package com.ybveg.govx.controller.admin;


import com.ybveg.auth.Function;
import com.ybveg.auth.Module;
import com.ybveg.govx.module.ModuleModule;
import com.ybveg.govx.module.function.Scan;
import com.ybveg.govx.mvc.BaseController;
import com.ybveg.govx.mvc.R;
import java.util.Map;
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

  @PostMapping("scan")
  @Function(Scan.class)
  public R scan() {
    return R.ok();
  }

  @PostMapping("page/{pageSize}/{pageNum}")
  public R pageMoudle(@RequestBody Map<String, Object> params, int pageSize, int pageNum) {
    return R.ok();
  }
}
