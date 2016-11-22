package com.nbfg.innolab.microservice.account.entrypoint;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"com.nbfg.innolab.microservice", "com.nbfg.innolab.microservice.integration"})
public class ServiceConfiguration {

}
