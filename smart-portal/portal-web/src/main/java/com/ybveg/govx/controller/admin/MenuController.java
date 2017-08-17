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
import com.ybveg.govx.system.api.MenuService;
import com.ybveg.govx.system.api.ModuleFunctionService;
import com.ybveg.govx.system.api.ModuleService;
import com.ybveg.govx.system.model.dto.MenuDto;
import com.ybveg.govx.system.model.po.Menu;
import com.ybveg.govx.system.model.po.ModuleFunction;
import java.util.Collection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 菜单管理
 */
@RestController
@RequestMapping("admin/menu")
@Module(value = {ModuleModule.class, MenuModule.class})
public class MenuController extends BaseController {

  @Autowired
  private AuthManager manager;

  @Reference(version = "1.0.0")
  private MenuService service;

  @Reference(version = "1.0.0")
  private ModuleService moduleService;

  /**
   * @Author: hb
   * @Description: 菜单列表分页
   * @Date: 14:42 2017/8/17
   * @Params: int pageSize 条数, int pageNum 页数
   * @Return:
   */
  @GetMapping("page")
  public R pageMenu(int pageSize, int pageNum) throws Exception {
    return R.ok(service.listForPage(pageNum, pageSize));
  }

  @PostMapping("add")
  public R addMenu(@RequestBody MenuDto dto) throws Exception {
    service.add(dto);
    return R.ok();
  }

  @PostMapping("edit")
  public R editMenu(MenuDto dto) throws Exception {
    service.edit(dto);
    return R.ok();
  }

//  @GetMapping("function")
//  public R getFuncByModuleCode(String moduleCode) throws Exception {
//    return R.ok(moduleFunctionService.getFuncByModuleCode(moduleCode));
//  }
//
//  @PostMapping("function/edit")
//  public R editModuleFunction(ModuleFunction moduleFunction) throws Exception {
//    moduleFunctionService.editModuleFunction(moduleFunction);
//    return R.ok();
//  }
}
