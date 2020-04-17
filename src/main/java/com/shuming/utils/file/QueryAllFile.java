package com.shuming.utils.file;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

/**
 * 获取目前所有可以下载的资源
 */
public class QueryAllFile {
    public static List<File> getAllExitFile(String directory){
          List<File> fileList = new ArrayList<>();
          File file = new File(directory);
          if (file.isDirectory()){
              File[] files = file.listFiles();
              for(int i = 0 ; i < files.length; i++){
                  fileList.add(files[i]);
              }
          } else {
              throw new RuntimeException("请给定一个正确的文件夹路径");
          }
          return fileList;
    }
}
