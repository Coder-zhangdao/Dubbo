package com.school.student.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;

@Controller
@RequestMapping("zTree")
public class ZTreeController
{
	@RequestMapping("getZTree")
	public void getZTree(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException
	{
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String level = request.getParameter("level");
		String otherParam = request.getParameter("otherParam");
		System.out.println(id + "|" + name + "|" + level + "|" + otherParam);

		List<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		for (int i = 0; i < 5; i++) {
			HashMap<String, Object> hm = new HashMap<String, Object>(); // 最外层，父节点
			hm.put("id", id + i);// id属性 ，数据传递
			hm.put("name", id + i); // name属性，显示节点名称
			hm.put("pId", id);

			list.add(hm);
		}
		response.getWriter().write(JSON.toJSONString(list));
	}
}
