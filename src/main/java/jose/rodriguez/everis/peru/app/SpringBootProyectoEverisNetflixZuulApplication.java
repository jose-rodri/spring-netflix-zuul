package jose.rodriguez.everis.peru.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import jose.rodriguez.everis.peru.app.errorFilter.ErrorFilter;
import jose.rodriguez.everis.peru.app.portFilter.PostFilter;
import jose.rodriguez.everis.peru.app.preFilter.PreFilter;
import jose.rodriguez.everis.peru.app.routeFilter.RouteFilter;

@EnableZuulProxy 
@EnableDiscoveryClient 
@SpringBootApplication
public class SpringBootProyectoEverisNetflixZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootProyectoEverisNetflixZuulApplication.class, args);
	}
/*
	
	@Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
    */
}
