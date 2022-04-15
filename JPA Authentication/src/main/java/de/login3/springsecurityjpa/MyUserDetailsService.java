package de.login3.springsecurityjpa;

import de.login3.springsecurityjpa.models.MyUserDetails;
import de.login3.springsecurityjpa.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserDetailsService implements UserDetailsService {

    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
       Optional<User> user = userRepository.findByUserName(userName);

       user.orElseThrow(() -> new UsernameNotFoundException("Username " + userName + " not found!"));

       return user.map(MyUserDetails::new).get();
    }

}
