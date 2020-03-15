package com.news.utils;

import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;
public class Layui extends HashMap<String, Object>{
	static Gson gson=new Gson();
	
	 public static Layui data(Integer count,List<?> data){
	        Layui r = new Layui();
	        r.put("code", 0);
	        r.put("msg", "");
	        r.put("count", count);
	        r.put("data", data);
	        return r;
	    }
	 public static <T> String Commonreturn(List<T> list){
		   Layui data = Layui.data(0, list);
		    String str = gson.toJson(data);
			return str; 
	 }
	 

}



