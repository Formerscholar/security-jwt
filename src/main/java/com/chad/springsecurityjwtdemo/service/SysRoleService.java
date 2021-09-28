package com.chad.springsecurityjwtdemo.service;

import com.chad.springsecurityjwtdemo.model.SysRole;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SysRoleService extends IService<SysRole>{


    int updateBatch(List<SysRole> list);

    int updateBatchSelective(List<SysRole> list);

    int batchInsert(List<SysRole> list);

    int insertOrUpdate(SysRole record);

    int insertOrUpdateSelective(SysRole record);

}
