package com.vworks.hs.home_service.models.response.parameter;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class PostGetParameterResBody {
    private String code;
    private String name;
    private String parameterTypeCode;
    private String status;
    private String description;
    private String createdDate;
    private String createdBy;
    private String updatedDate;
    private String updatedBy;
}
