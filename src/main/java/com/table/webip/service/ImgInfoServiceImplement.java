package com.table.webip.service;

import com.table.webip.mapper.ImgMapper;
import com.table.webip.pojo.ImgInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ImgInfoServiceImplement implements ImgInfoService{
    @Autowired
    ImgMapper imgMapper;

    @Override
    public List<ImgInfo> queryAllImg(){ return imgMapper.queryAllImg(); }
    @Override
    public int addImg(ImgInfo imgInfo){ return imgMapper.addImg(imgInfo); }
    @Override
    public int deleteImg(String img_name){ return imgMapper.deleteImg(img_name); }
}
