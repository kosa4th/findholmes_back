package org.detective.repository;

import org.detective.entity.DetectiveApproval;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DetectiveApprovalRepository extends JpaRepository<DetectiveApproval, Long> {
    // JpaRepository는 기본적으로 findAll 메서드를 제공합니다.
}
