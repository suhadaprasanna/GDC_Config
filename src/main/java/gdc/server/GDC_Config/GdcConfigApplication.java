package gdc.server.GDC_Config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableConfigServer
@ComponentScan( basePackages = "gdc" )
@EnableDiscoveryClient
public class GdcConfigApplication {

	public static void main(String[] args) {
		SpringApplication.run(GdcConfigApplication.class, args);
	}

}
