package org.detective.controller.Admin;

import org.detective.entity.DetectiveApproval;
import org.detective.services.admin.DetectiveApprovalService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private DetectiveApprovalService detectiveApprovalService;

    @GetMapping("/approvals")
    public List<DetectiveApproval> getAllApprovals() {
        return detectiveApprovalService.findAll();
    }


}
