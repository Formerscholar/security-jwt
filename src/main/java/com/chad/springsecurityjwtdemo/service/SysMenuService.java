package com.chad.springsecurityjwtdemo.service;

import java.util.List;
import com.chad.springsecurityjwtdemo.model.SysMenu;
import com.baomidou.mybatisplus.extension.service.IService;
public interface SysMenuService extends IService<SysMenu>{


    int updateBatch(List<SysMenu> list);

    int updateBatchSelective(List<SysMenu> list);

    int batchInsert(List<SysMenu> list);

    int insertOrUpdate(SysMenu record);

    int insertOrUpdateSelective(SysMenu record);

}
