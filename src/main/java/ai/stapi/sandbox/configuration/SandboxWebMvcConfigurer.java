package ai.stapi.sandbox.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class SandboxWebMvcConfigurer implements WebMvcConfigurer {

  @Value("${FRONTEND_CLIENT:http://localhost:3000}")
  private String allowedOrigins;

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/**")
        .allowedOrigins(allowedOrigins)
        .allowedMethods("*")
        .allowedHeaders("*")
        .allowCredentials(true);
  }
}