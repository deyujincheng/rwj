package com.rwj;

import com.rwj.api.RemoteUserAccountService;
import com.rwj.mapper.UserAccountMapper;
import com.rwj.deyujincheng.common.utils.BeanCopyUtil;
import com.rwj.entity.UserAccount;
import dto.UserAccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chichenglong
 * @date 2019/6/21 13:53
 */
@Service("remoteUserAccountService")
public class RemoteUserAccountServiceImpl implements RemoteUserAccountService {

    @Autowired
    private UserAccountMapper userAccountMapper;

    public UserAccountDTO getById(String id) {
        UserAccount entity = userAccountMapper.selectById(id);
        UserAccountDTO dto = new UserAccountDTO();
        BeanCopyUtil.copyPropertiesNotNull(entity,dto);
        return dto;
    }
}
