package com.example.fishbuoy.repository;
import com.example.fishbuoy.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
public interface UserRepository extends JpaRepository<User,String> {
}
