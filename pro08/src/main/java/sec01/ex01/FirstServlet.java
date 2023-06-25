package sec01.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/first")
public class FirstServlet extends HttpServlet {


	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter  out=response.getWriter();
		out.print("<body>this is first page1</body>");
		
		
//		response.sendRedirect("second"); // 클라이언트의 요청에 특정 다른 위치로 재전송
		
//		response.addHeader("Refresh", "5;url=second"); //  응답 헤더에게 이름과 값을 추가해서 해당되는 초 후에 화면을 refresh
//		response.addHeader("Refresh", "1"); //  응답 헤더에게 이름과 값을 추가해서 해당되는 초 후에 화면을 refresh
		
		
		
	}

}
