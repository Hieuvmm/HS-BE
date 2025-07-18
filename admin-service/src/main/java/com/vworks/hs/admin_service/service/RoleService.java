package com.vworks.hs.admin_service.service;

import com.vworks.hs.admin_service.model.requestBody.PostSearchRoleRequestBody;
import com.vworks.hs.common_lib.exception.WarehouseMngtSystemException;
import com.vworks.hs.common_lib.model.idm.IdmAppRole;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.data.domain.Page;

public interface RoleService {
//    Object postCreateRole(PostCreateRoleRequestBody requestBody, HttpServletRequest httpServletRequest) throws WarehouseMngtSystemException;
//
//    Object postUpdateRole(PostUpdateRoleRequestBody requestBody, HttpServletRequest httpServletRequest) throws WarehouseMngtSystemException;

    Page<IdmAppRole> postSearchRole(PostSearchRoleRequestBody requestBody, HttpServletRequest httpServletRequest) throws WarehouseMngtSystemException;

    Object postDetailRole(String roleName, HttpServletRequest httpServletRequest);
}
