package com.workshop.week8.model.task_system;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
@DiscriminatorValue("INTERNAL")
public class InternalTask extends Task {
}
