package com.vworks.hs.home_service.models.request.warehouse;

import lombok.Data;

@Data
public class SearchWareHouseRequestBody {
    private String status;
    private String keyword;
    private String pageNumber;
    private String pageSize;
}
