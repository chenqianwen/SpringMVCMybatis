package cn.bigzhu.ssm.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.HttpRequestHandler;

import cn.bigzhu.ssm.po.Items;

public class ItemsController2  implements HttpRequestHandler{

	@Override
	public void handleRequest(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		List<Items> itemsList = new ArrayList<>();
		Items item1 = new  Items();
		item1.setName("惠普");
		item1.setPrice(4000.0);
		item1.setProDate(new Date());
		item1.setDetail("我的惠普笔记本");
		Items item2 = new  Items();
		item2.setName("iphone4s");
		item2.setPrice(2500.0);
		item2.setProDate(new Date());
		item2.setDetail("我的iphone手机");
		itemsList.add(item1);
		itemsList.add(item2);
		request.setAttribute("itemsList", itemsList);
		request.getRequestDispatcher("/WEB-INF/jsp/items/itemsList.jsp").forward(request, response);
	}

}
