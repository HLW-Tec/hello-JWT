package com.liumapp.helloSv.common.model;

import java.io.InputStream;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.Serializable;

/**
 * Created by liumapp on 10/19/17.
 * E-mail:liumapp.com@gmail.com
 * home-page:http://www.liumapp.com
 */
public class UploadFile implements Serializable {
    private MultipartFile multipartFile;

    public UploadFile(MultipartFile multipartFile) {
        this.multipartFile = multipartFile;
    }

    public String getName() {
        return multipartFile.getName();
    }//参数名

    public String getOriginalFilename() {
        return multipartFile.getOriginalFilename();
    }//上传文件名

    public String getContentType() {
        return multipartFile.getContentType();
    }//获取文件正文类型

    public boolean isEmpty() {
        return multipartFile.isEmpty();
    }//文件是否为空

    public long getSize() {
        return multipartFile.getSize();
    }//获取文件大小

    public byte[] getBytes() throws IOException {
        return multipartFile.getBytes();
    }

    public InputStream getInputStream() throws IOException {
        return multipartFile.getInputStream();
    }

    public void transferTo(File dest) throws IOException, IllegalStateException {
        multipartFile.transferTo(dest);
    }
}
