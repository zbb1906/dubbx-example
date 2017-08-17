package com.ybveg.govx.system.api;

import com.ybveg.govx.system.model.dto.DepartmentDto;

/**
 * Created by KLJ on 2017/8/17.
 */
public interface DeptService {

    /**
     * 新增部门
     * Created by KLJ on 2017-08-17 09:52:474
     *
     * @param dto 部门对象
     * @return
     * @throws Exception
     */
    public boolean add(DepartmentDto dto) throws Exception;

    /**
     * 删除部门
     * Created by KLJ on 2017-08-17 09:54:10
     * @param id
     * @return
     * @throws Exception
     */
    public boolean delete(String id) throws Exception;

    /**
     * 更新部门
     * @param dto 需要更新的部门
     * @return
     * @throws Exception
     */
    public boolean update(DepartmentDto dto) throws Exception;
}
