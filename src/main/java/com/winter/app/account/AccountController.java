package com.winter.app.account;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.winter.app.member.MemberDTO;
import com.winter.app.product.ProductDTO;

@Controller
@RequestMapping("/account/*")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@GetMapping("add")
	public String setAdd(AccountDTO accountDTO)throws Exception{
		return "account/add";
	}
	@PostMapping("add")
	public String setAdd(AccountDTO accountDTO,HttpSession session,Model model)throws Exception {
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		accountDTO.setUserName(memberDTO.getUserName());
		
		
		accountDTO.setProductNum(productDTO.getProductNum());
		
		int result = accountService.setAdd(accountDTO);
		
		String msg = "등록 실패";
		if(result>1) {
			msg="등록 성공";
		}
		
		model.addAttribute("msg", msg);
		model.addAttribute("path", "../");
		return "commons/result";
	}
	@GetMapping("list")
	public String getList(AccountDTO accountDTO)throws Exception{
		accountService.getList(accountDTO);
		return "account/list";
	}
	
}
