package com.tuanhm.cmcex1.service;

import com.tuanhm.cmcex1.converter.UserMapper;
import com.tuanhm.cmcex1.dto.UserDto;
import com.tuanhm.cmcex1.model.User;
import com.tuanhm.cmcex1.repository.PermissionRepository;
import com.tuanhm.cmcex1.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    private final UserMapper userMapper;

    @Override
    public List<UserDto> getAll(String permissionName) {
        return userRepository.findAll().
                stream().
                map(userMapper::toDto).
                collect(Collectors.toList());
    }
    @Override
    @Transactional
    public User saveOrUpdate(User user) {
        return userRepository.save(user);
    }
}
