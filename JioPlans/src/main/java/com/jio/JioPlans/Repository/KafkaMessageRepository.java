package com.jio.JioPlans.Repository;

import com.jio.JioPlans.Entity.KafkaMessage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KafkaMessageRepository extends JpaRepository<KafkaMessage, Long> {

}
