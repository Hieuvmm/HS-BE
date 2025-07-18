package com.vworks.hs.home_service.service;

import com.vworks.hs.common_lib.exception.WarehouseMngtSystemException;
import com.vworks.hs.home_service.models.request.project.*;

import com.vworks.hs.home_service.models.response.project.PostDetailProjectResBody;
import com.vworks.hs.home_service.models.response.project.PostListProjectResBody;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.data.domain.Page;

public interface ProjectService {

    Page<PostListProjectResBody> postListProject(PostListProjectReqBody reqBody);

    Object postCreateProject(PostUpdateProjectReqBody reqBody, HttpServletRequest httpServletRequest) throws WarehouseMngtSystemException;

    Object postUpdateProject(PostUpdateProjectReqBody reqBody, HttpServletRequest httpServletRequest) throws WarehouseMngtSystemException;

    PostDetailProjectResBody postDetailProject(PostDetailProjectReqBody reqBody) throws WarehouseMngtSystemException;

    Object postDeleteProject(PostDetailProjectReqBody reqBody) throws WarehouseMngtSystemException;

    Object postAssignApprovalProject(PostAssignProjectReqBody reqBody) throws WarehouseMngtSystemException;

    Object postApproveProject(PostApproveProjectReqBody reqBody, HttpServletRequest httpServletRequest) throws WarehouseMngtSystemException;
}
