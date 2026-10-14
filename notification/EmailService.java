package in.riyansh.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("email")
public class EmailService implements NotificationService
{
    @Override
    public void sendNotification()
    {
        System.out.println("Email notification sent.");
    }
}