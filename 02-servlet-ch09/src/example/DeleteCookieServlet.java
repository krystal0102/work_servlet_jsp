package example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteCookieServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html; charset=utf-8");
		
		Cookie[] cookies = req.getCookies();
		
		if (cookies != null &&  cookies.length > 0) {
			for (int i = 0; i < cookies.length; i++) {
				
				// key가 name인 쿠키를 찾는다
				if (cookies[i].getName().equals("name")) {
					
					// 해당 쿠키 값을 삭제. 삭제 메소드가 없어서 그냥 값을 비워주는것 -> ""
					Cookie cookie = new Cookie("name", "");
					
					// 해당 쿠키의 생존 기간을 0으로 설정
					cookie.setMaxAge(0);
					
					// 다시 클라이언트에게 해당 쿠키를 전달
					resp.addCookie(cookie);
				}
			}
		}
		
		PrintWriter out = resp.getWriter();
		out.println("<h1>name 쿠키를 삭제합니다.</h1>");

		out.flush();
		out.close();
		
		
	}
}
