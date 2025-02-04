package com.jio.JioPlans.Repository;

import com.jio.JioPlans.Entity.NormalUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NormalUserRepo extends JpaRepository<NormalUser, Long> {
}
