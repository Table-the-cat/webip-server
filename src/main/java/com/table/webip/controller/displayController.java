package com.table.webip.controller;

import com.table.webip.pojo.ImgInfo;
import com.table.webip.service.ImgInfoService;
import org.springframework.core.io.FileSystemResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

@Controller
public class displayController {
    @Autowired
    private ImgInfoService imgInfoService;

    @RequestMapping("/display")
    @ResponseBody
    public Object displayList() {
        return imgInfoService.queryAllImg();
    }

    @RequestMapping("/getImg")
    @ResponseBody
    public Object getImg(@RequestParam(value = "name") String name) {
        System.out.println(name);
        return imgInfoService.queryByName(name);
    }

    @RequestMapping("/deleteImg")
    @ResponseBody
    public Object deleteImg(@RequestParam(value = "name") String name) {
        imgInfoService.deleteImg(name);

        Map<String, String> res = new HashMap<>();
        res.put("result", "success");
        return res;
    }

    @RequestMapping(value = "/uploadImg")
    @ResponseBody
    public Object importData(HttpServletRequest request, HttpServletResponse response, @RequestParam("file") MultipartFile file) throws IOException {
        String path = new FileSystemResource("").getFile().getAbsolutePath() + "\\webip\\src\\main\\resources\\static\\img\\";
        File folder = new File(path);
        if (!folder.exists()) {
            folder.mkdirs();
        }
        String name = file.getOriginalFilename();

        String targetName = UUID.randomUUID() + name.substring(name.lastIndexOf("."), name.length());
        File targetFile = new File(folder,targetName);
        file.transferTo(targetFile);
        System.out.println("完整路径:" + targetFile.getAbsolutePath());

        imgInfoService.addImg(new ImgInfo(name, "/img/" + targetName));

        Map<String, String> res = new HashMap<>();
        res.put("result", "success");
        return res;
    }
}
