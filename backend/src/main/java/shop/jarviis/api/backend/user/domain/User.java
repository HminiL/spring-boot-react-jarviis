package shop.jarviis.api.backend.user.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data @Component @Table(name = "users")
public class User {
    @Id
    @Column(name="user_id")
    @GeneratedValue
    private long userId;

    @Column
    private String username;

    @Column
    private String password;

    @Column
    private String name;

    @Column
//    ???email 뭐야
    private String email;

    @Column(name = "reg_date")
    private String regDate;
}
