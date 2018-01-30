package example;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// p.208 서블릿으로 구현
public class MakeCookieServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=utf-8");
		resp.setCharacterEncoding("utf-8");
		
		// "최범균" 문자열을 URL형식으로 변경하는데 UTF-8 인코딩을 사용하겠다
		String ecodeName = URLEncoder.encode("최범균", "utf-8");
		
		// 쿠키 객체 생성 -> name이라는 key에 encodeName 값을 저장
		Cookie cookie = new Cookie("name", ecodeName);
		cookie.setMaxAge(60 * 60 * 1000);
		
		// 만든 쿠키를 쿠키 목록에 추가 ; ArrayList같은 자료구조형태
		resp.addCookie(cookie);
		
		PrintWriter out = resp.getWriter();
		out.println(cookie.getName());	// key값 출력
		
		// 쿠키의 값을 가져온다
		out.println(" 쿠키의 값 = " + cookie.getValue());	// 값 출력
		
		out.flush();
		out.close();
	}

}
