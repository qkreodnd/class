package test.file.action;

import java.io.File;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import test.controller.Action;
import test.controller.ActionForward;
import test.file.dao.FileDao;

public class FileDeleteAction extends Action {
	@Override
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) {
		//페이지 이동 list.jsp - delete.jsp - list.jsp
		//삭제할 파일의 번호를 읽어온다.
		int num = Integer.parseInt(request.getParameter("num"));
		//삭제할 파일의 저장된 파일명을 읽어온다.
		String saveFileName = FileDao.getInstance().getData(num).getSaveFileName();
		//1. DB에서 파일 정보 삭제
		FileDao.getInstance().delete(num);
		//2. 파일 시스템에서 삭제
		String path = request.getServletContext().getRealPath("/upload")+
					  File.separator+saveFileName;
		new File(path).delete();
		//3. list.jsp 페이지로 리다일렉트 이동(응답)
		// response.sendRedirect("list.jsp"); //상대경로
		
		// <a href="/Step05_FileUpload/file/list.jsp"></a>
		//javascript: location
		request.setAttribute("msg", "파일 삭제 성공");
		return new ActionForward("/views/file/alert.jsp");
	}
}
