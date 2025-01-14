package com.baseball.ui;

import com.baseball.core.Service;
import lombok.AllArgsConstructor;

import static com.baseball.util.Constants.*;

@AllArgsConstructor
public class InputValidator {

    private final Service service;

    public boolean inputCorrectNumber(int input) {
        for (int i = COUNT_OF_NUMBERS - 1; i >= 0; i--) {
            int digit = input % 10;
            if (!service.getDigits().add(digit)) {
                System.out.println("중복되지 않는 숫자를 입력해 주세요!");
                return true;
            }
            service.getAnswer()[i] = digit;
            input = input / 10;
        }
        return false;
    }
}
