package com.ybveg.govx.controller.admin;


import com.alibaba.dubbo.config.annotation.Reference;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ybveg.auth.AuthManager;
import com.ybveg.auth.Function;
import com.ybveg.auth.Module;
import com.ybveg.auth.model.ModuleModel;
import com.ybveg.govx.module.MenuModule;
import com.ybveg.govx.module.ModuleModule;
import com.ybveg.govx.module.function.Scan;
import com.ybveg.govx.mvc.BaseController;
import com.ybveg.govx.mvc.R;
import com.ybveg.govx.system.api.ModuleFunctionService;
import com.ybveg.govx.system.api.ModuleService;
import com.ybveg.govx.system.model.dto.ModuleFunctionDto;
import com.ybveg.govx.system.model.po.ModuleFunction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 模块管理
 */
@RestController
@RequestMapping("admin/module")
@Module(value = {ModuleModule.class, MenuModule.class})
public class ModuleController extends BaseController {

  @Autowired
  private AuthManager manager;

  @Reference(version = "1.0.0")
  private ModuleService service;

  @Reference(version = "1.0.0")
  private ModuleFunctionService moduleFunctionService;

  @PostMapping("scan")
  @Function(Scan.class)
  public R scan() {
    List<ModuleModel> list = new ArrayList<>();
    list.addAll(manager.scan());
    service.saveOrUpdate(list);
    return R.ok();
  }

  @GetMapping("page")
  public R pageModule(int pageSize, int pageNum) throws Exception {
    return R.ok(service.listForPage(pageNum, pageSize));
  }

  @GetMapping("function")
  public R getFuncByModuleCode(String moduleCode) throws Exception {
    return R.ok(moduleFunctionService.getFuncByModuleCode(moduleCode));
  }

  @PostMapping("function/edit")
  public R editModuleFunction(ModuleFunctionDto dto) throws Exception {
    moduleFunctionService.editModuleFunction(dto);
    return R.ok();
  }
}
