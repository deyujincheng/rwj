package com.rwj.mapper;

import com.rwj.entity.PostContent;
import com.rwj.entity.UserAccount;
import org.mapstruct.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author chichenglong
 * @date 2019/6/21 11:29
 */
@Mapper
@Repository
public interface PostContentMapper {

    PostContent selectById(int id);

    void insert(PostContent postContent);

}
