package com.ybveg.govx.system.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ybveg.govx.system.api.MenuService;
import com.ybveg.govx.system.api.ModuleService;
import com.ybveg.govx.system.mapper.MenuMapper;
import com.ybveg.govx.system.mapper.ModuleMapper;
import com.ybveg.govx.system.model.dto.MenuDto;
import com.ybveg.govx.system.model.po.Menu;
import java.util.Date;
import java.util.List;
import java.util.Map;
import org.apache.http.client.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by hb on 2017/8/15.
 */

@Service(version = "1.0.0")
public class MenuServiceImpl implements MenuService {

  @Autowired
  MenuMapper mapper;

  @Override
  public PageInfo<Map<String, Object>> listForPage(int pageNum, int pageSize) throws Exception {

    PageHelper.startPage(pageNum, pageSize);
    List<Map<String, Object>> list = mapper.listForPage();
    PageInfo<Map<String, Object>> results = new PageInfo<>(list);

    return results;
  }

  @Override
  public void add(MenuDto dto) throws Exception {
    Menu po = dto.toPo();
    po.setCreateTime(new Date());

    mapper.insert(po);
  }

  @Override
  public void edit(MenuDto dto) throws Exception {

    mapper.updateByPrimaryKeySelective(dto.toPo());
  }


}
