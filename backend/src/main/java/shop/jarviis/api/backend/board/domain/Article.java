package shop.jarviis.api.backend.board.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;
import shop.jarviis.api.backend.user.domain.User;

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

    @Column @NotNull private String title;
//    name 같으면 생략 가능

    @Column @NotNull private String content;

    @Column(name = "written_date") @NotNull
    private String writtenDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false, updatable = false)
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", insertable = false, updatable = false)
    private User item;


}
