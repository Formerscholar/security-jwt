package com.chad.springsecurityjwtdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chad.springsecurityjwtdemo.model.SysMenu;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysMenuMapper extends BaseMapper<SysMenu> {
    int updateBatch(List<SysMenu> list);

    int updateBatchSelective(List<SysMenu> list);

    int batchInsert(@Param("list") List<SysMenu> list);

    int insertOrUpdate(SysMenu record);

    int insertOrUpdateSelective(SysMenu record);
}