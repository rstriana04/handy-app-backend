package com.handy.app.handyappbackend.services;


import com.handy.app.handyappbackend.models.ServiceReport;
import com.handy.app.handyappbackend.repository.IServiceReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ServiceReportService {

    @Autowired
    private IServiceReportRepository iServiceReportRepository;

    public List<ServiceReport> getAllReportServices() {
        return iServiceReportRepository.findAll();
    }

    public ServiceReport createServiceReport(ServiceReport serviceReport) {
        return iServiceReportRepository.save(serviceReport);
    }

    public List<ServiceReport>
    getServiceReportByStaffAndWeek(String staffIdentification, Long week) {
        return iServiceReportRepository.selectServiceReportsByStaffAndWeek(staffIdentification,
                week);
    }

    public List<ServiceReport> createServiceReports(List<ServiceReport> serviceReports) {
        return iServiceReportRepository.saveAll(serviceReports);
    }

}
