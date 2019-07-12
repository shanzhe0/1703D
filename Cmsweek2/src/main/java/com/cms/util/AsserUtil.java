package com.cms.util;

import java.util.Collection;
import java.util.Map;

public class AsserUtil {

	//断言为真
	public static void isTrue(Boolean exp,String message){
		if(!Boolean.TRUE.equals(exp)){
			throw new WeekRuntimeException(message);
		}
	}
	
	//断言为假
	public static void isFalse(Boolean exp,String message){
		if(!Boolean.FALSE.equals(exp)){
			throw new WeekRuntimeException(message);
		}
	}
	
	
	//断言对象不为空
	public static void isNotNull(String exp,String message){
		if(exp==null || exp.length()==0){
			throw new WeekRuntimeException(message);
		}
	}
	
	
	//断言对象必须为空
	public static void isNull(String exp,String message){
		if(exp.length()>0){
			throw new WeekRuntimeException(message);
		}
	}
	
	//断言list或set集合不为空，没有元素也为空
	public static void collectionNotNull(Collection<?> col,String message){
		if(col==null || col.size()==0){
			throw new WeekRuntimeException(message);
		}
	}
	
	//断言map集合不为空 没有元素也为空
	public static void mapNotNull(Map<?, ?> map,String message){
		if(map==null || map.size()==0){
			throw new WeekRuntimeException(message);
		}
	}
	
	//断言字符串必须有值 去掉空格后 长度大于0
	public static void hasTest(String exp,String message){
		if(!(exp.trim().length()>0)){
			throw new WeekRuntimeException(message);
		}
	}
	
	
	//断言值必须是正数
	public static void abInt(int exp,String message){
		if(exp<=0){
			throw new WeekRuntimeException(message);
		}
	}
	
	
	
	
	
	
	
}
