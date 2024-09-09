package org.detective.services.admin;

import org.detective.entity.DetectiveApproval;
import org.detective.repository.DetectiveApprovalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DetectiveApprovalService {

    @Autowired
    private DetectiveApprovalRepository detectiveApprovalRepository;

    public List<DetectiveApproval> findAll() {
        return detectiveApprovalRepository.findAll();
    }

    // 엔티티 저장 로직
    public DetectiveApproval save(DetectiveApproval detectiveApproval) {
        return detectiveApprovalRepository.save(detectiveApproval);
    }

}
