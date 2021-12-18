package com.table.webip.service;

import com.table.webip.pojo.ImgInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ImgInfoService {

    List<ImgInfo> queryAllImg();

    int addImg(ImgInfo imgInfo);

    int deleteImg(@Param("img_name") String img_name);
}
