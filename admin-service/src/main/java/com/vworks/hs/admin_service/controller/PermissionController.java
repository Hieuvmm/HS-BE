package com.vworks.hs.admin_service.controller;

import com.vworks.hs.admin_service.config.AsConstant;
import com.vworks.hs.admin_service.model.requestBody.PostDetailPermissionByRoleRequestBody;
import com.vworks.hs.admin_service.model.requestBody.PostSearchPermissionRequestBody;
import com.vworks.hs.admin_service.service.PermissionService;
import com.vworks.hs.common_lib.base.BaseResponse;
import com.vworks.hs.common_lib.exception.WarehouseMngtSystemException;
import com.vworks.hs.common_lib.model.idm.IdmAppPermission;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping(AsConstant.RequestMapping.AS_PERMISSION)
@CrossOrigin("*")
public class PermissionController {
    private final PermissionService permissionService;
    @PostMapping("/detail")
    public BaseResponse<IdmAppPermission> postDetailPermissionByRole(@RequestBody PostDetailPermissionByRoleRequestBody requestBody, HttpServletRequest httpServletRequest) {
        return new BaseResponse<>(permissionService.postDetailPermissionByRole(requestBody, httpServletRequest));
    }

    @PostMapping("/search")
    public BaseResponse<IdmAppPermission> postSearchPermission(@RequestBody PostSearchPermissionRequestBody requestBody, HttpServletRequest httpServletRequest) throws WarehouseMngtSystemException {
        return new BaseResponse<>(permissionService.postSearchPermission(requestBody, httpServletRequest));
    }

}
