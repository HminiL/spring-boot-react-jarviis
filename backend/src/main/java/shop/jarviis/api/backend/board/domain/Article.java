package shop.jarviis.api.backend.board.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data @Component @Table(name = "articles")
public class Article {
    @Id
    @Column(name ="article_id")
    @GeneratedValue
    private long articleId;
//  @Id : primary key 라는 뜻
//    GeneratedValue 자동 생성

    @Column private String title;
//    name 같으면 생략 가능

    @Column private String content;

    @Column(name = "written_date")
    private String writtenDate;


}
