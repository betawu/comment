package org.imooc.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.imooc.bean.Dic;
import org.imooc.bean.DicExample;
import org.imooc.bean.DicKey;

public interface DicMapper {
    int countByExample(DicExample example);

    int deleteByExample(DicExample example);

    int deleteByPrimaryKey(DicKey key);

    int insert(Dic record);

    int insertSelective(Dic record);

    List<Dic> selectByExample(DicExample example);

    Dic selectByPrimaryKey(DicKey key);

    int updateByExampleSelective(@Param("record") Dic record, @Param("example") DicExample example);

    int updateByExample(@Param("record") Dic record, @Param("example") DicExample example);

    int updateByPrimaryKeySelective(Dic record);

    int updateByPrimaryKey(Dic record);
}