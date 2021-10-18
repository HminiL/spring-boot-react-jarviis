package shop.jarviis.api.backend.user.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;
import shop.jarviis.api.backend.board.domain.Article;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data @Component @Table(name = "users")
public class User {
    @Id
    @Column(name="user_id")
    @GeneratedValue
    private long userId;

    @Column @NotNull
    private String username;

    @Column @NotNull
    private String password;

    @Column @NotNull
    private String name;

    @Column @NotNull
//    ???email 뭐야
    private String email;

    @Column(name = "reg_date") @NotNull
    private String regDate;

    @OneToMany(mappedBy = "user")
    private List<Article> articleList = new ArrayList<>();
}
