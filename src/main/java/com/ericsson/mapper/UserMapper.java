package com.ericsson.mapper;

import com.ericsson.domain.User;

/**
 * Created by xdhua on 2017/6/11.
 */
public interface UserMapper {

    User findById(Integer id);
}
