package com.ybveg.govx.system.api;

import com.ybveg.govx.system.model.dto.AreaDto;

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
    public List<Map<String,Object>> list(Map<String,Object> params,int size,int num) throws Exception;

    public boolean delete(String id) throws Exception;
}
