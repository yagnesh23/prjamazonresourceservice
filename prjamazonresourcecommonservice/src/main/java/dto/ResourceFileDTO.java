package dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResourceFileDTO {
    private Long id;
    private Integer userId;
    private String fileName;
    private FileExtension fileExtension;
    private String location;
    private FileType type;
    private LocalDateTime uploadedAt;
    private Integer updatedBy;
    private LocalDateTime deletedAt;
    private Boolean isDeleted;
    private Integer deletedBy;

}


