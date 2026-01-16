package backend.controller;

import backend.service.MaintenanceService;

public class MaintenanceController {

    MaintenanceService maintenanceService;

    public MaintenanceController(MaintenanceService maintenanceService) {
        this.maintenanceService = maintenanceService;
    }

    public String getRequests() {
        return maintenanceService.getAllRequests();
    }
}

