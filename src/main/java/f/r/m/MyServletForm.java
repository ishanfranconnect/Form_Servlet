package f.r.m;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/myresultUrl")
public class MyServletForm extends HttpServlet{
	
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		when we write doPost method then one thing that is complsory is that in html method is only post type
		String fname=req.getParameter("fname");
		String lname=req.getParameter("f=lname");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		String gender=req.getParameter("gender");
		String s[]=req.getParameterValues("skill");
		
		PrintWriter pw=res.getWriter();
		pw.println("Fname is:"+fname);
		pw.println("Lname is:"+lname);
		pw.println("Email is:"+email);
		pw.println("password is:"+pass);
		pw.println("You are:"+gender);
		
		if(s!=null) {
			pw.println("Your skills are as below: ");
			for(String s1:s) {
				pw.println(s1);
			}
		} else {
			pw.println("No checkboxes have been checked...");
		}
	}
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		when we write doPost method then one thing that is complsory is that in html method is only post type
		String fname=req.getParameter("fname");
		String lname=req.getParameter("f=lname");
		String email=req.getParameter("email");
		String pass=req.getParameter("pass");
		String gender=req.getParameter("gender");
		String s[]=req.getParameterValues("skill");
		
		PrintWriter pw=res.getWriter();
		pw.println("Fname is:"+fname);
		pw.println("Lname is:"+lname);
		pw.println("Email is:"+email);
		pw.println("password is:"+pass);
		pw.println("You are:"+gender);
		
		if(s!=null) {
			pw.println("Your skills are as below: ");
			for(String s1:s) {
				pw.println(s1);
			}
		} else {
			pw.println("No checkboxes have been checked...");
		}
	}
//	public void service(HttpServletRequest req,HttpServletResponse res) throws IOException {
//		String fname=req.getParameter("fname");
//		String lname=req.getParameter("f=lname");
//		String email=req.getParameter("email");
//		String pass=req.getParameter("pass");
//		String gender=req.getParameter("gender");
//		String s[]=req.getParameterValues("skill");
//		
//		PrintWriter pw=res.getWriter();
//		pw.println("Fname is:"+fname);
//		pw.println("Lname is:"+lname);
//		pw.println("Email is:"+email);
//		pw.println("password is:"+pass);
//		pw.println("You are:"+gender);
//		
//		if(s!=null) {
//			pw.println("Your skills are as below: ");
//			for(String s1:s) {
//				pw.println(s1);
//			}
//		} else {
//			pw.println("No checkboxes have been checked...");
//		}
//		
//	}
}
