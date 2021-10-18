package shop.jarviis.api.backend.user.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import shop.jarviis.api.backend.board.domain.Article;

import java.util.List;

@Getter @Setter @ToString
public class UserSerializer {
    private static final long serialVersionID = 1L;

    private long userId;
    private String username;
    private String password;
    private String name;
    private String email;
    private String regDate;
    private List<Article> articleList;

    @Builder
    UserSerializer(long userId, String username, String password, String name,
                   String email, String regDate ){
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.regDate = regDate;
    }
    @Builder
    UserSerializer(long userId, String username, String password, String name,
                   String email, String regDate, List<Article> articleList ){
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.name = name;
        this.email = email;
        this.regDate = regDate;
        this.articleList = articleList;
    }

}
