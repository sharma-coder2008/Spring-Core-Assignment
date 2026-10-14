package in.riyansh;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main
{
    static void main()
    {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        User us = context.getBean(User.class);
        System.out.println("User Name: " + us.getName());
        System.out.println("User Email: " + us.getEmail());

        OrderService os = context.getBean(OrderService.class);
        os.placeOrder();
    }
}