package com.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 全部文件控制器
 *
 * @author Rojay
 * @version 1.0.0
 * @createTime 2019年12月3日  16:01:44
 */
@WebServlet("/servlet/filleall")
@MultipartConfig(location = "d:/myfile",maxFileSize = 1073741824)
public class FileAllServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //获得请求的方法
        String method = request.getParameter("method");
        //判断选择处理请求的方法
        if ("upload".equals(method)) {
            //调用upload方法
            upload(request, response);
        } else if ("download".equals(method)) {

        } else if ("update".equals(method)) {

        } else if ("deleting".equals(method)) {

        } else {
            query(request, response);
        }
    }

    /**
     * 上传文件
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void upload(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }

    /**
     * 查询文件数据
     * @param request
     * @param response
     * @throws ServletException
     * @throws IOException
     */
    public void query(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

    }
}
