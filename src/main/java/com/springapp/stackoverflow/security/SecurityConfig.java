package com.springapp.stackoverflow.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfig {

    @Bean
    public BCryptPasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(auth -> auth
                        .requestMatchers("/login").anonymous()
                        .requestMatchers(
                                "/CSS/**",
                               "/questions",
                                "/questions/home",
                               "/questions/unanswered/**",
                                "/answers/{id}/**",
                                "/questions/{id}/**",
                                "/login/**",
                                "/signup/**",
                                "/logout/**",
                                "/profile/**",
                                "/change-password/**",
                                "/questions/**"
                        ).permitAll()
                        .requestMatchers(
                               "/questions/{id}/comment/**",
                                "/answer/{id}/comment/**",
                                "/questions/{id}/comment/{deleteID}/**",
                                "/questions/{questionId}/edit/{commentId}/**",
                                "/answer/{answerId}/comment/{commentId}/**",
                                "/questions/{id}/comment/{deleteID}/**",
                                "/questions/{questionId}/edit/{commentId}/**",
                                "/profile/update/**"
                        ).hasAnyRole("ADMIN","AUTHOR")
                        .requestMatchers("/comment/reply/**").authenticated()
                        .anyRequest().permitAll()
                )
                .formLogin(form -> form
                        .loginPage("/login")
                        .loginProcessingUrl("/authenticateTheUser")
                        .defaultSuccessUrl("/questions", true)
                        .permitAll()
                )
                .logout(logout -> logout
                        .logoutUrl("/logout")
                        .logoutSuccessUrl("/questions")
                        .invalidateHttpSession(true)
                        .clearAuthentication(true)
                        .deleteCookies("JSESSIONID")
                        .permitAll()
                );

        return http.build();
    }

}
