package com.njupt.swg.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @Author swg.
 * @Date 2020/9/19 15:48
 * @CONTACT 317758022@qq.com
 * @DESC
 */
@Component
@PropertySource("classpath:config-prod.properties")
@ConfigurationProperties(prefix = "file")
@Getter
@Setter
public class FileConfig {
    //文件上传的位置配置
    private String imageUserFaceLocation;
    private String imageNamePrfix;
    //最后访问图片的地址前缀
    private String imageServerUrl;
}
