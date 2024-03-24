package com.spring.auth.mapper;

import com.spring.auth.domain.User;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserMapper {

    void save(User user);

}
