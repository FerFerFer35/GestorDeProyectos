package com.api.projectflow.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.api.projectflow.model.User;
import com.api.projectflow.repository.UserRepository;

import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;

@Service
@RequiredArgsConstructor
public class UserService {
    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    @Transactional
    public User registrarUsuario(User user) {
        if (userRepository.existByCorreo(user.getCorreo())) {
            throw new IllegalArgumentException("El correo ya está en uso");
        }

        user.setContrasena(passwordEncoder.encode(user.getContrasena()));
        return userRepository.save(user);
    }
}
