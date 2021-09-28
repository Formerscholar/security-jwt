package com.chad.springsecurityjwtdemo.model;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName(value = "springsecurityjwt.sys_user")
public class SysUser implements Serializable {
	/**
	 *
	 */
	@TableId(value = "user_id", type = IdType.AUTO)
	private Integer userId;
	
	/**
	 *
	 */
	@TableField(value = "username")
	private String username;
	
	/**
	 *
	 */
	@TableField(value = "password")
	private String password;
	
}

