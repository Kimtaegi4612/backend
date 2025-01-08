package org.example.demoex.controllers;

import org.example.demoex.dto.News;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    // 기본 URL 처리
    @GetMapping("/")
    public String home() {

        // News 객체 생성
        News news = News.builder()
                .title("스포츠 뉴스")
                .content("토트넘 리버풀 경기")
                .author("기자")
                .build();

        // 전체 데이터 출력
        System.out.println(news.toString());

        // 개별 데이터 출력
        System.out.println(news.getAuthor());
        System.out.println(news.getTitle());
        System.out.println(news.getContent());

        // 내용 변경 및 출력
        news.setContent("3:6");
        System.out.println(news.getContent());

        return "index"; // View Resolver가 index.html 또는 index.jsp를 찾음
    }

    // 특정 URL에 대한 처리
    @GetMapping("/test/news/sports")
    public String sports() {
        return "sports";
    }

    // 요청 파라미터 처리
    @GetMapping("/news")
    @ResponseBody
    public String news(@RequestParam(value = "id") String id,
                       @RequestParam(value = "servicetype") String servicetype) {
        return "news " + id + " " + servicetype;
    }

    // PathVariable과 RequestParam 함께 사용
    @GetMapping("/news/{nid}")
    @ResponseBody
    public String news2(@PathVariable("nid") String nid,
                        @RequestParam(value = "id") String id,
                        @RequestParam(value = "servicetype") String servicetype) {
        return nid + " <- news " + id + " " + servicetype;
    }
}
