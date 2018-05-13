package org.imooc.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.imooc.bean.SysParam;
import org.imooc.bean.SysParamExample;

public interface SysParamMapper {
    int countByExample(SysParamExample example);

    int deleteByExample(SysParamExample example);

    int insert(SysParam record);

    int insertSelective(SysParam record);

    List<SysParam> selectByExample(SysParamExample example);

    int updateByExampleSelective(@Param("record") SysParam record, @Param("example") SysParamExample example);

    int updateByExample(@Param("record") SysParam record, @Param("example") SysParamExample example);
}