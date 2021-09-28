package com.chad.springsecurityjwtdemo.service;

import java.util.List;

import com.chad.springsecurityjwtdemo.model.SysUser;
import com.chad.springsecurityjwtdemo.security.SelfUserEntity;
import com.baomidou.mybatisplus.extension.service.IService;
import com.chad.springsecurityjwtdemo.model.SysMenu;
import com.chad.springsecurityjwtdemo.model.SysRole;

public interface SysUserService extends IService<SysUser> {
	
	
	int updateBatch(List<SysUser> list);
	
	int updateBatchSelective(List<SysUser> list);
	
	int batchInsert(List<SysUser> list);
	
	int insertOrUpdate(SysUser record);
	
	int insertOrUpdateSelective(SysUser record);
	
	
	List<SysMenu> selectSysMenuByUserId(Integer id);
	
	List<SysRole> selectSysRoleByUserId(Integer id);
	
	SysUser selectUserByName(String username);
}
