package com.cms.service;

import java.util.List;

import com.cms.pojo.Store;

public interface StoreService {

	public List<Store> liststore(Store store,int page,int rows);
}
