package com.news.dao;

import com.news.pojo.NewsAdmin;
import com.news.pojo.NewsAdminExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NewsAdminMapper {
    int countByExample(NewsAdminExample example);

    int deleteByExample(NewsAdminExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(NewsAdmin record);

    int insertSelective(NewsAdmin record);

    List<NewsAdmin> selectByExample(NewsAdminExample example);

    NewsAdmin selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") NewsAdmin record, @Param("example") NewsAdminExample example);

    int updateByExample(@Param("record") NewsAdmin record, @Param("example") NewsAdminExample example);

    int updateByPrimaryKeySelective(NewsAdmin record);

    int updateByPrimaryKey(NewsAdmin record);

	List<NewsAdmin> byusername(String username);

	void delete(String id);

 
}