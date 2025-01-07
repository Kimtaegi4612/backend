package com.example.demo.basic;/*
* 컬렉션(*) API
*       - 데이터베이스 연동 후 가져오는 데이터는 => 컬렉션으로 처리됨!
*       - 멤버를 얼마든지 추가 삭제 가능함
* - List
*   - 순서가 있다.
*   - ArrayList, LinkedList, ...
* - Set
*   - 중복 데이트가 없다(중복제거)
*   - HashSet, TreeSet
* - Map
*   - 키와 값 형태로 보관
*   - HashSet, TreeMap
* */

import java.util.ArrayList;
import java.util.List;

public class Test5 {
    public static void main(String[] args) {
        // 1. List, 순서(*) 존재, 중복 가능함
        {
            // 저장 공간 준비
            // 유형 => 제네릭 표현(범용성등 목적)
            //ArrayList : 자식, List: 부모
            List<String> temp = new ArrayList<>(); // new의 표현은 클래스명() => 객체 생성
            System.out.println(temp); // []

            // 더미데이터 사용 <- 가변크기, 언제든지 멤버를 추가할 수 있다.
            temp.add("a");
            temp.add("b");
            temp.add("c");
            System.out.println(temp);
        }
    }
}
