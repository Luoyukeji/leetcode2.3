public class Main {
    //验证回文串


  public boolean  validPalindrome(String s){
        int left = 0,right = s.length()-1;
        while (left < right){
            //左右两边如果字符相同，就像中间靠拢
            if (s.charAt(left) == s.charAt(right)){
                left++;
                right--;
            }else{
                //不相同，尝试删除左边或者右边的字符，看是否能构成回文
                return isPalindrome(s,left +1 ,right) || isPalindrome(s,left,right-1);
            }
        }
        //若整个都匹配，则直接返回
      return true;
    }

    public boolean isPalindrome (String s,int left , int right){
      //判断从left到right的子串是不是回文
      while (left< right )
      {
         if(s.charAt(left)!= s.charAt(right)){
             return false;
         }else
             left++;
             right --;
         }
          return true;
      }
}