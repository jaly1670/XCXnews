package com.news.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.fileupload.disk.DiskFileItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.google.gson.Gson;
import com.news.pojo.Comment;
import com.news.pojo.News;
import com.news.pojo.Order;
import com.news.service.newsService;
import com.news.utils.DateTimeHelper;
import com.news.utils.Layui;


@Controller
@RequestMapping("/news")
public class newsController {
	@Autowired
    private  newsService service;

	
	
	
	//新闻的查看
	@RequestMapping("/newsgetinfo")
	public void  newsgetinfo(HttpServletRequest request,HttpServletResponse response,String type) throws IOException{
		
		List<News> getlistinfo = service.getnewsgetinfo(type);
		 String commonreturn = Layui.Commonreturn(getlistinfo);
	        response.getWriter().write(commonreturn);
	}        
	
	//新闻的新增
	@RequestMapping(value = "/newsinsert", method = RequestMethod.POST)
	public void  newsinsert(HttpServletRequest request,HttpServletResponse response,News newsq) throws IOException{
		String nowDate = DateTimeHelper.getNowDate();	
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		String authon = request.getParameter("authon");
		String type = request.getParameter("type");
		String picture = request.getParameter("picture");
	 
		News news=new News();
		news.setPicture(picture);
		news.setType(type);
		news.setState(0+"");
		news.setTitle(title);
	//	byte[] bytes = content.getBytes();
		news.setContent(content);
		news.setTime(nowDate);
		news.setAuthon(authon);
	  service.savenewsinfo(news);
	        response.getWriter().write("100");
	}
	 
	
 
	@RequestMapping("uploadFile")
	@ResponseBody
    public String uploadImage(HttpServletRequest request, HttpServletResponse response) throws IOException {
        MultipartHttpServletRequest req =(MultipartHttpServletRequest)request;
        MultipartFile multipartFile =  req.getFile("file");
          String filename = request.getParameter("filename");
          
          String path = request.getContextPath();
          String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/"+"temp"+"/";
          System.out.println("sss"+basePath);
  	 	String realPath = request.getServletContext().getRealPath("temp");
  	  System.out.println("aaa"+realPath);
  		//String realPath = basePath+"/temp/"+filename;
          
     //   String realPath = "F:/image";
        try {
            File dir = new File(realPath);
            if (!dir.exists()) {
                dir.mkdir();
            }
            File file  =  new File(realPath,filename);
            multipartFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
        } catch (IllegalStateException e) {
            e.printStackTrace();
        }
  
 
        return basePath+filename;
    }
     
 
//通过主键获取对应的数据

@RequestMapping("/byidgetnews")
public void  byidgetnews(HttpServletRequest request,HttpServletResponse response,String id) throws IOException{
	   Gson gson=new Gson();
	    News getlistinfo = service.byidgetnews(Integer.valueOf(id));
	    String str = gson.toJson(getlistinfo); 
        response.getWriter().write(str);
}        
//通过id返回评论

	@RequestMapping("/byidgetcon")
	public void  byidgetcon(HttpServletRequest request,HttpServletResponse response,String id) throws IOException{
		   Gson gson=new Gson();
			List<Comment>  getlistinfo = service.byidgetcon(id);
		    String str = gson.toJson(getlistinfo); 
	        response.getWriter().write(str);
	}  
	//评论的后台保存
	
	@RequestMapping("/commentsave")
	public void  commentsave(HttpServletRequest request,HttpServletResponse response,Comment com) throws IOException{
		    
		String nowDate = DateTimeHelper.getNowTime();
		com.setTime(nowDate);
		com.setState(0+"");
		service.commentsave(com);
	       response.getWriter().write("100");
	}     

 

}
	 
