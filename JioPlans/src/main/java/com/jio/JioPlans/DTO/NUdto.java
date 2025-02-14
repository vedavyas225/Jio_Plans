package com.jio.JioPlans.DTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class NUdto {

    public long normalUserId;

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

    public long normalRegisteredNumber;
    public String normalUserName;
    public String normalPlanType;
}
