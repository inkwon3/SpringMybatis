package service;

import java.util.List;

import org.springframework.stereotype.Service;

import vo.BbsVO;

@Service
public interface BbsService {
	public List<BbsVO> selectList();
	
	public BbsVO selectBbs(int bbsID);
	
	public void updateBbs(BbsVO bbsVO);
	
	public void deleteBbs(int bbsID);
	
	public void writeBbs(BbsVO bbsVO);
}
