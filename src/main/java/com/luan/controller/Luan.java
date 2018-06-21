package com.luan.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Administrator on 2018/1/14 0014.
 */
@WebServlet("/luan")
@MultipartConfig
public class Luan extends HttpServlet {
    private static final long serialVersionUID = 1L;
    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response) throws ServletException, IOException {

       // request.setAttribute("hint", "Upload Successfully!");
        PrintWriter out=response.getWriter();
        out.write("jkjkjkjkjk");

        //request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
}
