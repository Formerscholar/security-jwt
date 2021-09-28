package com.chad.springsecurityjwtdemo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

@Data
@TableName(value = "springsecurityjwt.sys_role")
public class SysRole implements Serializable {
	@TableId(value = "role_id", type = IdType.AUTO)
	private Integer roleId;
	
	@TableField(value = "`role_name`")
	private String roleName;
}