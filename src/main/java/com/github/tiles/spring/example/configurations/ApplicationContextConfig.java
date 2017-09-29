package com.github.tiles.spring.example.configurations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
@EnableWebMvc
// @Import(SwaggerConfig.class)
// https://github.com/dragosbudrica/SpringWithAnnotations/blob/afaae200460e2c271a62cbc1c4511a9d5cefc109/src/main/java/com/kepler/rominfo/config/spring/MvcConfiguration.java
@ComponentScan("com.github.tiles.spring.example.*")
public class ApplicationContextConfig extends WebMvcConfigurerAdapter {

	@Bean(name = "viewResolver")
	public ViewResolver getViewResolver() {
		System.out.println("viewResolver()");
		UrlBasedViewResolver viewResolver = new UrlBasedViewResolver();
		viewResolver.setViewClass(TilesView.class);
		return viewResolver;
	}

	@Bean(name = "tilesConfigurer")
	public TilesConfigurer getTilesConfigurer() {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		System.out.println("tilesConfigurer()");
		// tilesConfigurer.setCompleteAutoload(true);
		tilesConfigurer.setDefinitions("/WEB-INF/tiles/definitions.xml");
		return tilesConfigurer;
	}

}