package com.cms.test;

import java.util.ArrayList;
import java.util.HashMap;

import org.junit.Test;

import com.cms.util.AsserUtil;

public class AsserTest {

	@Test
	public void fun1Test(){
		try {
			AsserUtil.isTrue(false, "�ⲻ��true");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun2Test(){
		try {
			AsserUtil.isFalse(true, "�ⲻ��false");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun3Test(){
		try {
			AsserUtil.isNotNull("", "�ⲻ��һ���ַ���");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Test
	public void fun4Test(){
		try {
			AsserUtil.isNull("�в���", "����һ���ַ���");
		} catch (Exception e) {
			e.printStackTrace();	
		}
	}
	
	@Test
	public void fun5Test(){
		try {
			ArrayList<Integer> arrayList = new ArrayList<Integer>();
			arrayList.add(5);
			AsserUtil.collectionNotNull(arrayList, "�ⲻ��һ�����ϻ��߼���Ϊ��");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void fun6Test(){
		
		try {
			HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
			hashMap.put(5, "week2");
			AsserUtil.mapNotNull(hashMap, "�ⲻ��һ��map���ϻ���map����Ϊ��");	
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	@Test
	public void fun7Test(){
		try {
			AsserUtil.hasTest("", "�ⲻ��һ���ַ���");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	@Test
	public void fun8Test(){
		try {
			AsserUtil.abInt(0, "�ⲻ��һ������");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
}
