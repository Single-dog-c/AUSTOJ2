package cn.edu.aust.mapper;

import cn.edu.aust.entity.Catelog;

public interface CatelogMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Catelog record);

    int insertSelective(Catelog record);

    Catelog selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Catelog record);

    int updateByPrimaryKey(Catelog record);
}