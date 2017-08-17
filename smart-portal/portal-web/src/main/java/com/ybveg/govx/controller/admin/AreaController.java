package com.ybveg.govx.controller.admin;

import com.alibaba.dubbo.config.annotation.Reference;
import com.sun.org.apache.bcel.internal.generic.RETURN;
import com.ybveg.govx.mvc.R;
import com.ybveg.govx.system.api.AreaService;
import com.ybveg.govx.system.model.dto.AreaDto;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * create by KLJ on 2017-08-16 16:34:35
 */
@RestController
@RequestMapping("admin/area")
public class AreaController {

    @Reference
    AreaService service;

    /**
     * 添加区域
     * create by KLJ on 2017-08-17 09:33:49
     * @param dto
     * @return
     * @throws Exception
     */
    @PostMapping("add")
    public Object add(AreaDto dto) throws Exception {
        return service.add(dto);
    }

    /**
     * 删除区域
     * create by KLJ on 2017-08-17 09:38:45
     * @param id 删除区域的Id
     * @return
     * @throws Exception
     */
    @PostMapping("delete")
    public Object delete(String id) throws Exception {
        return R.ok(service.delete(id));
    }

    /**
     * 更新区域
     * create by KLJ on 2017-08-17 09:38:45
     * @param dto 更新区域的对象
     * @return
     */
    @PostMapping("update")
    public Object update(AreaDto dto) {
        return R.ok();
    }

    /**
     * 查询分页
     * create by KLJ on 2017-08-17 09:40:15
     * @param params 查询参数
     * @param size  查询几条数据
     * @param num   第几页
     * @return
     * @throws Exception
     */
    @PostMapping("page/{size}/{num}")
    public R list(@RequestBody Map<String, Object> params, int size, int num) throws Exception {
        return R.ok(service.list(params,size,num));
    }

    @PostMapping("search")
    public Object search() {
        return "";
    }
}
