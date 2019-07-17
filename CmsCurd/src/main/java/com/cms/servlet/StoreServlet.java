package com.cms.servlet;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cms.pojo.Store;
import com.cms.service.StoreService;
import com.github.pagehelper.PageInfo;

@Controller
public class StoreServlet {

	@Autowired
	private StoreService storeService;
	
	@RequestMapping("/liststore")
	public ModelAndView liststore(Store store,@RequestParam(required=false,defaultValue="1")int page,@RequestParam(required=false,defaultValue="3")int rows){
		ModelAndView view = new ModelAndView();
		List<Store> list = storeService.liststore(store, page, rows);
		view.addObject("stroes",new PageInfo<Store>(list));
		 view.addObject("store",store);
		 view.addObject("page",page);
		 view.addObject("rows",rows);
		 view.setViewName("liststore");
		return view;
		
	}
	
}
