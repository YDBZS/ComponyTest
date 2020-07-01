package com.example.service.Impl;

import com.example.service.FileService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.IOException;

/**
 * @author ：Axel
 * @since ：2020/6/18 19:55
 */
@Service
public class FileServiceImpl implements FileService {

    @Override
    public void upload(MultipartFile file) {
        //获取文件全名
        String fileName = file.getOriginalFilename();
        //如果文件不为空
        if (!file.isEmpty()){
            //以点为分割
            String[] split = fileName.split("\\.");
            //获取文件格式
            System.out.println("当前文件的格式为：     " + split[split.length - 1]);

            //如果是图片格式，获取宽高
            String format = split[split.length - 1];

            if (format.equals("jpg") || format.equals("png") || format.equals("jpeg") || format.equals("gif")){
                //获取文件的宽
                try {
                    BufferedImage read = ImageIO.read(file.getInputStream());
                    System.out.println("此图片的宽是： " + read.getWidth());
                    System.out.println("此图片的高是： " + read.getHeight());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    public static void main(String[] args) {
        String str = "123456.123.569";
        String[] split = str.split("\\.");
        System.out.println(split.length);
        System.out.println(split[(split.length) - 1]);
    }

}
