package main;// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
import java.io.IOException;
import static main.File.*;

public class Main {
    public static void main(String[] args) throws IOException {

        Text text1=new Text();
        Text text2=new Text();
        text1.setPath(args[0]);
        text2.setPath(args[1]); //得到路径args[2]:输出答案文件
        //得到文本
        String getText1=readText(text1.getPath());
        String getText2=readText(text2.getPath());
        //将文本分词
        String participleText1=JiebaTest(getText1);
        String participleText2=JiebaTest(getText2);
        //将词合并
        float checkRate;
        //查重
        checkRate=checkText(participleText1,participleText2);
        //在给出的命令行参数输出，输出在指定的答案文件中
        fileWrite(args,checkRate);
        }
    }

