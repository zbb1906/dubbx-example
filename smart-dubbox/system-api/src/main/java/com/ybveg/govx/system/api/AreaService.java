package com.ybveg.govx.system.api;

import com.ybveg.govx.system.model.dto.AreaDto;

/**
 * Created by KLJ on 2017/8/16.
 */
public interface AreaService {
    /**
     *
     * Created by KLJ on 2017-08-16 15:16:21
     * @param area 需要添加的Dto对象
     * @return true成功，false失败。
     * @throws Exception
     *
     */
    public boolean add(AreaDto area) throws Exception;

}
