package Group1.StringMaven;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
