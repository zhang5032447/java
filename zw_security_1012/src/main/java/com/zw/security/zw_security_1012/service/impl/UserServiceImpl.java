package com.zw.security.zw_security_1012.service.impl;

import com.zw.security.zw_security_1012.service.UserService;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        System.out.println(s);
        if(!"zhang".equals(s)){
            System.out.println(s);

            return null;
        }
        List<GrantedAuthority> authorities = new ArrayList<>();
        GrantedAuthority auth = new SimpleGrantedAuthority("ROLE_ROOT");
        authorities.add(auth);
        UserDetails user = new User(s,
                "$2a$10$5SYwfWV4MnpPyD/mhJrhp.plsKgb1mMWOgMwZv/A4.rjxT9iJGqRS",
                true,
                true,
                true,
                true,
                authorities);
        return user;
    }
}
