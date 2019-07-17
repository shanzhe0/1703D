package com.cms.pojo;

import java.util.List;

public class Pop {

	private int pid;
	private String pname;
	public List<Store> stores;
	public Pop(int pid, String pname, List<Store> stores) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.stores = stores;
	}
	@Override
	public String toString() {
		return "Pop [pid=" + pid + ", pname=" + pname + ", stores=" + stores
				+ "]";
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public List<Store> getStores() {
		return stores;
	}
	public void setStores(List<Store> stores) {
		this.stores = stores;
	}
	
	public Pop(){
		
	}
	
}
