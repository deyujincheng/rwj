package com.rwj;

import com.rwj.api.RemotePostContentService;
import com.rwj.api.RemoteUserAccountService;
import com.rwj.deyujincheng.common.utils.BeanCopyUtil;
import com.rwj.dto.PostContentDTO;
import com.rwj.entity.PostContent;
import com.rwj.entity.UserAccount;
import com.rwj.mapper.PostContentMapper;
import com.rwj.mapper.UserAccountMapper;
import dto.UserAccountDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author chichenglong
 * @date 2019/6/21 13:53
 */
@Service("remotePostContentService")
public class RemotePostContentServiceImpl implements RemotePostContentService {

    @Autowired
    private PostContentMapper postContentMapper;

    /**
     * 按id查找
     * @param id
     * @return
     */
    public PostContentDTO getById(int id) {
        PostContent entity = postContentMapper.selectById(id);
        PostContentDTO dto = new PostContentDTO();
        BeanCopyUtil.copyPropertiesNotNull(entity,dto);
        return dto;
    }

    /**
     * 保存
     * @param dto
     */
    public void insert(PostContentDTO dto) {
        PostContent entity = new PostContent();
        BeanCopyUtil.copyPropertiesNotNull(dto,entity);
        postContentMapper.insert(entity);
    }

}
