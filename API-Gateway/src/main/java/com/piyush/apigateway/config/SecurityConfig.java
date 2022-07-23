package com.piyush.apigateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

@Configuration
@EnableWebFluxSecurity
public class SecurityConfig {

	@Bean
	public SecurityWebFilterChain springSecurityWebFilterChain(ServerHttpSecurity serverHttpSecurity) {
		//Lambda of type AuthoriseExchaneSpec. Make sure all exchange requests are authenticated
		//Enable resource server capabilities
		//Using jwt as token
		serverHttpSecurity.authorizeExchange(exchange -> exchange.anyExchange().authenticated())
			.oauth2ResourceServer(ServerHttpSecurity.OAuth2ResourceServerSpec::jwt);
		//Disable CSRF as REST API used
		serverHttpSecurity.csrf().disable();
		return serverHttpSecurity.build();
	}
}
