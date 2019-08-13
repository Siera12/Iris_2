package group2.Backend3;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examples.daos.CategoryDao;
import com.examples.daos.ProductDao;
import com.examples.models.Category;
import com.examples.models.Product;

public class App 
{
    public static void main( String[] args )
    {
    	
    	Category c=new Category();
    	c.setCategoryId("6");
    	c.setCategoryName("kids Wear1");
    	c.setCategoryDesc("Formal and Casual Wear2");
    	
    	Product p=new Product();
    	p.setProductId("8");
    	p.setProductName("pant_kids");
    	p.setProductDesc("Just pant_kids");
    	p.setCate(c);
    	
        ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
        
        CategoryDao obj=context.getBean("categoryDao",CategoryDao.class);
        ProductDao obj1=context.getBean("productDao",ProductDao.class);
        
     /*  obj.addCategory(c);
        System.out.println("Category Added");*/
        
        obj1.addProduct(p);
        System.out.println("Product Added");
        
       /* List<Category> categories=obj.getAllCategories();
        for(Category cObj:categories) {
        	System.out.println(cObj.getCategoryId()+" "+cObj.getCategoryName()+" "+cObj.getCategoryDesc());
        }*/
        
        
    }
}