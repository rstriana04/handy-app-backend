package com.handy.app.handyappbackend.repository;


import com.handy.app.handyappbackend.models.ServiceReport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IServiceReportRepository extends JpaRepository<ServiceReport, Long> {
    @Modifying(clearAutomatically = true)
    @Query(value = "SELECT s FROM ServiceReport s WHERE s.staffIdentification = ?1 AND s.week = ?2")
    List<ServiceReport> selectServiceReportsByStaffAndWeek(String staffIdentification, Long week);
}
