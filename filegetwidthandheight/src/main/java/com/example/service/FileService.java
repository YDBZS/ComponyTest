package com.example.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传接口
 *
 * @author ：Axel
 * @since ：2020/6/18 19:54
 */
public interface FileService {

    /**
     * 文件上传Servie
     * @author ：Vicetone
     * @param file 文件流
     * @since : 2020/6/18 20:00
     */
    void upload(MultipartFile file);
}
