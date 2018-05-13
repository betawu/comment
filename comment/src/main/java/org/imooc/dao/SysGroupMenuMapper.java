package org.imooc.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.imooc.bean.SysGroupMenu;
import org.imooc.bean.SysGroupMenuExample;

public interface SysGroupMenuMapper {
    int countByExample(SysGroupMenuExample example);

    int deleteByExample(SysGroupMenuExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysGroupMenu record);

    int insertSelective(SysGroupMenu record);

    List<SysGroupMenu> selectByExample(SysGroupMenuExample example);

    SysGroupMenu selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysGroupMenu record, @Param("example") SysGroupMenuExample example);

    int updateByExample(@Param("record") SysGroupMenu record, @Param("example") SysGroupMenuExample example);

    int updateByPrimaryKeySelective(SysGroupMenu record);

    int updateByPrimaryKey(SysGroupMenu record);
}