package sec05.ex02;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/initMenu")
public class ContextParamServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		ServletContext ctx=getServletContext();
		
//		System.out.println(ctx.getInitParameter("menu_member"));
		
		
		request.setCharacterEncoding("utf-8");
	      response.setContentType("text/html;charset=utf-8");
	      PrintWriter out = response.getWriter();
	      ServletContext context = getServletContext();
	      System.out.println(context.getContextPath());

	      String menu_member = context.getInitParameter("menu_member"); // 컨텍스트 파라미터를 가져옴
	      String menu_order = context.getInitParameter("menu_order");
	      String menu_goods =context.getInitParameter("menu_goods");

	      out.print("<html><body>");
	      out.print("<table border=1 cellspacing=0><tr>메뉴 이름</tr>");
	      out.print("<tr><td>" + menu_member + "</td></tr>");
	      out.print("<tr><td>" + menu_order + "</td></tr>");
	      out.print("<tr><td>" + menu_goods + "</td></tr>");
	      out.print("</tr></table></body></html>");
	      
//	      List list=(List) context.getAttribute("k");
//	      System.out.println(list.get(0));
	}

}