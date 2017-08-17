package com.ybveg.govx.controller.admin;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ybveg.auth.AuthManager;
import com.alibaba.dubbo.config.annotation.Reference;
import com.ybveg.auth.Function;
import com.ybveg.auth.Module;
import com.ybveg.auth.Relation;
import com.ybveg.auth.model.ModuleModel;
import com.ybveg.govx.module.MenuModule;
import com.ybveg.govx.module.ModuleModule;
import com.ybveg.govx.module.function.Add;
import com.ybveg.govx.module.function.Scan;
import com.ybveg.govx.mvc.BaseController;
import com.ybveg.govx.mvc.R;
import java.util.Collection;
import com.ybveg.govx.system.api.ModuleService;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
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
@Module(value = {ModuleModule.class, MenuModule.class})
public class ModuleController extends BaseController {

  @Autowired
  private AuthManager manager;

  @Reference(version = "1.0")
  private ModuleService service;

  @PostMapping("scan")
  @Function(Scan.class)
  public R scan() {
    Collection<ModuleModel> list = manager.scan();
    String json = JSON.toJSONString(list, SerializerFeature.PrettyFormat,
        SerializerFeature.DisableCircularReferenceDetect);
    return R.ok(JSON.parse(json));
  }

  @GetMapping("page")
  public R pageMoudle(int pageSize, int pageNum) throws Exception {
    return R.ok(service.listForPage(pageNum, pageSize));
  }
}
