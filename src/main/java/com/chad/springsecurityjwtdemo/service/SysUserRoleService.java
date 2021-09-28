package com.chad.springsecurityjwtdemo.service;

import com.chad.springsecurityjwtdemo.model.SysUserRole;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SysUserRoleService extends IService<SysUserRole>{


    int updateBatch(List<SysUserRole> list);

    int updateBatchSelective(List<SysUserRole> list);

    int batchInsert(List<SysUserRole> list);

    int insertOrUpdate(SysUserRole record);

    int insertOrUpdateSelective(SysUserRole record);

}
