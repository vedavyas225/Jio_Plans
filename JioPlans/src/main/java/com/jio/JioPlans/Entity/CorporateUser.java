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
public class CorporateUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long corporateUserId;

    public long getCorporateRegisteredNumber() {
        return corporateRegisteredNumber;
    }

    public void setCorporateRegisteredNumber(long corporateRegisteredNumber) {
        this.corporateRegisteredNumber = corporateRegisteredNumber;
    }

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

    private long corporateRegisteredNumber;
    private String corporateUserName;
    private String corporatePlanType;
}
