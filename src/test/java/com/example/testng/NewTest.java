package com.example.testng;

import io.qameta.allure.*;
import org.testng.annotations.Test;

public class NewTest {
    @Test(description = "Простой тест с шагами и аннотациями Allure")
    @Severity(SeverityLevel.NORMAL)
    @Feature("Базовая проверка")
    @Story("Как пользователь, я хочу увидеть работающий Allure отчёт")
    public void sampleTest() {
        stepOne();
        stepTwo();
    }

    @Step("Шаг 1: Проверяем первый шаг")
    public void stepOne() {
        System.out.println("Step 1 executed");
    }

    @Step("Шаг 2: Проверяем второй шаг")
    public void stepTwo() {
        System.out.println("Step 2 executed");
    }
}
