package com.demo;

import net.sf.json.JSONObject;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Html extends javax.servlet.http.HttpServlet implements javax.servlet.Servlet {
    static final long serialVersionUID = 1L;

    public Html() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        doPost(request, response);

    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //用拼JSON字符串的形式来生成JSON数据
        StringBuilder json = new StringBuilder();

        json.append("{");

        //生成节点数据
        json.append("\"nodes\": {");
        json.append("\"节点KEY1\": {\"key1\":\"value\",\"key2\":\"value\"},");
        json.append("\"节点KEY2\": {},");
        json.append("\"节点KEY3\": {},");
        json.append("\"节点KEY4\": {},");
        json.append("\"节点KEY5\": {},");
        json.append("\"节点KEY6\": {}");
        json.append("},");

        //生成节点连接数据
        json.append("\"edges\": {");

        json.append("\"节点KEY1\":{");
        json.append("\"节点KEY2\":{},\"节点KEY3\":{}");
        json.append("},");

        json.append("\"节点KEY2\":{");
        json.append("\"节点KEY3\":{}");
        json.append("},");

        json.append("\"节点KEY3\":{");
        json.append("\"节点KEY4\":{}");
        json.append("},");

        json.append("\"节点KEY4\":{");
        json.append("\"节点KEY5\":{},\"节点KEY6\":{}");
        json.append("}");

        json.append("}");

        json.append("}");

        response.setCharacterEncoding("UTF-8");
        response.setContentType("application/json");
        response.getWriter().print(json.toString());
    }
}