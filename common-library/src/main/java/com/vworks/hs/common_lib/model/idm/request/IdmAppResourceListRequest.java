package com.vworks.hs.common_lib.model.idm.request;

import com.fasterxml.jackson.annotation.JsonInclude;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class IdmAppResourceListRequest {
    @NotEmpty
    private String realm;
    @NotEmpty
    private String clientId;
    private String key;
    private Integer first;
    private Integer max;
}
