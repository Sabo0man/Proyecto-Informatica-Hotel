package com.example.escaping;

//@Configuration
//@EnableWebSecurity
public class SecurityConfiguration {
	
	
//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//		http
//			.authorizeHttpRequests((requests) -> requests
//				.requestMatchers("/", "/home").permitAll()
//				.anyRequest().authenticated()
//			)
//			.formLogin((form) -> form
//				.loginPage("/user")
//				.permitAll()
//			)
//			.logout((logout) -> logout.permitAll());
//
//		return http.build();
//	}
//
//	@Bean
//	public UserDetailsService userDetailsService() {
//		UserDetails user =
//			 User.withDefaultPasswordEncoder()
//				.username("user")
//				.password("password")
//				.roles("USER")
//				.build();
//
//		return new InMemoryUserDetailsManager(user);
//	}
	
	
	
	
//
//    @Bean
//    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//        http.authorizeHttpRequests((authz) -> authz
//                .anyRequest().authenticated()
//            )
//            .httpBasic(Customizer.withDefaults());
//        return http.getOrBuild();
//    }
    
//  @Bean
//  public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
//  	http.authorizeHttpRequests((authz) -> authz
//  			.anyRequest().permitAll()
//  			)
//  	.httpBasic(Customizer.withDefaults());
//  	return http.getOrBuild();
//  }

    
//    @Bean
//    public SecurityFilterChain securityFilterChain(HttpSecurity http, HandlerMappingIntrospector introspector) throws Exception {
//        MvcRequestMatcher.Builder mvcMatcherBuilder = new MvcRequestMatcher.Builder(introspector);
//        http.authorizeHttpRequests((requests) -> requests
//            .requestMatchers(mvcMatcherBuilder.pattern("/user/**")).permitAll()
//            .anyRequest().authenticated()
//        );
//        return http.build();
//    }
}

