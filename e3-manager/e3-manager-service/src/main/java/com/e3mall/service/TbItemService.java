package com.e3mall.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.e3mall.mapper.TbItemMapper;
import com.e3mall.pojo.TbItem;

@Service
public class TbItemService {

	
	@Autowired
	private TbItemMapper tbItemMapper;
	
	public TbItem get(Long id) {
		return tbItemMapper.selectByPrimaryKey(id);
	}
}
