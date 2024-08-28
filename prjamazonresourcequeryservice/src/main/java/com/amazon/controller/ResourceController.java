package com.amazon.controller;

import com.amazon.service.ResourceFileService;
import dto.ResourceFileDTO;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/resource")
public class ResourceController {

    private  final ResourceFileService resourceFileService;

    public ResourceController(ResourceFileService resourceFileService) {
        this.resourceFileService = resourceFileService;
    }

    @PostMapping
    public ResponseEntity<ResourceFileDTO> createResource
        (@Validated @RequestBody ResourceFileDTO resourceFileDTO){
        return new ResponseEntity<>
                (  resourceFileService.createResource(resourceFileDTO), HttpStatus.CREATED);

    }


}
