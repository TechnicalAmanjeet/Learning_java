package com.Amanjeet;

import javax.swing.plaf.IconUIResource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int count =0,index=-1;
        System.out.println(ruleKey+" "+ruleValue);
        if(ruleKey.equals("type")) index=0;
        else if (ruleKey.equals("color")) index=1;
        else if(ruleKey.equals("name")) index=2;
        System.out.println(index);
        for(int i=0;i<items.size();++i){
            if(((List)items.get(i)).get(index).equals(ruleValue)) count++;
            System.out.println(((List)items.get(i)).get(index));
        }
        return count;
    }
}



















































































