package com.winter.app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.winter.app.util.Pager;

public class ProductService {
	@Autowired
	private ProductDAO productDAO;
	
	public List<ProductDTO> getList(Pager pager)throws Exception{
		return productDAO.getList(pager);
	}
}
