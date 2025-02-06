package com.jio.JioPlans.DTO;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor

public class CUdto {
    public long getCorporateUserId() {
        return corporateUserId;
    }

    public void setCorporateUserId(long corporateUserId) {
        this.corporateUserId = corporateUserId;
    }

    public String getCorporateUserName() {
        return corporateUserName;
    }

    public void setCorporateUserName(String corporateUserName) {
        this.corporateUserName = corporateUserName;
    }

    public String getCorporatePlanType() {
        return corporatePlanType;
    }

    public void setCorporatePlanType(String corporatePlanType) {
        this.corporatePlanType = corporatePlanType;
    }

    public long getCorporateRegisteredNumber() {
        return corporateRegisteredNumber;
    }

    public void setCorporateRegisteredNumber(long corporateRegisteredNumber) {
        this.corporateRegisteredNumber = corporateRegisteredNumber;
    }

    public long corporateUserId;
    public long corporateRegisteredNumber;
    public String corporateUserName;
    public String corporatePlanType;
}
