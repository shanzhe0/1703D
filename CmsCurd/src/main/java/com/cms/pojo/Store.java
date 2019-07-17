package com.cms.pojo;

import java.util.List;

public class Store {

	private int sid;
	private String sname;
	private int sprice;
	private String sbate;
	public List<Pop> pops;
	
	
	
	public int getSid() {
		return sid;
	}



	public void setSid(int sid) {
		this.sid = sid;
	}



	public String getSname() {
		return sname;
	}



	public void setSname(String sname) {
		this.sname = sname;
	}



	public int getSprice() {
		return sprice;
	}



	public void setSprice(int sprice) {
		this.sprice = sprice;
	}



	public String getSbate() {
		return sbate;
	}



	public void setSbate(String sbate) {
		this.sbate = sbate;
	}



	public List<Pop> getPops() {
		return pops;
	}



	public void setPops(List<Pop> pops) {
		this.pops = pops;
	}



	@Override
	public String toString() {
		return "Store [sid=" + sid + ", sname=" + sname + ", sprice=" + sprice
				+ ", sbate=" + sbate + ", pops=" + pops + "]";
	}



	public Store(int sid, String sname, int sprice, String sbate, List<Pop> pops) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.sprice = sprice;
		this.sbate = sbate;
		this.pops = pops;
	}



	public Store(){
		
	}
	
	
}
