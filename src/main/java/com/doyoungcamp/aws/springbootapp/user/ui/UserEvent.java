package com.doyoungcamp.aws.springbootapp.user.ui;

import com.doyoungcamp.aws.springbootapp.user.application.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class UserEvent {

    private final UserService memberService;

    @EventListener(ApplicationReadyEvent.class)
    public void initData() {
        memberService.insertDummies();
    }

}
