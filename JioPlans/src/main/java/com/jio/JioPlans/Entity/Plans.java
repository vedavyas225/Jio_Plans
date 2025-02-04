package com.jio.JioPlans.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Plans {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long planId;
    private String planData;
    private long calls;

    public long getPlanId() {
        return planId;
    }

    public void setPlanId(long planId) {
        this.planId = planId;
    }

    public String getPlanData() {
        return planData;
    }

    public void setPlanData(String planData) {
        this.planData = planData;
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

    private String planDuration;
    private String planSpeed;
}
