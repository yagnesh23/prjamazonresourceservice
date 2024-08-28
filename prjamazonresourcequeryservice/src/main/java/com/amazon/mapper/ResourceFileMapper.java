package com.amazon.mapper;

import com.amazon.entity.ResourceFile;
import dto.ResourceFileDTO;
import org.springframework.stereotype.Component;

@Component
public class ResourceFileMapper {




    public ResourceFileDTO map(ResourceFile resourceFile){
        ResourceFileDTO dto=new ResourceFileDTO();
        dto.setId(resourceFile.getId());

        dto.setFileName(resourceFile.getFileName());
dto.setLocation(resourceFile.getLocation());
dto.setDeletedAt(resourceFile.getDeletedAt());
dto.setIsDeleted(resourceFile.getIsDeleted());
dto.setDeletedBy(resourceFile.getDeletedBy());
dto.setUserId(dto.getUserId());
dto.setUpdatedBy(resourceFile.getUpdatedBy());
dto.setUploadedAt(resourceFile.getUploadedAt());
return dto;

    }
    public ResourceFile map(ResourceFileDTO resourceFileDTO) {
        ResourceFile resourceFile = new ResourceFile();
        resourceFile.setId(resourceFileDTO.getId());
        resourceFile.setFileName(resourceFileDTO.getFileName());
        resourceFile.setLocation(resourceFileDTO.getLocation());
        resourceFile.setDeletedAt(resourceFileDTO.getDeletedAt());
        resourceFile.setIsDeleted(resourceFileDTO.getIsDeleted());
        resourceFile.setDeletedBy(resourceFileDTO.getDeletedBy());
        resourceFile.setUserId(resourceFileDTO.getUserId());
        resourceFile.setUpdatedBy(resourceFileDTO.getUpdatedBy());
        resourceFile.setUploadedAt(resourceFileDTO.getUploadedAt());

//        // Convert enums from DTO to entity
//        if (resourceFileDTO.getFileExtension() != null) {
//            resourceFile.setFileExtension(resourceFileDTO.getFileExtension().name());
//        }
//        if (resourceFileDTO.getType() != null) {
//            resourceFile.setType(resourceFileDTO.getType().name());
//        }

        return resourceFile;
    }






}
