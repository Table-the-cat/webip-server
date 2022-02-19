package com.table.webip.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.FileSystemResource;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class ResourceConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {

        String path =  new FileSystemResource("").getFile().getAbsolutePath() + "\\webip\\src\\main\\resources\\static\\img\\";

        registry.addResourceHandler("/img/**").addResourceLocations("file:"+path);
    }


}