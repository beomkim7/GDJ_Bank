package com.winter.app.member;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

@Controller
@RequestMapping("/member/*")
public class MemberContoller {
	@Autowired
	MemberService memberService;
	
	@GetMapping("update")
	public void setUpdate(HttpSession session,Model model)throws Exception{
		MemberDTO memberDTO = (MemberDTO)session.getAttribute("member");
		memberDTO=memberService.getDetail(memberDTO);
	}
	
	@PostMapping("update")
	public String setUpdate(MemberDTO memberDTO,HttpSession session)throws Exception{
		MemberDTO m = (MemberDTO)session.getAttribute("member");
		memberDTO.setUserName(m.getUserName());
	
		int result = memberService.setUpdate(memberDTO);
		
		
		return "redirect:./mypage";
	}
	
	@GetMapping("mypage")
	public void getMyPage(HttpSession session,Model model)throws Exception{
		MemberDTO memberDTO= (MemberDTO)session.getAttribute("member");
		memberDTO = memberService.getDetail(memberDTO);
		model.addAttribute("member", memberDTO);
	}
	
	@GetMapping("logout")
	public String getLogout(HttpSession session)throws Exception{
		//session.setAttribute("member", null);
//		session.removeAttribute("member");
//		session.removeValue("member");
		session.invalidate();
		return "redirect:../";
	}
	
	
	@GetMapping("login")
	public void getLogin()throws Exception{
		
	}
	
	@PostMapping("login")
	public String getLogin(MemberDTO memberDTO,HttpSession session,Model model)throws Exception{
		memberDTO = memberService.getLogin(memberDTO);
		System.out.println(memberDTO);
//		request.getSession()
		if(memberDTO == null) {
			model.addAttribute("msg", "ID 또는 PW확인");
			return "member/login";
		}
		session.setAttribute("member", memberDTO);
		System.out.println(memberDTO);
		return "redirect:../";
	}
	
	@GetMapping("join")
	public String setJoin(MemberDTO memberDTO) throws Exception{
		
		return "member/join";
	}
	@PostMapping("join")
	public String setJoin(MemberDTO memberDTO,Model model,MultipartFile photo)throws Exception{
		int result = memberService.setJoin(memberDTO,photo);
		
		String msg="등록 실패";
		if(result>0) {
			msg="등록성공";
		}
		
		model.addAttribute("msg", msg);
		model.addAttribute("path", "../");
		return "commons/result";
	}
}
