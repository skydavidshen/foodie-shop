package com.njupt.swg.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author swg.
 * @Date 2020/9/19 16:10
 * @CONTACT 317758022@qq.com
 * @DESC
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

    //实现静态资源的映射
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
//                .addResourceLocations("classpath:/static/")
                .addResourceLocations("classpath:/META-INF/resources/")//映射swagger2，否则会导致404
                .addResourceLocations("file:/home/picture/faces/");//这个就是映射的路径，下面的文件就可以通过localhost:8088/xxx.png来访问了
    }
}
