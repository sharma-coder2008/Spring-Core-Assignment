package in.riyansh;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
public class AppConfig
{
    @Bean
    User us()
    {
        return new User("Riyansh Sharma", "riyanshsharma10072008@gmail.com");
    }
}