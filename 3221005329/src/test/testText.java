package test;

import main.Text;
import org.junit.Test;

import java.io.IOException;


import static main.File.JiebaTest;
import static main.File.readText;

public class testText {

    Text text= new Text();
    @Test
    public void textText() {
        String path ="E:\\Code\\IDEA\\Test_software\\src\\resource\\orig.txt";
        text.setPath(path);
        String t;
        try {
            t=readText(path);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println(JiebaTest(t));



    }


}