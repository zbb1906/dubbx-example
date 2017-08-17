package com.ybveg.govx.controller.admin;

import com.alibaba.dubbo.config.annotation.Reference;
import com.ybveg.govx.mvc.R;
import com.ybveg.govx.system.api.AreaService;
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

    @RequestMapping("add")
    public Object add() {
        return "";
    }

    @RequestMapping("delete")
    public Object delete() {
        return "";
    }

    @RequestMapping("update")
    public Object update() {
        return "";
    }

    @PostMapping("page/{size}/{num}")
    public R list(@RequestBody Map<String, Object> params, int size, int num) {

        return R.ok();
    }

    @RequestMapping("search")
    public Object search() {
        return "";
    }
}
