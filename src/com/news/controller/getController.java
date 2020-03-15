package com.news.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.news.pojo.Comment;
import com.news.pojo.CommentExample;
import com.news.pojo.News;
import com.news.pojo.NewsExample;
import com.news.service.newsService;
import com.news.utils.Layui;

@Controller
public class getController {
	@Autowired
    private  newsService service;
	
	@RequestMapping("/custmain")
 	public String custmain(){
 		return "custmain";
 	}
	
	@RequestMapping("/sellers")
	public void  sellers(HttpServletRequest request,HttpServletResponse response, NewsExample sel,HttpSession session) {
		  try {
			  
			  List<News> sellelist= service.selectByExample(sel);
			  String commonreturn = Layui.Commonreturn(sellelist);
		        response.getWriter().write(commonreturn);
		} catch (Exception e) {
			e.printStackTrace();
		}
  }
	@RequestMapping("/comment")
	public void  comment(HttpServletRequest request,HttpServletResponse response, CommentExample sel,HttpSession session) {
		try {
			
			List<Comment> sellelist= service.selectCommentByExample(sel);
			String commonreturn = Layui.Commonreturn(sellelist);
			response.getWriter().write(commonreturn);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	 @RequestMapping("/newsshenhe")
		public void  newsshenhe(HttpServletRequest request,String id, HttpServletResponse response) throws IOException {
		 service.changestate(id);
		 response.getWriter().write("200");
	  	}
	 @RequestMapping("/commengtshenhe")
	 public void  commengtshenhe(HttpServletRequest request,String id, HttpServletResponse response) throws IOException {
		 service.changecommentstate(id);
		 response.getWriter().write("200");
	 }
	 
	 @RequestMapping("/delcommengtshenhe")
	 public void  delcommengtshenhe(HttpServletRequest request,String id, HttpServletResponse response) throws IOException {
		 service.deletecommentstate(id);
		 response.getWriter().write("200");
	 }
	 @RequestMapping("/alternewsshenhe")
	 public void  alternewsshenhe(HttpServletRequest request,String id, HttpServletResponse response) throws IOException {
		 service.alternewsshenhe(id);
		 response.getWriter().write("200");
	 }
	 @RequestMapping("/tuijiannewsshenhe")
	 public void  tuijiannewsshenhe(HttpServletRequest request,String id, HttpServletResponse response) throws IOException {
		 service.tuijiannewsshenhe(id);
		 response.getWriter().write("200");
	 }

}
