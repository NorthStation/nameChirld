package com.winnermedical.it.validatecode.util;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RandomImageServlet extends HttpServlet {
	/**
	 * 
	 */
	private static final long serialVersionUID = 20343419514702550L;
	// ͼƬ���
	int width = 0;
	// ͼƬ�߶�
	int height = 0;
	// ͼƬ������ַ�����
	int randomStrNum = 0;

	public void destroy() {
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		// ��ȡHttpSession����
		HttpSession session = request.getSession();
		// ��ȡ����ַ���
		String randomStr = RandomImageGenerator.random(randomStrNum);
		if (null != session) {
			// ���ò���
			session.setAttribute("randomStr", randomStr);
			// ������Ӧ����,���ͼƬ�ͻ��˲�����
			response.setDateHeader("Expires", 1L);
			response.setHeader("Cache-Control", "no-cache, no-store, max-age=0");
			response.addHeader("Pragma", "no-cache");
			response.setContentType("image/jpeg");
			// �����ҳ��
			RandomImageGenerator.render(randomStr, response.getOutputStream(), width, height);
		}
	}

	public void init() throws ServletException {
		// ��ȡ���
		width = Integer.parseInt(this.getInitParameter("width"));
		// ��ȡ�߶�
		height = Integer.parseInt(this.getInitParameter("height"));
		// ��ȡ����
		randomStrNum = Integer.parseInt(this.getInitParameter("num"));
	}
}