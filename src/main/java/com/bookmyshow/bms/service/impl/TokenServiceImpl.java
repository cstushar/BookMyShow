package com.bookmyshow.bms.service.impl;

import com.bookmyshow.bms.repository.TokenRepository;
import com.bookmyshow.bms.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import com.bookmyshow.bms.model.Token;
import com.bookmyshow.bms.model.User;
import com.bookmyshow.bms.service.TokenService;

import java.security.Principal;

@Service
@RequiredArgsConstructor
public class TokenServiceImpl implements TokenService {

    private final TokenRepository tokenRepository;
    private final UserRepository userRepository;

    @Override
    public String signUp(final String value) {
        final Token byValue = tokenRepository.findByValue(value);
        final User user = byValue.getUser();
        user.setEnabled(true);
        userRepository.save(user);
        return "hello";
    }

    @Override
    public String welcome(final Principal principal, final Model model) {
        model.addAttribute("name", principal.getName());
        return "hello";
    }
}