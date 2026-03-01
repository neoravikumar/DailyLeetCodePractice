package com.ravi.leetcode.string;

public class SubstringMatchingPattern {
    static void main() {
        //String s = "leetcode", p = "ee*e";
        //String s = "car", p = "c*v";
        String s = "p", p = "*";
        boolean result = hasMatch(s, p);
        System.out.println(result);

    }
    public static boolean hasMatch(String s, String p) {
         /* boolean result = false;
         String[] allstr = p.split("\\*");
          int sIndex = s.indexOf(allstr[0]);
          boolean re = s.contains(allstr[0]);
          if(allstr.length>1){
              String anotherS = s.substring(sIndex+allstr[0].length());
              int eIndex = anotherS .indexOf(allstr[1]);
              boolean anoString = anotherS.contains(allstr[1]);
              if(re && anoString){
                  return  true;
              }
          }else{
              if(re && s.length()>allstr[0].length()){
                  return  true;
              }
          }
        return result;
        */
        int star = p.indexOf('*');
        String prefix = p.substring(0, star);
        String suffix = p.substring(star + 1);

        // Find prefix first
        int firstIdx = s.indexOf(prefix);
        if (firstIdx == -1) return false;

        return s.indexOf(suffix, firstIdx + prefix.length()) != -1;
    }
}
