package org.detective.repository;

import org.detective.entity.Detective;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface DetectiveRepository extends JpaRepository<Detective, Long> {
    Optional<Detective> findByUserUserId(Long userId);
}
