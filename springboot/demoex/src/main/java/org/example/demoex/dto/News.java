package org.example.demoex.dto;

import lombok.Builder;
import lombok.Setter;
import lombok.Getter;
import lombok.ToString;


/**
 * 롬북 테스트용
 * 데이터를 담는 그릇으로 class를 정의
 * 이 데이터를 관리하는 메소드등을 자동 생성 제공
 */
@Setter // setter와넝
@Getter //getter 완성
@ToString // 객체를 설명하는 메소드 자동생성(모든 필드를 보여줌) 객체명.toString()
@Builder // 객체 생성 및 데이터 세팅을 간단하게 사용가능하게 기능 제공
public class News {
    // 데이터를 클래스 내부에 숨긴다 -> private -> 외부 접근 x -> getter/setter를 활용하여 접근
    // 데이터 클레스의 멤버 필드
    private String title;
    private String content;
    private String author;

    // 메소드를 툴을 통해서 자동생성(롬복 존재 모른다는 가정)

//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getContent() {
//        return content;
//    }
//
//    public void setContent(String content) {
//        this.content = content;
//    }
//
//    public String getAuthor() {
//        return author;
//    }
//
//    public void setAuthor(String author) {
//        this.author = author;
//    }
}
