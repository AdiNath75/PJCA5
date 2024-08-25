package com.nath.springdemo;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
 
@Configuration
@PropertySource("classpath:sport.properties")
@PropertySource("classpath:mylogger.properties")
public class SportConfig {
	
	 @Bean
	    public static PropertySourcesPlaceholderConfigurer
	                    propertySourcesPlaceHolderConfigurer() {
	        
	        return new PropertySourcesPlaceholderConfigurer();
	    }
 
	@Bean
	public MyLoggerConfig1 myLoggerConfig(@Value("${root.logger.level}") String rootLoggerLevel,
										 @Value("${printed.logger.level}") String printedLoggerLevel) {
 
		MyLoggerConfig1 myLoggerConfig = new MyLoggerConfig1(rootLoggerLevel, printedLoggerLevel);
 
		return myLoggerConfig;
	}
 
	// define bean for our sad fortune service
	@Bean
	public FortuneService sadFortuneService() {
		return new SadFortuneService();
	}
 
	// define bean for our swim coach AND inject dependency
	@Bean
	public Coach swimCoach() {
		SwimCoach mySwimCoach = new SwimCoach(sadFortuneService());
 
		return mySwimCoach;
	}
 
}