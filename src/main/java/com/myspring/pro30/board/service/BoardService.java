package com.myspring.pro30.board.service;

import java.util.List;
import java.util.Map;

import com.myspring.pro30.board.vo.ArticleVO;

public interface BoardService {
	//public List<ArticleVO> listArticles() throws Exception;
	Map listArticles(Map pagingMap) throws Exception;
	public int addNewArticle(Map articleMap) throws Exception;
	//public ArticleVO viewArticle(int articleNO) throws Exception; 다중 이미지첨부로 바뀜에 따라 이건 주석처리
	public Map viewArticle(int articleNO) throws Exception;
	public void modArticle(Map articleMap) throws Exception;
	public void removeArticle(int articleNO) throws Exception;
	
	// 임의의 테스트 글 추가 코드
	public void addNewTestArticle(int number) throws Exception;
	
	//임의의 테스트 글 삭제 코드
	public void deleteTestArticle(int deleteNumber) throws Exception;
}
