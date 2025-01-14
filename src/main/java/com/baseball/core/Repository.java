package com.baseball.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;

@AllArgsConstructor
@Getter
@Setter

public class Repository {

    //사용자에게 입력 받을 값
    private final int[] answer;
    //프로그램에서 자체적으로 생성할 값
    private final int[] generateNumber;
    private final HashSet<Integer> digits;
}
