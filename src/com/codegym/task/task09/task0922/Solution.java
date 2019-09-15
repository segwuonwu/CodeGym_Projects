package com.codegym.task.task09.task0922;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* 
What's today's date?

*/

public class Solution {

    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat ndate = new SimpleDateFormat("MMM dd, YYYY", Locale.ENGLISH);

        String str = br.readLine();
        Date myDate = date.parse(str);
        System.out.println(ndate.format(myDate).toUpperCase());
    }
}
