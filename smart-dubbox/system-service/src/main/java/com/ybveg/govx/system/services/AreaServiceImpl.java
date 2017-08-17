package com.ybveg.govx.system.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ybveg.govx.system.api.AreaService;
import com.ybveg.govx.system.mapper.AreaMapper;
import com.ybveg.govx.system.model.dto.AreaDto;
import com.ybveg.govx.system.model.po.Area;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;

/**
 * Created by KLJ on 2017/8/16.
 */
@Service
@Transactional
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper mapper;

    @Override
    public boolean add(AreaDto area) throws Exception {

        if (mapper.insert(area.toPo()) == 0)
            return false;

        return true;
    }

    @Override
    public PageInfo<Map<String, Object>> list(Map<String, Object> params, int size, int num) throws Exception {
        PageHelper.startPage(num, size);
        List<Map<String, Object>> list = mapper.list(params);
        PageInfo<Map<String, Object>> results = new PageInfo<>(list);
        return results;
    }

    @Override
    @Transactional(readOnly = false)
    public boolean delete(String code) throws Exception {
        Area area = new Area();
        area.setAreaCode(code);

        if (mapper.delete(area) == 0)
            return false;

        return true;
    }

    @Override
    public List<Area> listByParentCode(String parentCode) throws Exception {
        Area area = new Area();
        area.setParentCode(parentCode);
        return mapper.select(area);
    }
}
