package com.cms.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.cms.util.AsserUtil;

public class AsserTest {

	@Test
	public void fun1Test(){
		try {
			AsserUtil.isTrue(false, "这不是true");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun2Test(){
		try {
			AsserUtil.isFalse(true, "这不是false");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun3Test(){
		try {
			AsserUtil.isNotNull("", "这不是一个字符串");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun4Test(){
		try {
			AsserUtil.isNull("中不中", "这是一个字符串");
		} catch (Exception e) {
			e.printStackTrace();	
		}
	}
	
	@Test
	public void fun5Test(){
		try {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			arrayList.add(5);
			AsserUtil.collectionNotNull(arrayList, "这不是一个集合或者集合为空");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void fun6Test(){
		
		try {
			HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
			hashMap.put(5, "week2");
			AsserUtil.mapNotNull(hashMap, "这不是一个map集合或者map集合为空");	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void fun7Test(){
		try {
			AsserUtil.hasTest("", "这不是一个字符串");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void fun8Test(){
		try {
			AsserUtil.abInt(0, "这不是一个正数");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}
