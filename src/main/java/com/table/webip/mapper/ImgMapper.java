package com.table.webip.mapper;

import com.table.webip.pojo.ImgInfo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Mapper
public interface ImgMapper {
    List<ImgInfo> queryAllImg();

    int addImg(ImgInfo imgInfo);

    int deleteImg(@Param("img_name") String img_name);
}
