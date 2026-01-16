package backend.controller;

import backend.service.BillingService;

public class BillingController {

    BillingService billingService;

    public BillingController(BillingService billingService) {
        this.billingService = billingService;
    }

    public String getBills() {
        return billingService.getAllBills();
    }
}
