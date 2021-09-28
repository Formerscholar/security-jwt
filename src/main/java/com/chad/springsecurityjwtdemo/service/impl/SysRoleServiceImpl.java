package com.chad.springsecurityjwtdemo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chad.springsecurityjwtdemo.model.SysRole;
import java.util.List;
import com.chad.springsecurityjwtdemo.mapper.SysRoleMapper;
import com.chad.springsecurityjwtdemo.service.SysRoleService;
@Service
public class SysRoleServiceImpl extends ServiceImpl<SysRoleMapper, SysRole> implements SysRoleService{

    @Override
    public int updateBatch(List<SysRole> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<SysRole> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<SysRole> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(SysRole record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(SysRole record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
