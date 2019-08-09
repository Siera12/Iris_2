package com.examples.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.examples.models.Product;




@Controller
public class ProductController {

		@RequestMapping(value="g2cont",method=RequestMethod.GET)
		public String addProduct(ModelMap map) {
			Product product=new Product();
			map.addAttribute("productObj",product);
			return "AddForm";
			
		}
		

		/*@RequestMapping(value="addCategory",method=RequestMethod.POST)
		public String viewCategory(@ModelAttribute Category categoryObj,ModelMap m1) {
			m1.addAttribute("categoryObj1", categoryObj);
				return "ViewCategory";
		}*/
}