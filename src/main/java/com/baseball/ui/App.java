package com.baseball.ui;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
@Getter
public class App {
    //프로그램의 전체적인 흐름 관리

    private final Controller controller;

    public void run() {
        controller.playBaseballGame();
    }
}
