package sec05.ex02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//@WebServlet("/cfile")
public class ContextFileServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx=getServletContext();
		//웹컨텐츠의 루트는 webapp
		InputStream is= ctx.getResourceAsStream("/WEB-INF/file/init.txt");  // 경로에 있는 파일 자원을 입력스트림으로 반환
		
		// 파일 입출력시 입출력 성능 향상을 위해 버퍼드리더라는 보조스트림 이용
		BufferedReader buffer=new BufferedReader(new InputStreamReader(is));
		String str=null;
//		str = buffer.readLine();
		while( (str = buffer.readLine()) !=null ) {
			
			StringTokenizer token =new StringTokenizer(str,",");
//			System.out.println(token);
			String member=token.nextToken();
			System.out.println(member);
			String order=token.nextToken();
			System.out.println(order);
			String good=token.nextToken();
			System.out.println(good);
		}
		
		
	
		
	}

}
