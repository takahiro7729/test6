package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//この下のソースコードが大事(@WebServlet("/UranaiServlet")//
@WebServlet("/UranaiServlet")
public class UranaiServlet extends HttpServlet {
  protected void doGet(HttpServletRequest request, HttpServletResponse response) 
		  throws ServletException, IOException {
	  String name = "haysahi";
	  response.setContentType("text/html;charset=UTF8");
	  PrintWriter out =response.getWriter();
	  out.println("<!DOCTYPE htmo>");
	  out.println("<html>");
	  out.println("<title>" + name + "のプロフィール</title>");
	  out.println("<head>");
	  out.println("<body>");
	  out.println(name + "は、かっこいい?");
	  out.println("</body>");
	  out.println("</head>");
		}
	}


