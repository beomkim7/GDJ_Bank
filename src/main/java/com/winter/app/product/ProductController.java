package com.winter.app.product;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.winter.app.util.Pager;

//annotation
@Controller
@RequestMapping("/product/*")
public class ProductController {
	
//	@Autowired
//	private ProductService productService;
	
//	@RequestMapping(value="add", method = RequestMethod.GET)
//	public void setAdd()throws Exception{}
//	
//	@RequestMapping(value ="list", method = RequestMethod.GET)
//	public String getList(Pager pager,Model model)throws Exception{
//		
//		List<ProductDTO> ar = productService.getList(pager);
//		
//		model.addAttribute("list", ar);
//		model.addAttribute("pager", pager);
//		
//		return "product/list";
//	}

}
