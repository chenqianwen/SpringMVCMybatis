package cn.bigzhu.ssm.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import cn.bigzhu.ssm.po.Items;

@Controller
public class ItemsController3{
	
	/**查询商品*/
	@RequestMapping("/queryItems3")
	public ModelAndView queryItems(){
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
		mav.setViewName("/WEB-INF/jsp/items/itemsList.jsp");
		return mav;
	}
	
	public static void main(String[] args) {
		Map<String, Object> map = new HashMap<>();
		map.put("1", "希腊");
		map.put("3", "瑞士");
		map.put("2", "芬兰");
		for(Map.Entry<String, Object> entry : map.entrySet()){
			String key = entry.getKey();
			Object value = entry.getValue();
			System.out.println(key+"=="+value);
		}
		Set<String> keySet = map.keySet();
		for(String key:keySet){
			System.out.println(key+"=="+map.get(key));
		}
	}
}
