package com.jung.admin.domain.posts;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor //기본생성자추가
@Entity //테이블과 링크될 클래스
public class Posts {

    @Id //pk
    @GeneratedValue(strategy = GenerationType.IDENTITY) // pk생성규칙 autoincreament
    private Long id;

    @Column(length = 500, nullable = false)
    private String title;

    @Column(columnDefinition =  "TEXT", nullable = false)
    private String content;

    private String author;

    @Builder
    public Posts(String title, String content, String author){
        this.title = title;
        this.content = content;
        this.author =author;

    }
}
