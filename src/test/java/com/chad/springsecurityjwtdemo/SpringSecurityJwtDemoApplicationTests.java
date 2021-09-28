package com.chad.springsecurityjwtdemo;

import com.chad.springsecurityjwtdemo.model.SysUser;
import com.chad.springsecurityjwtdemo.security.SelfUserEntity;
import com.chad.springsecurityjwtdemo.model.SysUserRole;
import com.chad.springsecurityjwtdemo.service.SysUserRoleService;
import com.chad.springsecurityjwtdemo.service.SysUserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SpringBootTest
class SpringSecurityJwtDemoApplicationTests {
	
	@Autowired
	private SysUserService sysUserService;
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	@Autowired
	private SysUserRoleService sysUserRoleService;
	
	
	/**
	 * 注册用户
	 */
	@Test
	public void contextLoads() {
		// 注册用户
		SysUser sysUserEntity = new SysUser();
		sysUserEntity.setUsername("chad");
		sysUserEntity.setPassword(bCryptPasswordEncoder.encode("123456"));
		// 设置用户状态
		//sysUserEntity.setStatus("NORMAL");
		sysUserService.save(sysUserEntity);
		// 分配角色 1:ADMIN 2:USER
		SysUserRole sysUserRoleEntity = new SysUserRole();
		sysUserRoleEntity.setRoleId(2);
		sysUserRoleEntity.setUserId(sysUserEntity.getUserId());
		sysUserRoleService.save(sysUserRoleEntity);
	}
	
}
