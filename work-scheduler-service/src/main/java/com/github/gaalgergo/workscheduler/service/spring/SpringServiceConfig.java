package com.github.gaalgergo.workscheduler.service.spring;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.convert.ConversionService;
import org.springframework.core.convert.converter.Converter;
import org.springframework.core.convert.support.DefaultConversionService;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class SpringServiceConfig {

    @Autowired
    private List<Converter<?, ?>> converters;

    @Bean
    public DozerBeanMapper dozerBeanMapper() {
        List<String> mappingFiles = new ArrayList();
        mappingFiles.add("dozerJdk8Converters.xml");

        DozerBeanMapper dozerBeanMapper = new DozerBeanMapper();
        dozerBeanMapper.setMappingFiles(mappingFiles);

        return dozerBeanMapper;
    }

    @Bean
    public ConversionService conversionService() {
        DefaultConversionService conversionService = new DefaultConversionService();
        for (final Converter<?, ?> converter : converters) {
            conversionService.addConverter(converter);
        }
        return conversionService;
    }
}
