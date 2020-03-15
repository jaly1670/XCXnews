package com.news.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.news.pojo.NewsAdmin;
import com.news.service.newsService;

/**
 * 
 * 后台页面跳转的controller
 */
@Controller
@RequestMapping("/change")
public class changeController {
	
	@Autowired
    private  newsService service;
	
	@RequestMapping("/welcome")
	public String welcome(){
		return "welcome";
	}
	
	@RequestMapping("/comment")
	public String personorder(){
		return "comment";
	}
	
	@RequestMapping("/news")
	public String personzuche(){
		return "news";
	}
	
	@RequestMapping("/customerlogin")
	public String customerlogin(){
		return "login";
	}
	//用户登录的校验
	 @RequestMapping("/useinfocheck")
		public void  useinfocheck(HttpServletRequest request,HttpServletResponse response,HttpSession session) throws IOException {
			  try {
				  String state = request.getParameter("state");
				  String username = request.getParameter("custName");
				  String password = request.getParameter("custPassworld");
				  if(state.equals("1")){
					 
				 	List<NewsAdmin> aa=  service.byusername(username);
					 if (aa!=null&&aa.size()>0) {  
				     String ss = aa.get(0).getPassworld();
				     if(ss.equals(password)){
				    		session.setAttribute("username", username);
				    	 response.getWriter().write("100");
				    	 return;
				     }
				     else{
				    	 response.getWriter().write("200");
				    	 return;
				     }
				  }
			  }
				 
			 response.getWriter().write("300");
			} catch (Exception e) {
				e.printStackTrace();
				 response.getWriter().write("500");
			}
	  	} 
	 
	   

}
