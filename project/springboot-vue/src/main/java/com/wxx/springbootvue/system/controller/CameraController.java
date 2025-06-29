package com.wxx.springbootvue.system.controller;

import com.github.pagehelper.PageInfo;
import com.wxx.springbootvue.system.service.RoleService;
import com.wxx.springbootvue.utils.RespBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author HJJ
 * @date 2025/2/14
 * Camera控制层
 */
@RestController
@RequestMapping("/system/camera")
public class CameraController {

    @Autowired
    private RoleService roleService;

    @GetMapping
    @PreAuthorize("@wx.check('role:list')")
    public RespBean roleList() {
        return RespBean.successData(roleService.getRoleList());
    }

    @GetMapping(value = "/roleListPage")
    @PreAuthorize("@wx.check('role:list')")
    public RespBean roleListPage(PageInfo pageInfo) {
        return RespBean.successData(roleService.getRoleList());
    }
}
