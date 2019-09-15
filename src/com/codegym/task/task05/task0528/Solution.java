package com.codegym.task.task05.task0528;


/* 
Display today's date

*/
import java.text.*;
public class Solution {
    public static class Dates{
        private int day;
        private int month;
        private int year;

        public Dates(int month, int day, int year){
            this.month = month;
            this.day = day;
            this.year = year;
        }

        public int getDay() {
            return day;
        }

        public void setDay(int day) {
            this.day = day;
        }

        public int getMonth() {
            return month;
        }

        public void setMonth(int month) {
            this.month = month;
        }

        public int getYear() {
            return year;
        }

        public void setYear(int year) {
            this.year = year;
        }
    }
    public static void main(String[] args) {
        //write your code here
        Dates date = new Dates(4,29,2019);

        System.out.println(date.getMonth()+" "+date.getDay()+ " " + date.getYear());
    }
}
