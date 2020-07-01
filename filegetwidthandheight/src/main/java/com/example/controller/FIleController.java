package com.example.controller;

import com.example.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传Controller
 *
 * @author ：Axel
 * @since ：2020/6/18 19:53
 */
@Controller
@RequestMapping("/file")
public class FIleController {

    @Autowired
    private FileService fileService;

    @RequestMapping("/upload")
    public void upload(@RequestParam MultipartFile file){
        fileService.upload(file);
    }

}
