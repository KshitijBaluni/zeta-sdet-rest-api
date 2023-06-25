package com.example.demo.repository;

import com.example.demo.domain.User;
import org.springframework.data.repository.CrudRepository;

/**
 * User Repository.
 *
 * @author kshitijbaluni
 * @since 25 June 2023
 */
public interface UserRepository extends CrudRepository<User, Long> {
}
