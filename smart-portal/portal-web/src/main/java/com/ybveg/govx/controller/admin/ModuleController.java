package com.ybveg.govx.controller.admin;


import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SerializerFeature;
import com.ybveg.auth.AuthManager;
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
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
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

  @PostMapping("scan")
  @Function(Scan.class)
  public R scan() {
    Collection<ModuleModel> list = manager.scan();
    String json = JSON.toJSONString(list, SerializerFeature.PrettyFormat,
        SerializerFeature.DisableCircularReferenceDetect);
    return R.ok(JSON.parse(json));
  }

  @PostMapping("page/{pageSize}/{pageNum}")
  @Function(value = Add.class, relation = {
      @Relation(module = MenuModule.class, func = Add.class),
      @Relation(module = MenuModule.class, func = Add.class)})
  public R pageMoudle(@RequestBody Map<String, Object> params, int pageSize, int pageNum) {
    return R.ok();
  }
}
