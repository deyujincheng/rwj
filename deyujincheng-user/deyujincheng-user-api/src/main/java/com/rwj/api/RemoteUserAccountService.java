package com.rwj.api;

import dto.UserAccountDTO;

/**
 * @author chichenglong
 * @date 2019/6/18 20:13
 */
public interface RemoteUserAccountService {


    UserAccountDTO getById(String id);

}
