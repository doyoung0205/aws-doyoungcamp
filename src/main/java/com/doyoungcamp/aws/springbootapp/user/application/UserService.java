package com.doyoungcamp.aws.springbootapp.user.application;

import com.doyoungcamp.aws.springbootapp.user.domain.User;
import com.doyoungcamp.aws.springbootapp.user.infra.UserDummyData;
import com.doyoungcamp.aws.springbootapp.user.infra.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.thymeleaf.expression.Lists;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    @Transactional
    public void insertDummies() {
        userRepository.saveAll(UserDummyData.get());
    }

    @Transactional(readOnly = true)
    public List<User> getAllUserList() {
        final List<User> userList = new ArrayList<>();
        final Iterable<User> userIterable = userRepository.findAll();
        userIterable.forEach(userList::add);
        return userList;
    }
}
