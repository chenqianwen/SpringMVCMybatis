package cn.bigzhu.ssm.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.Controller;

import cn.bigzhu.ssm.po.Items;

public class ItemsController1  implements Controller{
	@Override
	public ModelAndView handleRequest(HttpServletRequest arg0,
			HttpServletResponse arg1) throws Exception {
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
		
		ModelAndView mav = new ModelAndView();
		mav.addObject("itemsList", itemsList);
		mav.setViewName("items/itemsList");
		return mav;
	}

}
