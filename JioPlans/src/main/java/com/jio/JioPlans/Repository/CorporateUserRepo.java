package com.jio.JioPlans.Repository;

import com.jio.JioPlans.Entity.CorporateUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CorporateUserRepo extends JpaRepository<CorporateUser, Long> {
}
