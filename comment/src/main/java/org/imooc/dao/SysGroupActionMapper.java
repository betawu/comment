package org.imooc.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.imooc.bean.SysGroupAction;
import org.imooc.bean.SysGroupActionExample;

public interface SysGroupActionMapper {
    int countByExample(SysGroupActionExample example);

    int deleteByExample(SysGroupActionExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SysGroupAction record);

    int insertSelective(SysGroupAction record);

    List<SysGroupAction> selectByExample(SysGroupActionExample example);

    SysGroupAction selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SysGroupAction record, @Param("example") SysGroupActionExample example);

    int updateByExample(@Param("record") SysGroupAction record, @Param("example") SysGroupActionExample example);

    int updateByPrimaryKeySelective(SysGroupAction record);

    int updateByPrimaryKey(SysGroupAction record);
}