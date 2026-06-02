package com.workshop.week8.model.task_system;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

import java.math.BigDecimal;

@Data
@Entity
@DiscriminatorValue("BILLABLE")
public class BillableTask extends Task{

    @Column(name = "hourly_rate")
    private BigDecimal hourlyRate;
}
