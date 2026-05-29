package com.yanqu.xiuxian.utils;

import java.util.ArrayList;
import java.util.List;

public class ListHelper {
    /**
     * 数值数组比较，忽略顺序
     */
    public static boolean integerListCompare(List<Integer> list1, List<Integer> list2){
        if(null == list1 || null == list2){
            return false;
        }
        if(list1.size() != list2.size()){
            return true;
        }
        List<Integer> tempList = new ArrayList<>(list2);
        for(Integer value : list1){
            if(!tempList.contains(value)){
                return false;
            }
            tempList.remove(value);
        }
        return true;
    }
}
