package in.riyansh;

import in.riyansh.notification.NotificationService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class OrderService
{
    NotificationService ns;

    public OrderService(@Qualifier("email") NotificationService ns)
    {
        this.ns = ns;
    }

    public void placeOrder()
    {
        System.out.println("Order Placed");
        ns.sendNotification();
    }
}
