package com.amazon.service;

import com.amazon.entity.ResourceFile;
import com.amazon.mapper.ResourceFileMapper;
import com.amazon.repository.ResourceFileRepository;
import dto.ResourceFileDTO;
import org.springframework.stereotype.Service;

@Service
public class ResourceFileService {

    private final ResourceFileRepository resourceFileRepository;

    private final ResourceFileMapper mapper;

    public ResourceFileService(ResourceFileRepository resourceFileRepository, ResourceFileMapper mapper) {
        this.resourceFileRepository = resourceFileRepository;
        this.mapper = mapper;
    }

    public ResourceFileDTO createResource(ResourceFileDTO resourceFileDTO) {
        ResourceFile save = resourceFileRepository.save(mapper.map(resourceFileDTO));
       return mapper.map(save);
    }
}
