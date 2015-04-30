package com.dta.beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name="hello")
@SessionScoped
public class HelloBean {
	
	private String h = "hello from bean";

	public String getHello() {
		return h;
	}

	public void setHello(String hello) {
		this.h = hello;
	}
}
