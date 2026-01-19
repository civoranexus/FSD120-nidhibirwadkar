package backend.controller;

import backend.service.VisitorService;

public class VisitorController {

    VisitorService visitorService;

    public VisitorController(VisitorService visitorService) {
        this.visitorService = visitorService;
    }

    public String getVisitors() {
        return visitorService.getAllVisitors();
    }

    public String createVisitor() {
        return visitorService.addVisitor();
    }
}
