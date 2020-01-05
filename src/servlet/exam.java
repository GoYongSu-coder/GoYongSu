package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/exam")
public class exam extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html; charset=UTF-8");
		
		PrintWriter out = response.getWriter();
		
		String s = "구구단 2~9단";
		

		
		String action = request.getParameter("action");
		
		if(action.equals("printgugu1")) {
			out.println(s + "<br>");
			for(int i = 2;  i < 10; i++) {
				for(int j = 1; j < 10; j++) {
					out.println(i + "*" +  j + " = " + i*j + "<br>");
				}
			}
		}
		
		else if(action.equals("printgugu2")) {
			
			int limit = Integer.parseInt(request.getParameter("limit")); //숫자로 된 문자를 숫자로 바꿔줌???
			
			for(int i = 2;  i < 21; i++) {
				for(int j = 1; j < 10; j++) {
					out.println(i + "*" +  j + " = " + i*j + "<br>");
				}
			}
		}
		
		else if(action.equals("hello")) {
			
			String hello = "안녕하세요";

			String age = request.getParameter("age");
			String name = request.getParameter("name");
			out.print(hello + " " + age+"살 "+ name + "입니다.");
			
		}
		
	}

}
