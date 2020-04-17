package com.shuming;

import com.shuming.pojo.User;
import com.shuming.service.FileService;
import com.shuming.service.FileServiceImpl;
import com.shuming.service.UserService;
import com.shuming.service.UserServiceImpl;

import java.util.List;

public class App {
    public static void main(String[] args) {
        FileService fileService = new FileServiceImpl();
        List<String> fileNameList = fileService.getAllFileName();
        for ( String s: fileNameList
             ) {
            System.out.println(s);
        }
    }
}
