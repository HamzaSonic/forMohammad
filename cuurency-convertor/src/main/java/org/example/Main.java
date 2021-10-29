package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
    //binary search (two pointers) sorted array
    //length/2
    //condition -> true or false
    //arr[m]+1 == m
    //binary search for the missing element
//    public static void main(String[] args) {
//        int arr[] = {1, 2, 3, 4, 5, 7, 8, 9};
//      //                      l  r
//        int l = 0, r = arr.length -1;
//        int m;
//        while (r-l >1){
//            m = (l + r) / 2;
//            if (m+1==arr[m]) {
//                l=m;
//            }else {
//               r=m;
//            }
//        }
//        System.out.println(l+2);
//    }
    //another soluction
//    static int search(int ar[],
//                      int size)
//    {
//        int low = 0, high = size - 1;
//        int mid = 0;
//        while ((high - low) > 1)
//        {
//            mid = (low + high) / 2;
//            if ((ar[low]/*1*/ - low/*0*/) != (ar[mid]/*4*/ - mid/*3*/))
//                high = mid;
//            else if ((ar[high]/*9*/ - high/*7*/) != (ar[mid]/*4*/ - mid/*3*/))
//                low = mid;
//        }
//        return (ar[low] + 1);
//    }


    /**another question for binary search */
//    public static void main(String[] args) {
//        // 1 5 8 12 50 52 99 121 -> the question asks either the element exist or not
//        //l      l        l    r
//        //100
//        int arr[] = {1,5,8,12,50,100,121};
//        int l = 0, r = arr.length -1;
//        int m;
//        int target=100;
//        int i =0;
//        while (r-l >1){
//            i++;
//            m = (l + r) / 2;
//            if (arr[m]==target) {
//                System.out.println(m+" "+i);
//                return;
//            }
//            if (arr[m]<target) {
//                l=m+1;
//            }else {
//               r=m-1;
//            }
//        }
//        System.out.println("no element");
//    }

    /**longest unique substring */
//    public static void main(String[] args) {
//        String s= "abcdeadefytreliuf";
//        //          1    2
//        int mx=1;
//        Map<Character,Boolean> exists =new HashMap<>();
//        int p1=0;
//        int length=0;
//        for (int i = 0;i<s.length();i++){
//            if (exists.containsKey(s.charAt(i))){
//                mx= Math.max(mx,length);
//                i=p1+1;
//                p1++;
//                exists.clear();
//                length=0;
//            }else {
//                length++;
//                exists.put(s.charAt(i),true);
//            }
//        }
//        System.out.println(mx);
//
//    }


//    public static void main(String[] args) {
//        String s= "abcdeadefytreliuf";
//        //          1    2
//        int mx=1;
//        Set<Character> exists =new HashSet<>();
//
//        int p1=0;
//        int length=0;
//        for (int i = 0;i<s.length();i++){
//            if (exists.contains(s.charAt(i))){
//                mx= Math.max(mx,length);
//                i=p1+1;
//                p1++;
//                exists.clear();
//                length=0;
//            }else {
//                length++;
//                exists.add(s.charAt(i));
//            }
//        }
//        System.out.println(mx);
//
//    }


}
