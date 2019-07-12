package com.cms.util;

import java.util.Collection;
import java.util.Map;

public class AsserUtil {

	//����Ϊ��
	public static void isTrue(Boolean exp,String message){
		if(!Boolean.TRUE.equals(exp)){
			throw new WeekRuntimeException(message);
		}
	}
	
	//����Ϊ��
	public static void isFalse(Boolean exp,String message){
		if(!Boolean.FALSE.equals(exp)){
			throw new WeekRuntimeException(message);
		}
	}
	
	
	//���Զ���Ϊ��
	public static void isNotNull(String exp,String message){
		if(exp==null || exp.length()==0){
			throw new WeekRuntimeException(message);
		}
	}
	
	
	//���Զ������Ϊ��
	public static void isNull(String exp,String message){
		if(exp.length()>0){
			throw new WeekRuntimeException(message);
		}
	}
	
	//����list��set���ϲ�Ϊ�գ�û��Ԫ��ҲΪ��
	public static void collectionNotNull(Collection<?> col,String message){
		if(col==null || col.size()==0){
			throw new WeekRuntimeException(message);
		}
	}
	
	//����map���ϲ�Ϊ�� û��Ԫ��ҲΪ��
	public static void mapNotNull(Map<?, ?> map,String message){
		if(map==null || map.size()==0){
			throw new WeekRuntimeException(message);
		}
	}
	
	//�����ַ���������ֵ ȥ���ո�� ���ȴ���0
	public static void hasTest(String exp,String message){
		if(!(exp.trim().length()>0)){
			throw new WeekRuntimeException(message);
		}
	}
	
	
	//����ֵ����������
	public static void abInt(int exp,String message){
		if(exp<=0){
			throw new WeekRuntimeException(message);
		}
	}
	
	
	
	
	
	
	
}
