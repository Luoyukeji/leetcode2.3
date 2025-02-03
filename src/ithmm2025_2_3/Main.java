package ithmm2025_2_3;

import java.util.HashSet;

public class Main {


    public static int lengthOFLongestSubstring(String s){
        //使用一个哈希集合来记录当前窗口的字符
        HashSet<Object> set = new HashSet<>();
        int left = 0;
        int maxLength = 0; //最大长度

        //使用右指针遍历整个字符串

        for (int right = 0; right < s.length(); right++) {
            //if 字符串重复、则左指针右移，指导没有重复字符
            while(set.contains(s.charAt(right))){
                set.remove(s.charAt(left));
                left++;
            }


            //将当期字符加入集合
            set.add(s.charAt(right));


            //更新最大长度
            maxLength = Math.max(maxLength, right - left + 1);


        }
        return maxLength;

    }
}
