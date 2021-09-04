package com.sales.admin.service.user;

import com.sales.admin.model.User;
import com.sales.admin.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    User findByUsername(String username);
}
