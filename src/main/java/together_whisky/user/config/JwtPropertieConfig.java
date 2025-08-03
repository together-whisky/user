package together_whisky.user.config;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import together_whisky.user.properties.JwtProperties;

@Configuration
@EnableConfigurationProperties(JwtProperties.class)
public class JwtPropertieConfig {

}
