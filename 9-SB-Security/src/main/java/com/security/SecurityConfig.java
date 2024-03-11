package com.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.SecurityConfigurerAdapter;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
		.antMatchers("/home").permitAll()
		.antMatchers("/balance").authenticated()
		.antMatchers("/statement").authenticated()
		.antMatchers("/loan").authenticated()
		.antMatchers("/contact").permitAll();

		http.formLogin();
		http.httpBasic();
	}
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		
		auth.inMemoryAuthentication()
		.withUser("chimtu").password("chimtu123").authorities("emp").and()
		.withUser("yakub").password("yakub123").authorities("admin").and()
		.withUser("ram").password("ram123").authorities("reader").and()
		.passwordEncoder(NoOpPasswordEncoder.getInstance());
	}

}
