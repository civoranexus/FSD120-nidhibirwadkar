package com.society360.backend.service;

import com.society360.backend.model.MaintenanceRequest;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MaintenanceService {

    public List<MaintenanceRequest> getAllRequests() {
        return List.of(
            new MaintenanceRequest(1, "Water leakage", "Open"),
            new MaintenanceRequest(2, "Lift issue", "In Progress")
        );
    }
}
