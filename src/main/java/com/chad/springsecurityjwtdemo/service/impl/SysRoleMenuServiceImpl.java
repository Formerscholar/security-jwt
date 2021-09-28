package com.chad.springsecurityjwtdemo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import java.util.List;
import com.chad.springsecurityjwtdemo.mapper.SysRoleMenuMapper;
import com.chad.springsecurityjwtdemo.model.SysRoleMenu;
import com.chad.springsecurityjwtdemo.service.SysRoleMenuService;
@Service
public class SysRoleMenuServiceImpl extends ServiceImpl<SysRoleMenuMapper, SysRoleMenu> implements SysRoleMenuService{

    @Override
    public int updateBatch(List<SysRoleMenu> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<SysRoleMenu> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<SysRoleMenu> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(SysRoleMenu record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(SysRoleMenu record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
