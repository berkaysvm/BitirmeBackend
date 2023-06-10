package com.example.backend.business;

import com.example.backend.entities.UserInformation;
import com.example.backend.repository.UserRepository;
import com.example.backend.security.JwtUserDetail;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {
    private UserRepository userRepository;

    public UserDetailsServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UserInformation userInformation = userRepository.findByeMail(username);

        return JwtUserDetail.create(userInformation);
    }
    public UserDetails loadUserById(Long id)
    {
        UserInformation userInformation = userRepository.findById(id).get();
        return JwtUserDetail.create(userInformation);

    }
}
