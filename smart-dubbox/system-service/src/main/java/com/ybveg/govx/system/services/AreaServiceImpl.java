package com.ybveg.govx.system.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.ybveg.govx.system.api.AreaService;
import com.ybveg.govx.system.mapper.AreaMapper;
import com.ybveg.govx.system.model.dto.AreaDto;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * Created by KLJ on 2017/8/16.
 */
@Service
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    @Override
    public boolean add(AreaDto area) throws Exception {

        if (areaMapper.insert(area.toPo()) == 0)
            return false;

        return true;
    }

    @Override
    public List<Map<String, Object>> list(Map<String, Object> params, int size, int num) throws Exception {
        return areaMapper.list();
    }
}
