package com.bookmyshow.bms.service;

import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import com.bookmyshow.bms.model.User;

import java.security.Principal;

public interface UserService {

    String login(final Principal principal);

    String register(final Model model);

    String registerSuccessfully(final User user, final BindingResult bindingResult);
}