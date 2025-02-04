package com.jio.JioPlans.Repository;

import com.jio.JioPlans.Entity.Plans;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlansRepo extends JpaRepository<Plans, Long> {
}
