package com.winter.app.member;

import java.util.List;

import javax.servlet.ServletContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import com.winter.app.util.FileManager;

@Service
public class MemberService {
	
	@Autowired
	MemberDAO memberDAO;
	@Autowired
	private FileManager fileManager;
	@Autowired
	private ServletContext servletContext;
	
	public MemberDTO getDetail(MemberDTO memberDTO)throws Exception{
		return memberDAO.getDetail(memberDTO);
	}
	
	public MemberDTO getLogin(MemberDTO memberDTO)throws Exception{
		MemberDTO m = memberDAO.getDetail(memberDTO);
		
		if(m !=null) {
			if(m.getPassword().equals(memberDTO.getPassword())) {
				return m;
			}else {
				m=null;
				//return null;
			}
		}
		
		return m;
	}
	
	public int setJoin(MemberDTO memberDTO, MultipartFile f) throws Exception{
		int result = memberDAO.setJoin(memberDTO);
		
		String path = servletContext.getRealPath("/resources/upload/member");
		
		
			if(f.isEmpty()) {
				return result;
			}
			String fileName = fileManager.fileSave(path, f);
			
			AvatarDTO avatarDTO=new AvatarDTO();
			avatarDTO.setFileName(fileName);
			avatarDTO.setOriName(f.getOriginalFilename());
			avatarDTO.setUserName(memberDTO.getUserName());
			result = memberDAO.setAvatarJoin(avatarDTO);
		
		
		return result;
	}
}
