package sec05.ex01;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/cset")
public class SetServletContext extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		ServletContext  ctx=getServletContext(); //컨텍스트 범위에서 값을 저장함, 같은 컨텍스트내에서 값 공유할 수 있음 
		
		List list=new ArrayList();
		list.add("홍일동");
		list.add("홍이동");
		
		ctx.setAttribute("k", list);
		System.out.println("컨텍스트에 값을 저장함");
	}

}
