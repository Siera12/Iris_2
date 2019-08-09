package com.examples;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.models.Category;
@Controller
public class CategoryController {
	
	@RequestMapping(value="CategoryForm",method=RequestMethod.GET)
	public String addCategoryForm(ModelMap map) {
		Category category=new Category();
		map.addAttribute("categoryObj",category);
		return "CategoryForm";
		
	}
	
	@RequestMapping(value="addCategory",method=RequestMethod.POST)
	public String viewCategory(@ModelAttribute Category categoryObj,ModelMap m1) {
		m1.addAttribute("categoryObj1", categoryObj);
			return "ViewCategory";
	}
}
