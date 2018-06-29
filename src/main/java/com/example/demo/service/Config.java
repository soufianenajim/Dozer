package com.example.demo.service;


import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;




@Configuration
@ImportResource({ "classpath:applicationContext-cordination.xml" })
public class Config {
	/*@Bean(name = "dozerBean")
    public DozerBeanMapperFactoryBean configDozer() throws IOException {
		
        DozerBeanMapperFactoryBean mapper = new DozerBeanMapperFactoryBean();
        Resource[] resources = new PathMatchingResourcePatternResolver().getResources("classpath:*mapping.xml");
        mapper.setMappingFiles(resources);
        return mapper;
    }
	

	*/
}
