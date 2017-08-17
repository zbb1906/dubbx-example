package com.ybveg.govx.system.services;

import com.alibaba.dubbo.config.annotation.Service;
import com.ybveg.govx.system.api.DeptService;
import com.ybveg.govx.system.mapper.DepartmentMapper;
import com.ybveg.govx.system.model.dto.DepartmentDto;
import com.ybveg.govx.system.model.po.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by KLJ on 2017/8/17.
 */
@Service
@Transactional
public class DeptServiceImpl implements DeptService {

    @Autowired
    DepartmentMapper mapper;

    @Override
    public boolean add(DepartmentDto dto) throws Exception {

        if (mapper.insert(dto.toPo()) == 0)
            return false;

        return true;
    }

    @Override
    public boolean delete(String id) throws Exception {
        Department po = new Department();
        po.setId(id);
        if (mapper.deleteByPrimaryKey(po) == 0)
            return false;
        return true;
    }

    @Override
    public boolean update(DepartmentDto dto) throws Exception {

        if (mapper.updateByPrimaryKeySelective(dto.toPo()) == 0)
            return false;

        return true;
    }
}
