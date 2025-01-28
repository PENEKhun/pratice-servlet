package kr.huni;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet("/ServletLifeCycle")
public class ServletLifeCycle extends HttpServlet {

    public ServletLifeCycle() {
        super();
        System.out.println("ServletLifeCycle 생성자 실행");
    }

    public void init(ServletConfig config) {
        System.out.println("init() 실행");
    }

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        System.out.println("service() 실행");
        super.service(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("doGet() 실행");
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) {
        System.out.println("doPost() 실행");
    }

    public void destroy() {
        System.out.println("destroy() 실행");
    }
}
