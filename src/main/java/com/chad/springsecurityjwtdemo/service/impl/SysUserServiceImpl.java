package com.chad.springsecurityjwtdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.chad.springsecurityjwtdemo.mapper.SysUserMapper;
import com.chad.springsecurityjwtdemo.model.SysMenu;
import com.chad.springsecurityjwtdemo.model.SysRole;
import com.chad.springsecurityjwtdemo.model.SysUser;
import com.chad.springsecurityjwtdemo.security.SelfUserDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chad.springsecurityjwtdemo.security.SelfUserEntity;
import com.chad.springsecurityjwtdemo.service.SysUserService;

@Service
public class SysUserServiceImpl extends ServiceImpl<SysUserMapper, SysUser> implements SysUserService {

	
	@Override
	public int updateBatch(List<SysUser> list) {
		return baseMapper.updateBatch(list);
	}
	
	@Override
	public int updateBatchSelective(List<SysUser> list) {
		return baseMapper.updateBatchSelective(list);
	}
	
	@Override
	public int batchInsert(List<SysUser> list) {
		return baseMapper.batchInsert(list);
	}
	
	@Override
	public int insertOrUpdate(SysUser record) {
		return baseMapper.insertOrUpdate(record);
	}
	
	@Override
	public int insertOrUpdateSelective(SysUser record) {
		return baseMapper.insertOrUpdateSelective(record);
	}
	

	@Override
	public List<SysMenu> selectSysMenuByUserId(Integer id) {
		return baseMapper.selectSysMenuByUserId(id);
	}
	
	@Override
	public List<SysRole> selectSysRoleByUserId(Integer id) {
		return baseMapper.selectSysRoleByUserId(id);
	}
	
	@Override
	public SysUser selectUserByName(String username) {
		QueryWrapper<SysUser> queryWrapper = new QueryWrapper<>();
		queryWrapper.lambda().eq(SysUser::getUsername,username);
		return this.baseMapper.selectOne(queryWrapper);
	}
}
