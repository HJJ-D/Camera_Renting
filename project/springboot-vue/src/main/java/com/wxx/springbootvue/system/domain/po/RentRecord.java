package com.wxx.springbootvue.system.domain.po;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;
import java.util.Date;

@Data
@TableName(value = "rent_record")
public class RentRecord implements Serializable {

    @TableId
    private Integer RenId;

    private Integer CameraId;

    private String RentorName;

    private String Phone;

    private String Address;

    private String WeChatId;

    private Date RentDate;

    private Date SendDate;

    private Date ReturnDate;

    private Date CreateDate;

}
