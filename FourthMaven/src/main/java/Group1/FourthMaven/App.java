package Group1.FourthMaven;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import examples.Car;


public class App 
{
    public static void main( String[] args )
    {
    
        ApplicationContext ctx=new ClassPathXmlApplicationContext("springs.xml");
        Car ob=(Car)ctx.getBean("carObj");
        System.out.println(ob);
    }
}
