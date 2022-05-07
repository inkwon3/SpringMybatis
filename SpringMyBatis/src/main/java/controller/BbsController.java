package controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import service.BbsService;
import vo.BbsVO;

@Controller
public class BbsController {
	
	private String path = "/WEB-INF/views";
	
	@Autowired
	private service.BbsService bbsService;
	@Autowired
	private BbsVO bbsVO;
	
	public BbsController(BbsService bbsService) {
		this.bbsService = bbsService;
	}
	
	public BbsController() {
	}

	@RequestMapping({"/list", "/"})
	public String list(Model model) {
		List<BbsVO> list = bbsService.selectList();
		
		model.addAttribute("list", list);
		
		return path + "/bbs/list.jsp";
	}
	
	@RequestMapping({"/view"})
	public String view(Model model, @RequestParam int bbsID) {
		BbsVO bbsVO = bbsService.selectBbs(bbsID);
		
		model.addAttribute("bbsVO", bbsVO);
		
		return path + "/bbs/view.jsp";
	}
	
	@RequestMapping({"/updateForm"})
	public String updateForm(Model model, @RequestParam int bbsID) {
		BbsVO bbsVO = bbsService.selectBbs(bbsID);
		
		model.addAttribute("bbsVO", bbsVO);
		
		return path + "/bbs/update.jsp";
	}
	
	@RequestMapping({"/writeForm"})
	public String writeFrom(Model model) {
		
		return path + "/bbs/write.jsp";
	}
	
	@RequestMapping({"/update"})
	public String update(Model model, @RequestParam int bbsID, @RequestParam String bbsTitle, @RequestParam String bbsContent) {
		BbsVO bbsVO = this.bbsVO;
		bbsVO.setBbsID(bbsID);
		bbsVO.setBbsTitle(bbsTitle);
		bbsVO.setBbsContent(bbsContent);
		bbsService.updateBbs(bbsVO);
		
		return "view?=" + bbsID;
	}
	
	@RequestMapping({"/delete"})
	public String delete(Model model, @RequestParam int bbsID) {
		bbsService.deleteBbs(bbsID);
		
		return path + "/bbs/delete.jsp";
	}
	
	@RequestMapping({"/write"})
	public String write(Model model, @RequestParam String userID, @RequestParam String bbsTitle, @RequestParam String bbsContent) {
		BbsVO bbsVO = this.bbsVO;
		bbsVO.setUserID(userID);
		bbsVO.setBbsTitle(bbsTitle);
		bbsVO.setBbsContent(bbsContent);
		bbsService.writeBbs(bbsVO);
		
		return "list";
	}
}
