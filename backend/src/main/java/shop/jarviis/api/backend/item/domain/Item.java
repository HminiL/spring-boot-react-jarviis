package shop.jarviis.api.backend.item.domain;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Entity
@Data @Component @Table(name = "items")
public class Item {
    @Id
    @Column(name="item_id")
    @GeneratedValue
    private long itemId;

    @Column(name = "item_brand")
    private String itemBrand;

    @Column(name = "item_name")
    private String itemName;

    @Column(name = "item_color")
    private String itemColor;

    @Column(name = "released_date")
    private String releasedDate;
}
