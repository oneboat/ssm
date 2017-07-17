package cn.myssm.usermanage.dao;

import cn.myssm.usermanage.pojo.TCourse;

public interface TCourseMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(TCourse record);

    int insertSelective(TCourse record);

    TCourse selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(TCourse record);

    int updateByPrimaryKey(TCourse record);
}