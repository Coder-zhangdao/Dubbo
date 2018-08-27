package com.school.userInfo.dao;

import com.school.userInfo.model.UserInfo;

public interface UserInfoDao {
    int deleteByPrimaryKey(String u_id);

    int insert(UserInfo record);

    int insertSelective(UserInfo record);

    UserInfo selectByPrimaryKey(String u_id);

    int updateByPrimaryKeySelective(UserInfo record);

    int updateByPrimaryKey(UserInfo record);
}