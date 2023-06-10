package com.example.backend.security;

import com.example.backend.entities.UserInformation;
import lombok.Getter;
import lombok.Setter;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Getter
@Setter
public class JwtUserDetail implements UserDetails {

    private Long id;
    private String eMail;
    private String password;
    private Collection<? extends GrantedAuthority> authorities;

    private JwtUserDetail(Long id, String eMail, String password, Collection<? extends GrantedAuthority> authorities) {
        this.id = id;
        this.eMail = eMail;
        this.password = password;
        this.authorities = authorities;
    }

    public static JwtUserDetail create(UserInformation userInformation)
    {


        List<GrantedAuthority> authorityList = new ArrayList<>();
        authorityList.add(new SimpleGrantedAuthority("userInformation"));
        return new JwtUserDetail(userInformation.getId(), userInformation.getEMail(), userInformation.getPassword(), authorityList);
    }
    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
