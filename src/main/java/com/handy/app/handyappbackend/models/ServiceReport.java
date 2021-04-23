package com.handy.app.handyappbackend.models;


import com.sun.istack.NotNull;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity()
@Table(name = "service_reports")
public class ServiceReport {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String staffIdentification;

    @NotNull
    private String serviceIdentification;

    @NotNull
    private String dateFrom;

    @NotNull
    private String dateUntil;

    @NotNull
    private String hourFrom;

    @NotNull
    private String hourUntil;

    private Long week;


}
