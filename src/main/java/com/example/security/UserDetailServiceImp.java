package com.example.security;

import com.example.Entities.Client;
import com.example.Entities.Cooperative;
import com.example.Services.ClientService;
import com.example.Services.CooperativeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

@Component
public class UserDetailServiceImp implements UserDetailsService {
    @Autowired
    private ClientService clientService;

    @Autowired
    private CooperativeService cooperativeService;

    @Override
    public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
            System.out.println("---userDetail service");
            Cooperative cooperative = cooperativeService.tourverCooperativeParEmail(email);
            if(cooperative == null){
                throw new UsernameNotFoundException("Cooperative non existant!");
            }
            Collection<GrantedAuthority> authorities = new ArrayList<>();
            authorities.add(new SimpleGrantedAuthority("COOPERATIVE"));
            return new User(email, cooperative.getPassword(),authorities);

    }
}
