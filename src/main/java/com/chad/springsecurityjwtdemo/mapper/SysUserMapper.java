package com.chad.springsecurityjwtdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chad.springsecurityjwtdemo.model.SysUser;
import com.chad.springsecurityjwtdemo.security.SelfUserEntity;

import java.util.List;

import com.chad.springsecurityjwtdemo.model.SysMenu;
import com.chad.springsecurityjwtdemo.model.SysRole;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysUserMapper extends BaseMapper<SysUser> {
	int updateBatch(List<SysUser> list);
	
	int updateBatchSelective(List<SysUser> list);
	
	int batchInsert(@Param("list") List<SysUser> list);
	
	int insertOrUpdate(SysUser record);
	
	int insertOrUpdateSelective(SysUser record);
	
	List<SysMenu> selectSysMenuByUserId(Integer id);
	
	List<SysRole> selectSysRoleByUserId(Integer id);
}