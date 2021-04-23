package com.handy.app.handyappbackend.controllers;


import com.handy.app.handyappbackend.models.ServiceReport;
import com.handy.app.handyappbackend.services.ServiceReportService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin(origins = {"http://localhost:4200"})
@RequestMapping("/api")
public class ServiceReportController {

    private final ServiceReportService serviceReportService;

    ServiceReportController(ServiceReportService serviceReportService) {
        this.serviceReportService = serviceReportService;
    }


    @GetMapping("/service-report/{staffIdentification}/{week}")
    public List<ServiceReport>
    getServiceReportByStaffAndWeek(
            @PathVariable String staffIdentification, @PathVariable Long week) {
        return serviceReportService.getServiceReportByStaffAndWeek(staffIdentification,
                week);
    }


    @PostMapping("/service-report")
    public List<ServiceReport> createServiceReport(@RequestBody List<ServiceReport> serviceReports) {
        return serviceReportService.createServiceReports(serviceReports);
    }


}
