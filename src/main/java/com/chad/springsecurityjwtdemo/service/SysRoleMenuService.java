package com.chad.springsecurityjwtdemo.service;

import java.util.List;
import com.chad.springsecurityjwtdemo.model.SysRoleMenu;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SysRoleMenuService extends IService<SysRoleMenu>{


    int updateBatch(List<SysRoleMenu> list);

    int updateBatchSelective(List<SysRoleMenu> list);

    int batchInsert(List<SysRoleMenu> list);

    int insertOrUpdate(SysRoleMenu record);

    int insertOrUpdateSelective(SysRoleMenu record);

}
