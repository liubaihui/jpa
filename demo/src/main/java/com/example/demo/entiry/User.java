package com.example.demo.entiry;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.persistence.*;
/**
 * @author LIUBAIHUI
 * @date 2019/11/9
 */
@Entity
@Table(name = "t_user")
@Data
@Accessors(chain = true)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "t_name")
    private String name;
    @Column(name = "t_address")
    private String address;
}
