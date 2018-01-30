package example;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// 기존에 저장되어있던 쿠키의 값을 바꾸는 방법

public class ModifyCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		
		// 클라이언트에 저장된 쿠키 배열을 가져온다
		Cookie[] cookies = req.getCookies();
		
		// 쿠키 존재 체크
		if (cookies != null && cookies.length > 0) {
			
			// for문을 이용해 찾는 key가 있는지 찾고 새로 쿠키를 입력
			for (int i = 0; i < cookies.length; i++) {
				if (cookies[i].getName().equals("name")) {
					Cookie cookie = new Cookie("name", URLEncoder.encode("JSP프로그래밍", "utf-8"));
					resp.addCookie(cookie);
					break;
				}
			}
		}

		PrintWriter out = resp.getWriter();
		out.println("<h1>name 쿠키의 값을 변경합니다.</h1>");

		out.flush();
		out.close();
	}
}
