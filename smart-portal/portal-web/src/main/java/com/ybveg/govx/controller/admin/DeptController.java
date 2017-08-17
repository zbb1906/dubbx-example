package com.ybveg.govx.controller.admin;

import com.ybveg.govx.mvc.R;
import com.ybveg.govx.system.api.DeptService;
import com.ybveg.govx.system.api.UserService;
import com.ybveg.govx.system.model.dto.DepartmentDto;
import jdk.nashorn.internal.ir.annotations.Reference;
import org.apache.commons.lang3.StringUtils;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("admin/dept")
public class DeptController {

    @Reference
    DeptService service;

    //  @Reference
    UserService userService;

    @RequestMapping("add")
    public R add(DepartmentDto dto) {

        return null;
    }

    @RequestMapping("delete")
    public R delete(String id) {
        return R.ok();
    }

    @RequestMapping("update")
    public R update() {
        return null;
    }

    @PostMapping("page/{size}/{num}")
    public R list(@RequestBody Map<String, Object> params, int size, int num) {
        return R.ok();
    }

    @PostMapping("search")
    public R search() {
        return null;
    }

    /**
     * 获取部门类型集合
     * Created by KLJ on 2017-08-17 11:02:51
     *
     * @return 返回部门类型的集合
     */
    @GetMapping("get/type")
    public R getDeptType() {
        return R.ok();
    }

    /**
     * 获取部门
     *
     * @param code
     * @return
     */
    @GetMapping("get/areas/{code}")
    public R getAreaByParentCode(String code) {
        code = StringUtils.isBlank(code) ? "" : code;//如果code为空，那么取Session中的Code
        return R.ok(service);
    }

    /**
     * 根据部门id，查询部门下面的用户
     * @param id 部门id
     * @return
     * @throws Exception
     */
    @GetMapping("get/users/{id}")
    public R getUserByDeptId(String id) throws Exception {
        return R.ok(userService.getUsersByDeptId(id));
    }

}
