package com.tuanhm.cmcex1.repository;


import com.tuanhm.cmcex1.dto.UserDto;
import com.tuanhm.cmcex1.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
    User save(User user);
}
