package me.goon.demospringmvc;

import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

public class WebConfig implements WebMvcConfigurer {
    @Override
    public void addFormatters(FormatterRegistry registry) {

    }
    //이렇게 하지 않아도됨.
    //SpringBoot에선 Converter, GenericConverter, Fomatter를 @Bean으로 등록하면 자동으로 설정해주기 때문에
    //굳이 Fomatter를 등록하기위해서 이렇게 설정할 필요는없음.
}
