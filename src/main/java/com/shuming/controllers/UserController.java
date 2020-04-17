package com.shuming.controllers;

import com.shuming.pojo.User;
import com.shuming.service.FileService;
import com.shuming.service.FileServiceImpl;
import com.shuming.service.UserService;
import com.shuming.service.UserServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.*;
import java.net.URLEncoder;
import java.util.List;

@Controller
@RequestMapping("/User")
public class UserController {

    @RequestMapping("/login.do")
    //返回数据给前端
    @ResponseBody
    public String login(HttpSession session, String username, String password){
        session.setAttribute("username",username);
        UserService userService = new UserServiceImpl();
        //首先验证用户名是否存在
        if (userService.getAllUsername().contains(username)){
              if (userService.getPassword(username).equals(password)){
                  return "true";
              }
        }
        return "false";
    }

    @RequestMapping("/index.do")
    public String toWelcome(){
        return "welcome";
    }

    @RequestMapping("/toRegister.do")
    public String toAddUser(){
        return "register";
    }
    /**
     * 注册用户操作
     * @param username
     * @param password
     * @return
     */
    @RequestMapping("/add_user.do")
    public String addUser(String username, String password){
            UserService userService = new UserServiceImpl();
            User user = new User();
            user.setUsername(username);
            user.setPassword(password);
            userService.insertOne(user);
            return "redirect:/index.jsp";
        }

    @RequestMapping("toDownload.do")
    public String toDownload(HttpServletRequest request){
        FileService fileService = new FileServiceImpl();
        List<String> fileNameList = fileService.getAllFileName();
        request.setAttribute("fileNameList", fileNameList);
        return "downloadFile";
    }
    @RequestMapping("/download.do")
    public String download(HttpServletResponse response,String fileName) throws Exception{
        System.out.println(fileName+"jjjjj");
        String	filePath = "C:\\Blog\\xiaoShuo\\"+ fileName;
        //1、设置response 响应头
        response.reset();
        response.setCharacterEncoding("UTF-8");
        response.setContentType("multipart/form-data");
        response.setHeader("Content-Disposition",
                "attachment;fileName="+ URLEncoder.encode(fileName, "UTF-8"));

        File file = new File(filePath);
        //2、 读取文件--输入流
        InputStream input=new FileInputStream(file);
        //3、 写出文件--输出流
        OutputStream out = response.getOutputStream();
        byte[] buff =new byte[1024];
        int index=0;
        //4、执行 写出操作
        while((index= input.read(buff))!= -1){
            out.write(buff, 0, index);
            out.flush();
        }
        out.close();
        input.close();
        return "redirect:/index.jsp";
    }

    @RequestMapping("/upload.do")
    public String upload(Model model, MultipartFile uploadFile){
        File file = new File("C:\\Blog\\"+uploadFile.getOriginalFilename());
        System.out.println(file.getAbsolutePath());
        try {
            uploadFile.transferTo(file);
        } catch (IOException e1){
            e1.printStackTrace();
        } catch (Exception e2){
            e2.printStackTrace();
        }
        return "redirect:/index.jsp" ;
      }
}
