package com.ybveg.govx.auth;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ybveg.auth.AuthAbstractManager;
import com.ybveg.auth.model.ModuleModel;
import java.util.List;
import org.springframework.stereotype.Component;

/**
 * 实现并获取权限
 *
 * @auther zbb
 * @create 2017/8/15
 */
@Component
public class GovxAuthManager extends AuthAbstractManager {


  @Override
  public List<ModuleModel> getAuths(String key) {
    return null;
  }
}
