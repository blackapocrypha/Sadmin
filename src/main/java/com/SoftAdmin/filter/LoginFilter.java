package com.SoftAdmin.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		
		
		//request，response强制转换成http类型
		HttpServletRequest req = (HttpServletRequest)request;
		HttpServletResponse resp = (HttpServletResponse)response;
		
		//获取请求路径
		StringBuffer requestURL = req.getRequestURL();
		//截取以***.jsp为格式的字符串
		String substring = requestURL.substring(requestURL.lastIndexOf("/")+1, requestURL.length());
		//判断目标页面是否与login.jsp相等
		if("login.jsp".equals(substring)) {
			//请求继续
			chain.doFilter(req, resp);
		}else {
			
			//获取session域对象
			Object attribute = req.getSession().getAttribute("admin");
			//在即将跳转的页面内容与login.jsp不相等的情况下判断session域中是否存在用户，如存在同样破格放过
			if(attribute != null) {
				//请求继续
				chain.doFilter(req, resp);
			}else {
				//返回login.jsp页面
				resp.sendRedirect(req.getContextPath()+"/login.jsp");
			}
			
		}
		
		
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

}
