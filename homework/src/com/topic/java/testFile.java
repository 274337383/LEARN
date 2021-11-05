package com.topic.java;

import java.io.File;
import java.io.IOException;

public class testFile {
    public static void main(String[] args) throws IOException {
        File my = new File(File.separator+"home"+File.separator+"w274337383");
        print(my);
    }

    private static void print(File file) {
        if (file != null) {
            if (file.isDirectory()) {
                File f[] = file.listFiles();
                if(f!=null){    // 判断此目录能否列出
                    for(int i=0;i<f.length;i++){
                        print(f[i]) ;    // 因为给的路径有可能是目录，所以，继续判断，继续递归。
                    }
                } else {
                    System.out.println(file);
                }
            }
        }
    }
}
