package example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import util.CookieHelper;

public class LoginCheckServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		
		PrintWriter out = resp.getWriter();
		
		// CookieHelper의 생성자를 이용해 클라이언트에 저장되어있던 쿠키를 가져와서 CookieHelper내부에 있는 map에 저장
		CookieHelper cookies = new CookieHelper(req); 
		
		// AUTH라는 key를 가지는 쿠키가 있는지 확인
		if (cookies.exists("AUTH")) {
			String id = cookies.getValue("AUTH");
			out.println("아이디 '" + id + "' 로 로그인한 상태 <br>");
			out.println("<a href='logout.do'>로그아웃</a>");
		}
		else {
			out.println("로그인하지 않은 상태");
		}
	}

}
