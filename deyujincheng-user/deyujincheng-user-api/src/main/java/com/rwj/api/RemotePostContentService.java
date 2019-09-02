package com.rwj.api;

import com.rwj.dto.PostContentDTO;
import dto.UserAccountDTO;

/**
 * @author chichenglong
 * @date 2019/6/18 20:13
 */
public interface RemotePostContentService {


    PostContentDTO getById(int id);

    void insert(PostContentDTO dto);

}
