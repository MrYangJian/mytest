package com.itheima.springmvc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.itheima.springmvc.domain.Item;
@Controller
public class ItemController {
    @RequestMapping("/itemList.action")
	public ModelAndView ItemList(){
		ModelAndView mav = new ModelAndView();
		List<Item> list = new ArrayList<>();
		list.add(new Item(1, "1��Ϊ ��ҫ8", 2399f, new Date(), "�����ã�1"));
		list.add(new Item(2, "2��Ϊ ��ҫ8", 2399f, new Date(), "�����ã�2"));
		list.add(new Item(3, "3��Ϊ ��ҫ8", 2399f, new Date(), "�����ã�3"));
		list.add(new Item(4, "4��Ϊ ��ҫ8", 2399f, new Date(), "�����ã�4"));
		list.add(new Item(5, "5��Ϊ ��ҫ8", 2399f, new Date(), "�����ã�5"));
		list.add(new Item(6, "6��Ϊ ��ҫ8", 2399f, new Date(), "�����ã�6"));

		mav.addObject(list);
		mav.setViewName("itemList");
		return mav;
	}	
}
