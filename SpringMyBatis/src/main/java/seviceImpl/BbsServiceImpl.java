package seviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import dao.BbsMapper;
import service.BbsService;
import vo.BbsVO;

@Repository
public class BbsServiceImpl implements BbsService{
	
	@Autowired
	private BbsMapper bbsMapper;
	
	public BbsServiceImpl(BbsMapper bbsMapper) {
		this.bbsMapper = bbsMapper;
	}
	
	@Override
	public List<BbsVO> selectList(){
		return bbsMapper.selectList();
	}

	@Override
	public BbsVO selectBbs(int bbsID) {
		return bbsMapper.selectBbs(bbsID);
	}

	@Override
	public void updateBbs(BbsVO bbsVO) {
		bbsMapper.updateBbs(bbsVO);
	}

	@Override
	public void deleteBbs(int bbsID) {
		bbsMapper.deleteBbs(bbsID);
	}

	@Override
	public void writeBbs(BbsVO bbsVO) {
		bbsMapper.writeBbs(bbsVO);
	}
}
