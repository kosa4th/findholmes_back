package org.detective.services.detective;

//import org.detective.repository.DetectiveRepository;
import org.detective.entity.Detective;
import org.detective.repository.DetectiveRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DetectiveService {

    @Autowired
    private DetectiveRepository detectiveRepository;

    public Detective getDetectiveByUserId(Long userId) {
        // userId로 Detective를 조회
        Optional<Detective> detectiveOptional = detectiveRepository.findByUserUserId(userId);

        // 결과가 있으면 반환하고, 없으면 예외를 던질 수 있습니다
        return detectiveOptional.orElseThrow(() -> new RuntimeException("Detective not found for userId: " + userId));
    }
}
