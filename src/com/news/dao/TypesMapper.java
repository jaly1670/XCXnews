package com.news.dao;

import com.news.pojo.Types;
import com.news.pojo.TypesExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TypesMapper {
    int countByExample(TypesExample example);

    int deleteByExample(TypesExample example);

    int insert(Types record);

    int insertSelective(Types record);

    List<Types> selectByExample(TypesExample example);

    int updateByExampleSelective(@Param("record") Types record, @Param("example") TypesExample example);

    int updateByExample(@Param("record") Types record, @Param("example") TypesExample example);
}