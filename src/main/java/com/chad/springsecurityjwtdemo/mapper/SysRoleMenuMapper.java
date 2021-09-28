package com.chad.springsecurityjwtdemo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.chad.springsecurityjwtdemo.model.SysRoleMenu;
import java.util.List;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface SysRoleMenuMapper extends BaseMapper<SysRoleMenu> {
    int updateBatch(List<SysRoleMenu> list);

    int updateBatchSelective(List<SysRoleMenu> list);

    int batchInsert(@Param("list") List<SysRoleMenu> list);

    int insertOrUpdate(SysRoleMenu record);

    int insertOrUpdateSelective(SysRoleMenu record);
}