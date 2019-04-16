package com.bittech.file;

import java.io.*;

/**
 * 文件拷贝工具类
 * Author: secondriver
 * Created: 2019/3/31
 */
public class FileCopyUtil {
    /**
     * 拷贝方法
     *
     * @param sourceFilePath 源文件
     * @param destFilepath   目的文件
     */
    public static void cp(String sourceFilePath, String destFilepath) throws IOException {
        File sourFile = new File(sourceFilePath);
        checkFile(sourFile,sourceFilePath);
        File destFile = new File(destFilepath);
        checkFile(destFile,destFilepath);
        dataCopy(sourFile,destFile);
    }
    private static void dataCopy(File source, File dest) throws IOException {
        InputStream inputStream = new FileInputStream(source);
        byte[] data = new byte[1024];
        int len = inputStream.read(data);
        OutputStream outputStream = new FileOutputStream(dest);
        while (len != -1){
            outputStream.write(data,0,len);
        }
        inputStream.close();
        outputStream.close();
    }

    private static void checkFile(File file, String msg) {
        if (!file.getParentFile().exists()){
            file.getParentFile().mkdir();
        }else{}
        System.out.println(msg + "：目标文件不存在");
    }

    public static void main(String[] args) throws IOException {
        String sour = ("C"+File.separator+"Users" + File.separator + "SeirM" + File.separator + "Desktop" + File.separator + "oop"
                + File.separator + " hello.txt");
        String dest = "C:\\Users\\SeirM\\Desktop\\kkk";
        cp(sour,dest);
    }
}
