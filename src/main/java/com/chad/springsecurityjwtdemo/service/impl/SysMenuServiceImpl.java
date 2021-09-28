package com.chad.springsecurityjwtdemo.service.impl;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.chad.springsecurityjwtdemo.mapper.SysMenuMapper;
import java.util.List;
import com.chad.springsecurityjwtdemo.model.SysMenu;
import com.chad.springsecurityjwtdemo.service.SysMenuService;
@Service
public class SysMenuServiceImpl extends ServiceImpl<SysMenuMapper, SysMenu> implements SysMenuService{

    @Override
    public int updateBatch(List<SysMenu> list) {
        return baseMapper.updateBatch(list);
    }
    @Override
    public int updateBatchSelective(List<SysMenu> list) {
        return baseMapper.updateBatchSelective(list);
    }
    @Override
    public int batchInsert(List<SysMenu> list) {
        return baseMapper.batchInsert(list);
    }
    @Override
    public int insertOrUpdate(SysMenu record) {
        return baseMapper.insertOrUpdate(record);
    }
    @Override
    public int insertOrUpdateSelective(SysMenu record) {
        return baseMapper.insertOrUpdateSelective(record);
    }
}
