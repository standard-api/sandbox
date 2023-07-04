package ai.stapi.sandbox.configuration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
@EnableConfigurationProperties(SandboxWebMvcConfigurationProperties.class)
public class SandboxWebMvcConfigurer implements WebMvcConfigurer {

  private final SandboxWebMvcConfigurationProperties sandboxWebMvcConfigurationProperties;

  public SandboxWebMvcConfigurer(SandboxWebMvcConfigurationProperties sandboxWebMvcConfigurationProperties) {
    this.sandboxWebMvcConfigurationProperties = sandboxWebMvcConfigurationProperties;
  }

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    var splitUrls = this.sandboxWebMvcConfigurationProperties.getUrls().split(",");
    registry.addMapping("/**")
        .allowedOrigins(splitUrls)
        .allowedMethods("*")
        .allowedHeaders("*")
        .allowCredentials(true);
  }
}