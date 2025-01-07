package com.example.demo.basic;

import java.util.Scanner;

/*
 * 흐름제어
 * - 조건문: if ~ else if ~ else
 *   - 콘솔 입력 사용
 * - 반복문: for, do-while, while, continue, break
 */

public class Test3 {
    public static void main(String[] args) {
        // 조건문 연습
        flowcontrol1();
    }

    private static void flowcontrol1() {
        // 콘솔 입력
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 입력하세요. (100을 입력하면 종료됩니다)");

        while (true) {
            try {
                // 사용자 입력
                System.out.print("Enter number: ");
                int userInputValue = sc.nextInt();

                // 100 입력 시 반복문 탈출
                if (userInputValue == 100) {
                    System.out.println("프로그램을 종료합니다.");
                    break;
                }

                // 조건문: 10보다 큰지 작은지 판단
                if (userInputValue > 10) {
                    System.out.println("10보다 초과합니다.");
                } else {
                    System.out.println("10 이하입니다.");
                }

            } catch (Exception e) {
                System.out.println("유효한 숫자를 입력하세요.");
                sc.nextLine(); // 잘못된 입력을 처리
            }
        }

        // 입력 닫기
        sc.close();
    }
}
