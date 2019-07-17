package com.cms.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cms.dao.StoreDao;
import com.cms.pojo.Store;
import com.github.pagehelper.PageHelper;

@Service
public class StoreServiceImp implements StoreService{

	@Autowired
	private StoreDao storeDao;
	
	@Override
	public List<Store> liststore(Store store,int page,int rows) {
		PageHelper.startPage(page, rows);
		return storeDao.liststore(store);
	}

}
