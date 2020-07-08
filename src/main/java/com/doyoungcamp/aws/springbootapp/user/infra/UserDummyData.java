package com.doyoungcamp.aws.springbootapp.user.infra;

import com.doyoungcamp.aws.springbootapp.user.domain.User;

import java.util.ArrayList;
import java.util.List;

public class UserDummyData {
    private static final List<User> userDummyData = new ArrayList<>();

    static {
        userDummyData.add(User.builder()
                .email("doyoung@email.com")
                .nickName("doyoung")
                .password("1234")
                .build());
        userDummyData.add(User.builder()
                .email("youngChan@email.com")
                .nickName("youngChan")
                .password("1234")
                .build());
        userDummyData.add(User.builder()
                .email("sojin@email.com")
                .nickName("1cow")
                .password("1234")
                .build());
        userDummyData.add(User.builder()
                .email("g1@email.com")
                .nickName("g1")
                .password("1234")
                .build());
    }

    public static List<User> get() {
        return userDummyData;
    }
}
