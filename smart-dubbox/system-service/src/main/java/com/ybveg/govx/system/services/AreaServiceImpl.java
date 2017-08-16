package com.ybveg.govx.system.services;

import com.ybveg.govx.system.api.AreaService;
import com.ybveg.govx.system.mapper.AreaMapper;
import com.ybveg.govx.system.model.dto.AreaDto;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by KLJ on 2017/8/16.
 */
public class AreaServiceImpl implements AreaService {

    @Autowired
    private AreaMapper areaMapper;

    @Override
    public boolean add(AreaDto area) throws Exception {

        if (areaMapper.insert(area.toPo()) == 0)
            return false;

        return true;
    }
}
