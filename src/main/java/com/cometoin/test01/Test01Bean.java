package com.cometoin.test01;

import javax.faces.bean.ManagedBean;

@ManagedBean
public class Test01Bean {

	private Long userId;
	
	public Long getUserId() {
		return userId;
	}
	
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	
	public void oneTwoChange() {
		System.out.println("userid: " + userId);
	}
	
}
