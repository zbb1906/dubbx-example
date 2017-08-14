package com.ybveg.govx.web.controller.system;


import com.ybveg.govx.mvc.BaseController;
import com.ybveg.govx.mvc.R;
import com.ybveg.govx.mvc.auth.Function;
import com.ybveg.govx.mvc.auth.Module;
import com.ybveg.govx.mvc.module.function.ScanFunc;
import com.ybveg.govx.mvc.module.system.SystemMoudle;
import java.util.Map;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 模块管理
 */
@RestController
@RequestMapping("sys/moudle")
@Module(SystemMoudle.class)
public class MoudleController extends BaseController {

  @PostMapping("scan")
  @Function(ScanFunc.class)
  public R scan() {
    return R.ok();
  }

  @PostMapping("page/{pageSize}/{pageNum}")
  public R pageMoudle(@RequestBody Map<String, Object> params, int pageSize, int pageNum) {
    return R.ok();
  }
}
