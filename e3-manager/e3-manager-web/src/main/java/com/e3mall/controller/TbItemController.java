package com.e3mall.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.e3mall.pojo.TbItem;
import com.e3mall.service.TbItemService;

@Controller
@RequestMapping("/item")
public class TbItemController {
	
	@Autowired
	private TbItemService tbItemService;
	
	@ResponseBody
	@RequestMapping("/get/{id}")
	public TbItem get(@PathVariable("id") Long id) {
		return tbItemService.get(id);
	}

}
