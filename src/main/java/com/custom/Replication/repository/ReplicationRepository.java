package com.custom.Replication.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import com.custom.Replication.entity.ReplicationDetails;

public interface ReplicationRepository extends JpaRepository<ReplicationDetails, Long> {
}
