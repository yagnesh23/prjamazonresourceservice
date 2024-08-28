package com.amazon.repository;

import com.amazon.entity.ResourceFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ResourceFileRepository extends JpaRepository<ResourceFile,Long> {
}
