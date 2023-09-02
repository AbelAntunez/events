package com.course.taskManagement.service;

import com.course.taskManagement.model.User;
import com.course.taskManagement.repository.UserRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {
  private final UserRepository userRepository;
  private final PasswordEncoder passwordEncoder;

  public User registerUser(User user) {
    // Implementan la lógica para registrar usuarios aquí
    // Incluye el cifrado de contraseñas
    return userRepository.save(user);
  }

  public List<User> getAllUsers() {
    return userRepository.findAll();
  }

}
