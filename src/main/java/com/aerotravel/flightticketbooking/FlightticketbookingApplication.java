package com.aerotravel.flightticketbooking;

import com.aerotravel.flightticketbooking.model.Role;
import com.aerotravel.flightticketbooking.model.User;
import com.aerotravel.flightticketbooking.repository.RoleRepository;
import com.aerotravel.flightticketbooking.repository.UserRepository;
import com.aerotravel.flightticketbooking.services.servicesimpl.UserServiceImpl;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
public class FlightticketbookingApplication extends SpringBootServletInitializer implements CommandLineRunner{

    @Autowired
    UserRepository ur;
    
    @Autowired
    RoleRepository rr;
    
    @Autowired
    PasswordEncoder encoder;
    
    public static void main(String[] args) {

        SpringApplication.run(FlightticketbookingApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(FlightticketbookingApplication.class);
    }

    @Override
    public void run(String... args) throws Exception {
//                User user=new User();
//                // admin
////		user.setUsername("admin");
//                
//                // agent
//               user.setUsername("agent");
//		user.setEmail("agent@gmail.com");
//                user.setFirstname("md");
//                user.setLastname("kanchon");
//                user.setPassword(encoder.encode("12345678"));
//                List<Role> roles = new ArrayList<>();
//                Role r = new Role();
////               r.setName("ROLE_ADMIN");
//
//              r.setName("ROLE_AGENT");
//                rr.save(r);
//                roles.add(r);
//                user.setRoles(roles);
//                ur.save(user);

    }
}
