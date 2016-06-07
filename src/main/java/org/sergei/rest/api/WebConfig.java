package org.sergei.rest.api;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
@ComponentScan("org.sergei.rest.api.service")
@EnableWebMvc
public class WebConfig
   extends
    WebMvcConfigurerAdapter
{
    public WebConfig()
    {
        super();
    }
}
