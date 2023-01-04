package jpabook.jpashop2.domain;

import jpabook.jpashop2.domain.item.Item;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter @Setter
public class Category {

    @Id @GeneratedValue
    @Column(name = "category_id")
    private Long id;

    private String name;

//    @ManyToMany
//    @JoinTable(name = "category_item",
//            joinColumns = @JoinColumn(name = "category_id"),
//            inverseJoinColumns = @JoinColumn(name = "item_id"))
//    private List<Item> item
}
