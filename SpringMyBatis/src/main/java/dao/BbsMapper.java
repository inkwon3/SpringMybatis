package dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.session.SqlSession;

import vo.BbsVO;

@Mapper
public class BbsMapper {
	//SqlSession
	private SqlSession sqlSession;
	
	//setter
	public void setSqlSession(SqlSession sqlSession) {
		this.sqlSession = sqlSession;
	}
	
	public List<BbsVO> selectList(){
		return sqlSession.selectList("bbs.list");
	}
	
	public int insert(BbsVO vo) {
		return sqlSession.insert("bbs.insert", vo);
	}
	
	public BbsVO selectBbs(int bbsID) {
		return sqlSession.selectOne("bbs.selectBbs", bbsID);
	}
	
	public void updateBbs(BbsVO vo) {
		sqlSession.update("bbs.updateBbs", vo);
	}
	
	public void deleteBbs(int bbsID) {
		sqlSession.delete("bbs.deleteBbs", bbsID);
	}
	
	public void writeBbs(BbsVO vo) {
		int bbsID = sqlSession.selectOne("bbs.selectbbsID");
		vo.setBbsID(bbsID);
		sqlSession.insert("bbs.insertBbs", vo);
	}
}
