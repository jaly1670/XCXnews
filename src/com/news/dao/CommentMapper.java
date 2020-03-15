package com.news.dao;

import com.news.pojo.Comment;
import com.news.pojo.CommentExample;
import com.news.pojo.News;

import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CommentMapper {
    int countByExample(CommentExample example);

    int deleteByExample(CommentExample example);

    int insert(Comment record);

    int insertSelective(Comment record);

    List<Comment> selectByExample(CommentExample example);

    int updateByExampleSelective(@Param("record") Comment record, @Param("example") CommentExample example);

    int updateByExample(@Param("record") Comment record, @Param("example") CommentExample example);

	List<Comment> selectbynews(String id);

	void changecommentstate(String id);

	void delete(String id);
}