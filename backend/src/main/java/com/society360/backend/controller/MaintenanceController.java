package com.society360.backend.controller;

import com.society360.backend.model.MaintenanceRequest;
import com.society360.backend.service.MaintenanceService;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class MaintenanceController {

    private final MaintenanceService service;

    public MaintenanceController(MaintenanceService service) {
        this.service = service;
    }

    @GetMapping("/maintenance")
    public List<MaintenanceRequest> getMaintenance() {
        return service.getAllRequests();
    }
}
