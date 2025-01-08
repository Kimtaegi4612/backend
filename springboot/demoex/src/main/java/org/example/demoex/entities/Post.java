package org.example.demoex.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDateTime;

/**
 * 본글에 대한 엔티티, post 테이블 대변
 *
 */

@Entity
@Setter
@Getter
public class Post {
    // 컬럼 나열
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    // 크기 커스텀 설정
    @Column(length = 256)
    private String subject;

        // 65536 크기 입력 가능
    @Column(columnDefinition = "TEXT")
    private String content;

    // 커스텀 컬럼 생략
    private LocalDateTime createDate;
}
