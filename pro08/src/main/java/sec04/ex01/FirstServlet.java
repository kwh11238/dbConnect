package sec04.ex01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
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
		out.print("<body>this is first page4</body>");
		
		
//		response.sendRedirect("second"); // 클라이언트의 요청에 특정 다른 위치로 재전송
		
//		response.addHeader("Refresh", "5;url=second"); //  응답 헤더에게 이름과 값을 추가해서 해당되는 초 후에 화면을 refresh
//		response.addHeader("Refresh", "1"); //  응답 헤더에게 이름과 값을 추가해서 해당되는 초 후에 화면을 refresh
		
		
//		out.print(" <script>location.href='http://www.naver.com'</script>");
//		out.print(" <script>location.href='second'</script>");
//		out.print(" <script>location.href='http://localhost:8090/pro08/second'</script>");
		
		
//		response.sendRedirect("second?sdjsjklsfdjklsfd=fdlfdfdl&sdkl=%ED%98%B8%EB%9E%91%EC%9D%B4");
		
//		String str=URLEncoder.encode("호랑이강아지","utf-8"); 
//		
//		
//		response.sendRedirect("second?sdjsjklsfdjklsfd=fdlfdfdl&sdkl=" +str);
		
		
		RequestDispatcher dispatcher =request.getRequestDispatcher("second?sdksfkl=jgjij"); // 매개변수에 들어간 경로를 가지고 RequestDispatcher 객체를 반환
		
		dispatcher.forward(request, response); //서블릿으로부터 들어온 요청을 다른 리소스에 보냄	
		
	}

}
