package com.example.demo.repository;

import com.example.demo.entiry.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author LIUBAIHUI
 * @date 2019/11/9
 */
public interface TestRepository extends JpaRepository<User,Integer> {
}
