package com.news.pojo;

public class Comment {
	
	private int id;
    private String authon;

    private String type;

    private String time;

    private String newId;

    private String state;
    
    private String content;
    
    

    
    public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAuthon() {
        return authon;
    }

    public void setAuthon(String authon) {
        this.authon = authon == null ? null : authon.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time == null ? null : time.trim();
    }

    public String getNewId() {
        return newId;
    }

    public void setNewId(String newId) {
        this.newId = newId == null ? null : newId.trim();
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}