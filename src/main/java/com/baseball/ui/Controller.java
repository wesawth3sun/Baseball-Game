package com.baseball.ui;

import com.baseball.core.Service;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Scanner;

@AllArgsConstructor
@Getter
@Setter
public class Controller {

    private final Scanner scanner;
    private final Service service;
    private final InputValidator inputValidator;

    void playBaseballGame() {
        service.generateAnswerNumber();
        System.out.println("숫자 야구에 오신 것을 환영합니다.");
        while (true) {
            if (inputAnswerNumber()) {
                break;
            }
            int[] result = service.check();
            if (result[0] == 3) {
                System.out.println("3스트라이크!");
                System.out.println("정답입니다!");
                break;
            } else {
                System.out.println(result[0] + " 스트라이크, " + result[1] + " 볼");
            }
        }
        System.out.println("게임을 종료합니다.");
    }

    private boolean inputAnswerNumber() {
        while (true) {
            System.out.print("세자리 수 값을 입력하세요 (0 입력시 종료): ");
            int input = scanner.nextInt();
            if (input == 0) {
                return true;
            }

            if (input < 100 || input > 999) {
                System.out.println("세자리 수를 입력해 주세요: ");
                return false;
            }

            if (inputValidator.inputCorrectNumber(input)) return false;
        }
    }
}
