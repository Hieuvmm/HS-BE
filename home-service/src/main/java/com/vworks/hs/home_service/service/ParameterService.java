package com.vworks.hs.home_service.service;

import com.vworks.hs.common_lib.exception.WarehouseMngtSystemException;
import com.vworks.hs.home_service.models.request.parameter.PostCreateOrUpdateParameterReqBody;
import com.vworks.hs.home_service.models.request.parameter.PostHandleByCodeParameterReqBody;
import com.vworks.hs.home_service.models.request.parameter.PostListParameterReqBody;
import com.vworks.hs.home_service.models.response.parameter.PostGetParameterResBody;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.data.domain.Page;

public interface ParameterService {
    Page<PostGetParameterResBody> postListParameter(PostListParameterReqBody reqBody);

    Object postCreateParameter(PostCreateOrUpdateParameterReqBody reqBody, HttpServletRequest httpServletRequest) throws WarehouseMngtSystemException;

    Object postUpdateParameter(PostCreateOrUpdateParameterReqBody reqBody, HttpServletRequest httpServletRequest) throws WarehouseMngtSystemException;

    PostGetParameterResBody postDetailParameter(PostHandleByCodeParameterReqBody reqBody) throws WarehouseMngtSystemException;

    Object postDeleteParameter(PostHandleByCodeParameterReqBody reqBody, HttpServletRequest httpServletRequest) throws WarehouseMngtSystemException;
}
