package com.ntd.aritmetic.calculator.domain.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import java.time.LocalDateTime;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "records")
@Getter
@Setter
@ToString
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RecordEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private UUID id;
    @NotNull
    @Column(name = "amount")
    private Double amount;
    @NotNull
    @Column(name = "user_balance")
    private Double userBalance;
    @NotNull
    @Column(name = "operation_response")
    private String operationResponse;
    @NotNull
    @Column(name = "creation_date")
    private LocalDateTime creationDate;
    @NotNull
    @Column(name = "user_id")
    private UUID userId;
    @NotNull
    @Column(name = "operation_id")
    private UUID operationId;
}
