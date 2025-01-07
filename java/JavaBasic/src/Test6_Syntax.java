/*
* 변수 문법
* - Modifiers Type 변수
*       - [] 생략 가능
* Modifiers => 사용 목적이 존재할때만 사용
*   - access Modifiers : 접근 제어자
*   - nan-acces|gerneral Modifiers : 일반
*   - 2가지는 혼용 사용 가능, 서열 x
* - Type
*   - 원시 타입(8개)
*   - 참조 타입
* - 변수명
*   - 카멜 표기법
*       - 소문자로 시작, 이어지는 글자 대문자, 다시 대문자
*       - 알파벳시작. _시작 가능, 두번째부터 숫자 가능
*       - 알파멧만 사용! (간단)ㅐ
* */

public class Test6_Syntax {
    // 전역 변수 자리(범위 기준)
    // public: 모든 다른 클래스, 내부등등 다 접근 가능하다
    // static : 메모리 탑레벨, static 메소드에서만 사용 가능
    // 정수형 그릇에 100이라는 값이 세팅 되었다. => 힙에 메모리 존재한다(참고)
    public static int score = 100;
    static public int score1 = 100;
    public int score2 = 100;
    static int score3 = 100;
    // 최소
    int age = 100; // js => let age = 100;

    // 메소드
    public static void main(String[] args) {
        // 지역 변수 자리(범위 기준)
        // 가장 많이 사용하는 유형
        int level = 5; //static 아닌데? 가능한데? -> 지역이니까! 사용 가능
        System.out.println(level);
        System.out.println(score);
        System.out.println(score1);
        System.out.println(score3);
        // 메소드가 staic이라서 System.out.println(score2); non-static 사용 불가, 에러

        // 메소드 호출(호출해야 의미를 가짐)
        sum(100,5);

    }

    // 메소드(JS의 함수) 문법
    /*
    * [Modifiers] 리턴타입 메소드명 (parameters) {
    *       statements(수행문)
    *       [ return [값]]:
    * }
    *
    *   - [Modifiers] : 변수와 동일 규칙, 종류(일반 모디파이어)만 다름
    *   - 리턴타입(3개유형) : 원시타입(8개), 참조형(무한대), void <- 추가됨: 반환값 없다.
    *   - parameters : 매개변수 특이점 없음
    *   - statements : 수행문, 특이점 없음
    *   - return : 생략 가능함, return 이 없거나, return만 존재하면 -> 리턴타입 void 사용
    *
    * */
    // 풀버전
    public static
    void // 리턴타입
    sum(int a, int b)
    { // 메소드명(parameters)//
            int c = a + b;
            ; //statements
            System.out.println(c); //statements
            //최소 버전: Js와 유사

    }
        int add(int a, int b){
            return a + b;
        }
}
