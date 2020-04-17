package com.shuming.service;

import com.shuming.utils.file.QueryAllFile;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class FileServiceImpl implements FileService {
    @Override
    public List<String> getAllFileName() {
        List<File> fileList = QueryAllFile.getAllExitFile("C:\\Blog\\xiaoShuo");
        List<String> fileNameList = new ArrayList<>();
        for ( File file : fileList
             ) {
            fileNameList.add(file.getName());
        }
        return fileNameList;
    }
}
