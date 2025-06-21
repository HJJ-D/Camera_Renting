package com.wxx.springbootvue.system.service;

import com.github.pagehelper.PageInfo;
import com.wxx.springbootvue.system.domain.po.Camera;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;
import java.util.List;

/**
 * @author 她爱微笑
 * @date 2020/3/14
 */
public interface CameraService {

    /**
     * 获取相机列表
     * @return
     */
    List<Camera> getAllCamera();

}
