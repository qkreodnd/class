package test.action;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
/*
 *  대문 페이지(index 페이지) 를 출력해주는 액션 클래스 정의하기 
 */
public class HomeAction extends Action{

	@Override
	public ActionForward execute(HttpServletRequest request, 
			HttpServletResponse response) {
		//공지사항을 DB 에서 읽어왔다고 가정하자
		List<String> info=new ArrayList<>();
		info.add("오늘은 날씨가 좋아요!");
		info.add("MyBatis 를 배워 보아요.");
		info.add("어쩌구...");
		info.add("저쩌구...");
		//request 에 담고
		request.setAttribute("info", info);
		
		// index 페이지를 출력할 뷰 페이지로 forward 이동
		return new ActionForward("/views/home.jsp");
	}

}
















