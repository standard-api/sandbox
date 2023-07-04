package ai.stapi.sandbox.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("stapi.admin")
public class SandboxWebMvcConfigurationProperties {

  private String urls = "http://localhost:8084,http://localhost:3000";

  public String getUrls() {
    return urls;
  }

  public void setUrls(String urls) {
    this.urls = urls;
  }
}
