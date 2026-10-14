package in.riyansh.notification;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("sms")
public class SmsService implements NotificationService
{
    public void sendNotification()
    {
        System.out.println("SMS notification sent");
    }
}
