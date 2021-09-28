package com.chad.springsecurityjwtdemo.model;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

import lombok.Data;

@Data
@TableName(value = "springsecurityjwt.sys_role_menu")
public class SysRoleMenu implements Serializable {
	@TableId(value = "id", type = IdType.AUTO)
	private Integer id;
	
	@TableField(value = "role_id")
	private Integer roleId;
	
	@TableField(value = "menu_id")
	private Integer menuId;
	
}