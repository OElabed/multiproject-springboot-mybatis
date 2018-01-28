package com.zeldan.security.controller;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.zeldan.model.Account;
import com.zeldan.model.Role;
import com.zeldan.security.repository.AccountRepository;

@Service
@Transactional
public class CustomUserDetailsService implements UserDetailsService {

	@Autowired
    private AccountRepository accountRepository;
    
    @Override
    public UserDetails loadUserByUsername(final String username) throws UsernameNotFoundException {
        
    	Account account = accountRepository.findByUsername(username);
//        if (!accountByUsername.isPresent()) {
//            throw new UsernameNotFoundException("User " + username + " not found.");
//        }
//        final Account account = accountByUsername.get();
//        if (account.getRoles() == null || account.getRoles().isEmpty()) {
//            throw new UsernameNotFoundException("User not authorized.");
//        }
        final User userDetails = new User(account.getUsername(), account.getPassword(), account.isEnabled(), true, true, true,
        		getAuthorities(null));
        return userDetails;
    }

    private Collection<? extends GrantedAuthority> getAuthorities(final Collection<Role> roles) {
        return new ArrayList<GrantedAuthority>();
    }

//    private List<String> getPrivileges(final Collection<Role> roles) {
//        final List<String> privileges = new ArrayList<String>();
//        final List<Privilege> collection = new ArrayList<Privilege>();
//        for (final Role role : roles) {
//            collection.addAll(role.getPrivileges());
//        }
//        for (final Privilege item : collection) {
//            privileges.add(item.getName());
//        }
//        return privileges;
//    }
//
//    private List<GrantedAuthority> getGrantedAuthorities(final List<String> privileges) {
//        final List<GrantedAuthority> authorities = new ArrayList<GrantedAuthority>();
//        for (final String privilege : privileges) {
//            authorities.add(new SimpleGrantedAuthority(privilege));
//        }
//        return authorities;
//    }

}
