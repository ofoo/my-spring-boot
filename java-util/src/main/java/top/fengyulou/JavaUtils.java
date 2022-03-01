package top.fengyulou;

import java.util.HashSet;
import java.util.Set;

/**
 * @author guochao
 * @version 1.0
 * @date 2022/2/26 17:00
 */
public class JavaUtils {
    public static void main(String[] args) {
        test();
    }

    public static void test(){
        //多选题答案去重
        String[] userAnswerArr = "A".split(",");
        Set<String> userAnswerSet=new HashSet<>();
        for (String s : userAnswerArr) {
            userAnswerSet.add(s);
        }
        String join = String.join(",", userAnswerSet);
        System.out.println(join);
    }
}
