package com.fsoft.mock2.service;

import com.fsoft.mock2.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class JwtUserDetailsService implements UserDetailsService {

    private final UserRepository userDao;

    public JwtUserDetailsService(UserRepository userDao) {
        this.userDao = userDao;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
       com.fsoft.mock2.entity.User user = userDao.findByEmail(username);
        if (user == null) {
            throw new UsernameNotFoundException("User not found with username: " + username);
        }if(!user.isEnable()){
            throw new UsernameNotFoundException("User is not activated: " + username);
        }
        return new User(user.getEmail(), user.getPassword(), new ArrayList<>());
    }

}
