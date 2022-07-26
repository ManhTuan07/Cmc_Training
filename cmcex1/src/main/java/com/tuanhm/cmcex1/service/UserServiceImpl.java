package com.tuanhm.cmcex1.service;

import com.tuanhm.cmcex1.converter.UserMapper;
import com.tuanhm.cmcex1.dto.UserDto;
import com.tuanhm.cmcex1.model.User;
import com.tuanhm.cmcex1.repository.UserRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@Service

public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final UserMapper userMapper;

    public UserServiceImpl(UserRepository userRepository, UserMapper userMapper) {
        this.userRepository = userRepository;
        this.userMapper = userMapper;
    }

    @Override
    public List<UserDto> getAll() {
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

    @Override
    public Page<UserDto> getPage(Pageable pageable) {
        return userRepository.findAll(pageable).map(userMapper::toDto);
    }

    @Override
    public UserDto getOne(Long id) {
        return userDto(userRepository.findById(id).orElseThrow(()-> new IllegalStateException("User not found")));
    }

    @Override
    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    private UserDto userDto(User user) {
        return userMapper.toDto(user);
    }
}
