import java.util.Scanner;

/*
*   흐름제어
*   - 조건문 : if ~ else if ~else ~
*       - 콘솔 입력 사용
*   - 반복문 : for~, do ~while, while ~, continuem break
*   - 게임 제작(간단)
*       - 콘솔 입력 사용
*
** */
public class Test3 {
    public static void main(String[] args) {
        //조건문 연습
        flowcontrol1();
    }
    private static void flowcontrol1() {
        // 1. 콘솔 입력
        Scanner sc = new Scanner(System.in); // 콘솔에서 사용자 입력 대기하는 코드
        while (true) {
            System.out.println("Enter number: ");
            // 2. 사용자 입력후 앤터 => 값이 반환
            int userInputValue = sc.nextInt(); // 입력 대기
            // 3. 만약 100을 입력했다면, 종료 혹은 반복문 탈출
            if (userInputValue == 100) break;
            // 4. 조건식 사용
            if (userInputValue > 10 ){
                System.out.println("10보다 초과한다.");
            }else{
                System.out.println("10보다 작다");
            }
        }
        // 입력 닫기
        sc.close();
    }
}
