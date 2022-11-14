package com.alkemy.wallet.repository;

import com.alkemy.wallet.enumeration.RoleList;
import com.alkemy.wallet.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

    User findByIdAndRole_Name(Integer id, RoleList rol);

    boolean existsByEmail(String email);

    User findByEmail(String email);
}
