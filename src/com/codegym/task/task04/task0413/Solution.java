package com.codegym.task.task04.task0413;

/* 
Day of the week

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

/*
        for(int i = 0; i<days.length; i++){
            try{
                if(i==num){
                    System.out.println(days[i-1]);
                }
            }
            catch (ArrayIndexOutOfBoundsException e){
                System.out.println("No such day of the week");
            }
            catch (IndexOutOfBoundsException e){
                System.out.println("No such day of the week");
            }
        }
*/


        switch (num){
            case 1:
                System.out.println(days[0]);
                break;
            case 2:
                System.out.println(days[1]);
                break;
            case 3:
                System.out.println(days[2]);
                break;
            case 4:
                System.out.println(days[3]);
                break;
            case 5:
                System.out.println(days[4]);
                break;
            case 6:
                System.out.println(days[5]);
                break;
            case 7:
                System.out.println(days[6]);
                break;
            default:
                System.out.println("No such day of the week");
        }

    }
}