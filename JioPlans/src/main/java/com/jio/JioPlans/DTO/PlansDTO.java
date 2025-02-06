package com.jio.JioPlans.DTO;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class PlansDTO {
    // commenting on dto
    public long planId;

    public String getPlanData() {
        return planData;
    }

    public void setPlanData(String planData) {
        this.planData = planData;
    }

    public long getPlanId() {
        return planId;
    }

    public void setPlanId(long planId) {
        this.planId = planId;
    }

    public long getCalls() {
        return calls;
    }

    public void setCalls(long calls) {
        this.calls = calls;
    }

    public String getPlanDuration() {
        return planDuration;
    }

    public void setPlanDuration(String planDuration) {
        this.planDuration = planDuration;
    }

    public String getPlanSpeed() {
        return planSpeed;
    }

    public void setPlanSpeed(String planSpeed) {
        this.planSpeed = planSpeed;
    }

    public String planData;
    public long calls;
    public String planDuration;
    public String planSpeed;
}
