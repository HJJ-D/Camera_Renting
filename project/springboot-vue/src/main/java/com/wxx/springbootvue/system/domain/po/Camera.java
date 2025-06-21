package com.wxx.springbootvue.system.domain.po;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.io.Serializable;
import lombok.Data;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

@Data
@TableName(value = "camera")
public class Camera implements Serializable {

    @TableId
    private Integer CameraId;

    private String CameraName;

}
