package com.table.webip.controller;

import com.table.webip.service.ImgInfoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

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
}
