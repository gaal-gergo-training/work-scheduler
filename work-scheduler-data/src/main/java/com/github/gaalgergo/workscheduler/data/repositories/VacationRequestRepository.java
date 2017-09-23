package com.github.gaalgergo.workscheduler.data.repositories;

import com.github.gaalgergo.workscheduler.data.entities.VacationRequestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VacationRequestRepository extends JpaRepository<VacationRequestEntity, Long> {
}
