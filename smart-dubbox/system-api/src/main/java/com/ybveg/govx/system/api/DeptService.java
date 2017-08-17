package com.ybveg.govx.system.api;

import com.github.pagehelper.PageInfo;
import com.ybveg.govx.system.model.dto.DepartmentDto;
import com.ybveg.govx.system.model.po.User;

import java.util.List;
import java.util.Map;

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
     *
     * @param id
     * @return
     * @throws Exception
     */
    public boolean delete(String id) throws Exception;

    /**
     * 更新部门
     *
     * @param dto 需要更新的部门
     * @return
     * @throws Exception
     */
    public boolean update(DepartmentDto dto) throws Exception;

    /**
     * 查询部门list
     *
     * @param params
     * @param num
     * @param size
     * @return
     * @throws Exception
     */
    public PageInfo<Map<String, Object>> list(Map<String, Object> params, int num, int size) throws Exception;

    /**
     * 根据部门Id获取部门下面的用户
     * Created by KLJ on 2017-08-17 16:27:35
     * @param deptId
     * @return
     * @throws Exception
     */
    public List<User> getUserByDeptCode(String deptId) throws Exception;
    
}
