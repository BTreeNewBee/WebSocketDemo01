package com.servlet;

import org.json.JSONObject;

import javax.json.Json;
import javax.json.JsonObject;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class Servlet extends HttpServlet {

    protected void service(HttpServletRequest request,
                           HttpServletResponse response) throws ServletException, IOException {
        String method = request.getParameter("p");
        if("adduser".equals(method)){
            adduser(request,response);
        }
        if("all".equals(method)){
            allbumeng(request,response);
        }
        if("group".equals(method)){
            groups(request,response);
        }
    }

    private void groups(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getParameter("id");
        JSONObject jsonObject = new JSONObject();
        response.getWriter().println("123");
    }

    private void adduser(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String id = request.getSession().getId();
        String username = request.getParameter("name");
        request.getSession().setAttribute("name",username);
        request.getSession().setAttribute("uid",id);
        response.getWriter().print(id);
        response.setContentType("application/json");
    }

    private void allbumeng(HttpServletRequest request,
                           HttpServletResponse response) throws IOException {
        System.out.printf("123");
        response.getWriter().print("true");
    }




    /**
     * Constructor of the object.
     */
    public Servlet() {
        super();
    }

    /**
     * Destruction of the servlet. <br>
     */
    public void destroy() {
        super.destroy(); // Just puts "destroy" string in log
        // Put your code here
    }

    /**
     * The doGet method of the servlet. <br>
     *
     * This method is called when a form has its tag value method equals to get.
     *
     * @param request the request send by the client to the server
     * @param response the response send by the server to the client
     * @throws ServletException if an error occurred
     * @throws IOException if an error occurred
     */
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
        out.println("<HTML>");
        out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
        out.println("  <BODY>");
        out.print("    This is ");
        out.print(this.getClass());
        out.println(", using the GET method");
        out.println("  </BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }

    /**
     * The doPost method of the servlet. <br>
     *
     * This method is called when a form has its tag value method equals to post.
     *
     * @param request the request send by the client to the server
     * @param response the response send by the server to the client
     * @throws ServletException if an error occurred
     * @throws IOException if an error occurred
     */
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">");
        out.println("<HTML>");
        out.println("  <HEAD><TITLE>A Servlet</TITLE></HEAD>");
        out.println("  <BODY>");
        out.print("    This is ");
        out.print(this.getClass());
        out.println(", using the POST method");
        out.println("  </BODY>");
        out.println("</HTML>");
        out.flush();
        out.close();
    }

    /**
     * Initialization of the servlet. <br>
     *
     * @throws ServletException if an error occurs
     */
    public void init() throws ServletException {
        // Put your code here
    }
}
