package com.ybveg.govx.system.api;

import com.github.pagehelper.PageInfo;
import com.ybveg.govx.system.model.dto.AreaDto;
import com.ybveg.govx.system.model.po.Area;

import java.util.List;
import java.util.Map;

/**
 * Created by KLJ on 2017/8/16.
 */
public interface AreaService {
    /**
     * Created by KLJ on 2017-08-16 15:16:21
     * @param area 需要添加的Dto对象
     * @return true成功，false失败。
     * @throws Exception
     *
     */
    public boolean add(AreaDto area) throws Exception;

    /**
     * Created by KLJ on 2017-08-16 16:37:46
     * @param params    查询参数
     * @param size  查询数量
     * @param num   查也页码
     * @return  返回查询的分页集合
     * @throws Exception
     */
    public PageInfo<Map<String,Object>> list(Map<String,Object> params, int size, int num) throws Exception;

    /**
     * Created by KLJ on 2017-08-17 10:30:06
     * @param code 删除区域的code
     * @return
     * @throws Exception
     */
    public boolean delete(String code) throws Exception;

    /**
     * 根据父Code查询集合
     * Created by KLJ on 2017-08-17 10:45:30
     * @param parentCode 父Code
     * @return
     * @throws Exception
     */
    public List<Area> listByParentCode(String parentCode) throws Exception;
}
