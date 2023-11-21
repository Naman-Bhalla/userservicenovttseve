package com.scaler.userservicenovttseve.services;


import com.scaler.userservicenovttseve.dtos.UserDto;
import com.scaler.userservicenovttseve.repositories.RoleRepository;
import com.scaler.userservicenovttseve.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {
//    private UserRepository userRepository;
//    private RoleRepository roleRepository;
//
//    public UserService(UserRepository userRepository, RoleRepository roleRepository) {
//        this.userRepository = userRepository;
//        this.roleRepository = roleRepository;
//    }
//
//    public UserDto getUserDetails(Long userId) {
//        Optional<User> userOptional = userRepository.findById(userId);
//
//        if (userOptional.isEmpty()) {
//            return null;
//        }
//
//        return UserDto.from(userOptional.get());
//    }
//
//    public UserDto setUserRoles(Long userId, List<Long> roleIds) {
//        Optional<User> userOptional = userRepository.findById(userId);
//        List<Role> roles = roleRepository.findAllByIdIn(roleIds);
//
//        if (userOptional.isEmpty()) {
//            return null;
//        }
//
//        User user = userOptional.get();
////        user.setRoles(Set.copyOf(roles));
//
//        User savedUser = userRepository.save(user);
//
//        return UserDto.from(savedUser);
//    }
}
