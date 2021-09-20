package com.htc.user.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.htc.user.entity.User;

public interface IUserInterface extends JpaRepository<User, Long> {

}
