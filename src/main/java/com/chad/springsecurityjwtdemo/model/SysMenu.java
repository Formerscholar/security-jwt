package com.chad.springsecurityjwtdemo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

@Data
@TableName(value = "springsecurityjwt.sys_menu")
public class SysMenu implements Serializable {
	@TableId(value = "menu_id", type = IdType.AUTO)
	private Integer menuId;
	
	@TableField(value = "name")
	private String name;
	
	@TableField(value = "permission")
	private String permission;
	
}