import demo1.Main1;
import demo2.Main2;
import demo3.Main3;
import demo4.Main4;

import java.io.*;
import java.util.Scanner;

public class test {
    public static void main(String[] args) throws IOException {
        picture pc=new picture();
        System.out.println("请选择想实现的方法：");
        System.out.println("1.主程序-子程序 2.面向对象 3.事件系统(观察者模式) 4.管道-过滤");
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        if(t==1) {
            Main1.main(null);
            pc.main(t);
            System.out.println("文件已由主程序-子程序更改");
        }else if(t==2){
            Main2.main(null);
            pc.main(t);
            System.out.println("文件已由面向对象模式更改");
        }else if (t==3){
            Main3.main(null);
            pc.main(t);
            System.out.println("文件已由事件系统（观察者模式）更改");
        }else if(t==4){
            Main4.main(null);
            pc.main(t);
            System.out.println("文件已由管道-过滤模式更改");
        }
        File file = new File("./txts/output.txt");
        StringBuilder result = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String s = null;
            while ((s = br.readLine()) != null) {
                result.append(System.lineSeparator() + s);
            }
            br.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(result.toString());

    }
}