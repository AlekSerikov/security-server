package com.demo.jwtauthserver.config;

import com.demo.jwtauthserver.exception.NoSuchUserException;
import com.demo.jwtauthserver.model.Status;
import com.demo.jwtauthserver.repo.UserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    @Bean
    protected PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(12);
    }


    @Override
    @Bean
    public AuthenticationManager authenticationManagerBean() throws Exception {
        return super.authenticationManagerBean();
    }

    //    @Bean
//    public UserDetailsService userDetailsService(UserRepository userRepository) {
//        System.out.println("in User details");
//           return s -> {
//
//               com.demo.jwtauthserver.model.entity.User user = userRepository.findByLogin(s)
//                       .orElseThrow(() -> new NoSuchUserException("User does not exists"));
//
//               return new User(
//                       user.getLogin(),
//                       user.getPassword(),
//                       user.getStatus().equals(Status.ACTIVE),
//                       user.getStatus().equals(Status.ACTIVE),
//                       user.getStatus().equals(Status.ACTIVE),
//                       user.getStatus().equals(Status.ACTIVE),
//                       user.getRole().getAuthorities()
//               );
//           };
//    }
}