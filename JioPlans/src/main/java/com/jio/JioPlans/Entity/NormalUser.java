package com.jio.JioPlans.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class NormalUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long normalUserId;

    public long getNormalRegisteredNumber() {
        return normalRegisteredNumber;
    }

    public void setNormalRegisteredNumber(long normalRegisteredNumber) {
        this.normalRegisteredNumber = normalRegisteredNumber;
    }

    public long getNormalUserId() {
        return normalUserId;
    }

    public void setNormalUserId(long normalUserId) {
        this.normalUserId = normalUserId;
    }

    public String getNormalUserName() {
        return normalUserName;
    }

    public void setNormalUserName(String normalUserName) {
        this.normalUserName = normalUserName;
    }

    public String getNormalPlanType() {
        return normalPlanType;
    }

    public void setNormalPlanType(String normalPlanType) {
        this.normalPlanType = normalPlanType;
    }

    private long normalRegisteredNumber;
    private String normalUserName;
    private String normalPlanType;
    private String address;
    private String country;
}
