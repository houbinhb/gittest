package com.houb.service;

import com.houb.mapper.HrMapper;
import com.houb.model.Hr;
import com.houb.model.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HrService implements UserDetailsService {

    @Autowired
    HrMapper hrMapper;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        Hr hr=hrMapper.loadUserByUsername(s);
        if(hr==null){
            throw new UsernameNotFoundException("用户名不存在！");
        }
        List<Role> ss = hrMapper.getHrRolesById(hr.getId());
        hr.setRoles(ss);
        return hr;
    }
}
