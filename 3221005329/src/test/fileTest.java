package test;

import org.junit.Test;

import java.io.IOException;

import static main.File.*;

public class fileTest {
    @Test
    public void checktest() throws IOException {
        String path1 ="E:\\Code\\IDEA\\Test_software\\src\\resource\\orig.txt";
        String path2 ="E:\\Code\\IDEA\\Test_software\\src\\resource\\orig_0.8_add.txt";
        String str1=readText(path1);
        str1=JiebaTest(str1);
        String str2=readText(path2);
        str2=JiebaTest(str2);
        checkText(str1,str2);
    }
    @Test
    public void checktest1() throws IOException {
        String path1 ="E:\\Code\\IDEA\\Test_software\\src\\resource\\orig.txt";
        String path2 ="E:\\Code\\IDEA\\Test_software\\src\\resource\\orig_0.8_del.txt";
        String str1=readText(path1);
        str1=JiebaTest(str1);
        String str2=readText(path2);
        str2=JiebaTest(str2);

        checkText(str1,str2);
    }
    @Test
    public void checktest3() throws IOException {
        String path1 ="E:\\Code\\IDEA\\Test_software\\src\\resource\\orig.txt";
        String path2 ="E:\\Code\\IDEA\\Test_software\\src\\resource\\orig_0.8_dis_1.txt";
        String str1=readText(path1);
        str1=JiebaTest(str1);
        String str2=readText(path2);
        str2=JiebaTest(str2);

        checkText(str1,str2);
    }
    @Test
    public void checktest4() throws IOException {
        String path1 ="E:\\Code\\IDEA\\Test_software\\src\\resource\\orig.txt";
        String path2 ="E:\\Code\\IDEA\\Test_software\\src\\resource\\orig_0.8_dis_10.txt";
        String str1=readText(path1);
        str1=JiebaTest(str1);
        String str2=readText(path2);
        str2=JiebaTest(str2);
        checkText(str1,str2);
    }
    @Test
    public void checktest5() throws IOException {
        String path1 ="E:\\Code\\IDEA\\Test_software\\src\\resource\\orig.txt";
        String path2 ="E:\\Code\\IDEA\\Test_software\\src\\resource\\orig_0.8_dis_15.txt";
        String str1=readText(path1);
        str1=JiebaTest(str1);
        String str2=readText(path2);
        str2=JiebaTest(str2);
        checkText(str1,str2);
    }

@Test
    public void checkFile() throws IOException {
        String path="E:\\Code\\IDEA\\Test_software\\src\\resource\\orig1.txt";
        readText(path);

}


}
