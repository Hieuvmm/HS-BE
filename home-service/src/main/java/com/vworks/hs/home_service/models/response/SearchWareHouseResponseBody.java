package com.vworks.hs.home_service.models.response;

import com.vworks.hs.home_service.models.SearchWareHouseModel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SearchWareHouseResponseBody {
    private List<SearchWareHouseModel> searchWareHouseModelList;
    private String totalPage;
    private long totalElement;
}
