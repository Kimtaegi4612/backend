package org.example.demoex.controllers;

import org.example.demoex.dto.News;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

// Rest API 위한 컨트롤러 테스트
// 화면(html)이 없는 응답 내용 전송


@RestController
public class ApiController {
    @GetMapping("/api")
    public News api() {
        return News.builder()
                .title("스포츠 뉴스")
                .content("토트넘 리버풀 경기")
                .author("기자")
                .build();
    }
}
