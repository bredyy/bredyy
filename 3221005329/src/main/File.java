package main;

import com.huaban.analysis.jieba.JiebaSegmenter;
import com.huaban.analysis.jieba.SegToken;

import java.io.*;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class File {



    /**
     * 读文件
     */
    public static String readText(String path) throws IOException {
        BufferedReader in = null;
        try {
            in = new BufferedReader(new FileReader(path));
        } catch (FileNotFoundException e) {
            System.out.println("找不到文件，请重新检查输入后运行！");
        }
        String s ;
        StringBuilder sb = new StringBuilder();
        while(true) {
            assert in != null;
            if ((s = in.readLine()) == null) break;
            sb.append(s).append("\n");
        }
        in.close();
        return  sb.toString();
    }

    /**
     * 论文查重
     * @param str1 文本1
     * @param str2 文本2
     * @return 返回查重率
     */
    public static float checkText(String str1,String str2) {


        Set<Character> s1 = new HashSet<>();//set元素不可重复
        Set<Character> s2 = new HashSet<>();
        for (int i = 0; i < str1.length(); i++) {
            s1.add(str1.charAt(i));//将string里面的元素一个一个按索引放进set集合
        }
        for (int j = 0; j < str2.length(); j++) {
            s2.add(str2.charAt(j));
        }
        float mergeNum;//并集元素个数
        float commonNum = 0;//相同元素个数（交集）
        for (Character ch1 : s1) {
            for (Character ch2 : s2) {
                if (ch1.equals(ch2)) {
                    commonNum++;
                }
            }
        }

        mergeNum = s1.size() + s2.size() - commonNum;
        float checkRate=commonNum / mergeNum;
        System.out.printf("查重率：%.2f\n",checkRate);

        return checkRate;
    }

    /**
     * 向指定文件输出答案
     * 论文原文的文件的绝对路径。
     * 抄袭版论文的文件的绝对路径。
     * 输出的答案文件的绝对路径。
     */

    public static void fileWrite(String[] args,float checkRate){
        try (BufferedWriter buf = new BufferedWriter(new FileWriter(args[2]))) {
            buf.write("论文原文的文件的绝对路径："+args[0]+'\n');
            buf.write("抄袭版论文的文件的绝对路径："+args[1]+'\n');
            buf.write("输出的答案文件的绝对路径："+args[2]+'\n');
            buf.write(String.format("查重率：%.2f", checkRate)+'\n');


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }


    public static String JiebaTest(String t){
        JiebaSegmenter segmenter = new JiebaSegmenter();

        List<SegToken> tokens = segmenter.process(t, JiebaSegmenter.SegMode.INDEX);

        StringBuilder strBuffer = new StringBuilder();
        for (SegToken token : tokens) {
            strBuffer.append(token.word);
        }


        t=strBuffer.toString();

        return t;





    }

}
