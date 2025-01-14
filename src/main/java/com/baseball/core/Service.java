package com.baseball.core;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.security.PublicKey;
import java.util.HashSet;
import java.util.Random;

import static com.baseball.util.Constants.*;

@AllArgsConstructor
@Getter
@Setter

public class Service {

    private final Repository repository;

    //Random 으로 세 자릿수를 생성해 버리면 중복되는 숫자가 등장할 수도 있음!!!
    //중복을 허용하지 않는 set 자료구조를 이용해서 만들기
    public void generateAnswerNumber() {
        HashSet<Integer> uniqueNumbers = new HashSet<>();
        Random random = new Random();
        while (uniqueNumbers.size() < COUNT_OF_NUMBERS) {
            uniqueNumbers.add(random.nextInt(MIN_NUMBER, MAX_NUMBER) + 1);
        }

        int i = 0;
        for (Integer num : uniqueNumbers) {
            repository.getGenerateNumber()[i++] = num;
        }
    }

    //생성한 값이랑 입력한 값이 같은지 체크하는 로직
    public int[] check() {
        int strike = 0;
        int ball = 0;
        for (int i = 0; i < COUNT_OF_NUMBERS; i++) {
            for (int j = 0; j < COUNT_OF_NUMBERS; j++) {
                if (repository.getAnswer()[i] == repository.getGenerateNumber()[j]) {
                    if (i == j) {
                        strike++;
                    } else ball++;
                }
            }
        }
        return new int[]{strike, ball};
    }

    public int[] getAnswer() {
        return repository.getAnswer();
    }

    public HashSet<Integer> getDigits() {
        return getDigits();
    }
}
