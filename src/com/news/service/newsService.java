package com.news.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.news.dao.CommentMapper;
import com.news.dao.NewsAdminMapper;
import com.news.dao.NewsMapper;
import com.news.dao.OrderMapper;
import com.news.dao.TypesMapper;
import com.news.pojo.Comment;
import com.news.pojo.CommentExample;
import com.news.pojo.News;
import com.news.pojo.NewsAdmin;
import com.news.pojo.NewsExample;
import com.news.pojo.Order;
import com.news.pojo.Types;


@Service
public class newsService {
	
	@Autowired
    private  NewsMapper nesmapper;
	
	@Autowired
    private  TypesMapper typemapper;
	

	@Autowired
    private  CommentMapper commapper;
	
	@Autowired
    private  NewsAdminMapper newsmapper;
	
	@Autowired
    private  OrderMapper ordermapper;
 



	public void savenewsinfo(News news) {
		// TODO Auto-generated method stub
		nesmapper.insert(news);
	}



	public List<News> getnewsgetinfo(String tuijian) {
		// TODO Auto-generated method stub
		return nesmapper.selectnews(tuijian);
	}



	public News byidgetnews(Integer id) {
		// TODO Auto-generated method stub
		return nesmapper.selectByPrimaryKey(id);
	}



	public void commentsave(Comment com1) {
		// TODO Auto-generated method stub
		commapper.insert(com1);
	}



	public List<Comment> byidgetcon(String id) {
		// TODO Auto-generated method stub
		return commapper.selectbynews(id);
	}



	public List<NewsAdmin> byusername(String username) {
		// TODO Auto-generated method stub
		return newsmapper.byusername(username);
	}



	public List<News> selectByExample(NewsExample sel) {
		// TODO Auto-generated method stub
		return nesmapper.selectByExample(null);
	}



	public void changestate(String id) {
		// TODO Auto-generated method stub
		nesmapper.changestate(id);
	}



	public List<Comment> selectCommentByExample(CommentExample sel) {
		// TODO Auto-generated method stub
		return commapper.selectByExample(null);
	}



	public void changecommentstate(String id) {
		// TODO Auto-generated method stub
		commapper.changecommentstate(id);
	}



	public void deletecommentstate(String id) {
		// TODO Auto-generated method stub
		commapper.delete(id);
	}



	public void alternewsshenhe(String id) {
		// TODO Auto-generated method stub
		nesmapper.delete(id);
	}



	public void tuijiannewsshenhe(String id) {
		// TODO Auto-generated method stub
		nesmapper.tuijiannewsshenhe(id);
	}



	public void ordersave(Order order) {
		// TODO Auto-generated method stub
		ordermapper.insert(order);
	}

 

 
 

}
