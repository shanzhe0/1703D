package com.cms.pojo;

public class Main {

	private int mid;
	private int sid;
	private int pid;
	@Override
	public String toString() {
		return "Main [mid=" + mid + ", sid=" + sid + ", pid=" + pid + "]";
	}
	public Main(int mid, int sid, int pid) {
		super();
		this.mid = mid;
		this.sid = sid;
		this.pid = pid;
	}
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	
	
	
}
