package com.lti.gisdemo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.gisdemo.entity.User;

@Repository
public interface GISRepository extends JpaRepository<User, Long>{

}
