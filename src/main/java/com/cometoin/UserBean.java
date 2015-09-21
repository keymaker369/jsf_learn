package com.cometoin;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class UserBean {

	private Long userId;
	
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
}
