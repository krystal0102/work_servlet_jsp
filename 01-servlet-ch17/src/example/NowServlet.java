package example;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class NowServlet extends HttpServlet {
	
	
	/*	방법1: Deployment Descriptor(web.xml)파일을 이용하여 Servlet 연결
	 * 	장점: 컴파일을 다시 하지 않고 URL주소를 변경할 수 있다
	 * 	단점: web.xml 작성해야하므로 애노테이션 매핑보다 불편하다
	 * 
	 * 	HTTP Method GET요청을 받으면 호출되는 메소드
	 *	HttpServletRequest: 클라이언트로부터 전달받은 요청
	 *	HttpServletResponse: 서버가 클라이언트로부터 전달할 응답 
	 * 
	 * */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		// 클라이언트로 보낼 문서형식과 인코딩 타입 설정
		resp.setContentType("text/html; charset=utf-8");
		
		//resp 객체로부터 출력스트림 가져옴
		PrintWriter out = resp.getWriter();
		
		// 출력스트림 println메소드를 이용하여 클라이언트로 보낼 내용을 작성
		out.println("<html>");
		out.println("<head><title>현재시간</title></head>");
		out.println("<body>");
		out.println("현재시간은");
		out.println(new Date());
		out.println("입니다.");
		out.println("</body></html>");
		
		// 버퍼에 남아있는 내용을 깨끗히 보낸 후 출력스트림 닫기
		out.flush();
		out.close();
	}

}
