package org.sergei.rest.api;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource({ "classpath:security-config.xml" })
@ComponentScan("org.sergei.rest.api.security")
public class SpringSecurityConfig
{
    public SpringSecurityConfig()
    {
        super();
    }
}
