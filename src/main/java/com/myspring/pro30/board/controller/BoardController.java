package com.myspring.pro30.board.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartHttpServletRequest;
import org.springframework.web.servlet.ModelAndView;


public interface BoardController {
	
	public ModelAndView listArticles(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public ResponseEntity addNewArticle(MultipartHttpServletRequest multipartRequest,HttpServletResponse response) throws Exception;
	
	public ModelAndView viewArticle(@RequestParam("articleNO") int articleNO,
			                        HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	public ResponseEntity  removeArticle(@RequestParam("articleNO") int articleNO,
                              HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	//시험용
	public ModelAndView replyForm(@RequestParam("articleNO") int articleNO,
			                       HttpServletRequest request, HttpServletResponse response) throws Exception; 
	//추가
	public ResponseEntity addReply(MultipartHttpServletRequest multipartRequest, HttpServletResponse response) throws Exception;

	//추가2 임의의 테스트 글 추가 코드
	public ModelAndView addNewTestArticle(HttpServletRequest request, HttpServletResponse response) throws Exception;
	
	//추가 3 임의의 테스트 글 삭제 코드
	public ModelAndView deleteTestArticle(HttpServletRequest request, HttpServletResponse response) throws Exception;
}
