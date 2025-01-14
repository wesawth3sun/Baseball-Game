package com.baseball;

import com.baseball.core.Repository;
import com.baseball.core.Service;
import com.baseball.ui.App;
import com.baseball.ui.Controller;
import com.baseball.ui.InputValidator;

import java.util.HashSet;
import java.util.Scanner;

import static com.baseball.util.Constants.COUNT_OF_NUMBERS;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Repository repository = new Repository(new int[COUNT_OF_NUMBERS], new int[COUNT_OF_NUMBERS], new HashSet<>());
        Service service = new Service(repository);
        InputValidator inputValidator = new InputValidator(service);
        Controller controller = new Controller(scanner, service, inputValidator);

        App app = new App(controller);
        app.run();

        scanner.close();
    }
}
