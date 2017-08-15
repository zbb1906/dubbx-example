package com.ybveg.govx.system.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.ybveg.govx.system.api.RoleService;
import com.ybveg.govx.system.mapper.RoleMapper;
import com.ybveg.govx.system.model.dto.RoleDto;
import com.ybveg.govx.system.model.po.Role;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.Locale;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.beanutils.ConvertUtils;
import org.apache.commons.beanutils.locale.converters.DateLocaleConverter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2017/8/15.
 */

@Component
@Service(version = "1.0")
public class RoleServiceImpl implements RoleService {

  @Autowired
  RoleMapper mapper;

  @Override
  public void test() throws Exception {

    ConvertUtils.register(new DateLocaleConverter(Locale.CHINA, "yyyy-MM-dd HH:mm:ss"), Date.class);

    Role role = new Role();
    RoleDto roleDto = new RoleDto();

    roleDto.setCreateTime("1999-09-12 12:12:12");
    roleDto.setId("213");
    try {
      BeanUtils.copyProperties(role, roleDto);
    } catch (IllegalAccessException e) {
      e.printStackTrace();
    } catch (InvocationTargetException e) {
      e.printStackTrace();
    }

    BeanUtils.copyProperties(roleDto, role);
    mapper.insert(role);
    Role roleDb = mapper.selectOne(role);

    System.out.println(roleDb.getCreateTime());
    System.out.println(role.getId());
    System.out.println(roleDto.getCreateTime());
  }

}
