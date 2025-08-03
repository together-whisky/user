package together_whisky.user.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "jwt")
@Data
public class JwtProperties {

    private String secret;
    private long accessTokenExpTime;
    private long refreshTokenExpTime;
}
