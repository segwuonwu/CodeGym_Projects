package com.codegym.task.task04.task0429;

/* 
Positive and negative numbers

*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws Exception {
        //write your code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        int b = Integer.parseInt(br.readLine());
        int c = Integer.parseInt(br.readLine());

        int positive = 0, negative = 0;

        if(a>0&&b>0&&c>0) {
            positive = 3;
            System.out.println("Number of negative numbers: " + negative);
            System.out.println("Number of positive numbers: " + positive);
        }
        else if(a<0&&b<0&&c<0) {
            negative = 3;
            System.out.println("Number of negative numbers: " + negative);
            System.out.println("Number of positive numbers: " + positive);
        }
        else if(a>0&&b>0) {
            if(c==0){
                positive = 2;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
            else {
                negative = 1;
                positive = 2;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
        }
        else if(a>0&&c>0) {
            if(b==0){
                positive = 2;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
            else {
                negative = 1;
                positive = 2;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
        }
        else if(b>0&&c>0) {
            if(a==0){
                positive = 2;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
            else {
                negative = 1;
                positive = 2;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
        }
        else if(a>0) {
            if(b==0&&c==0){
                positive = 1;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
            else if(b==0){
                negative = 1;
                positive = 1;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
            else if(c==0){
                negative = 1;
                positive = 1;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
            else {
                negative = 2;
                positive = 1;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
        }
        else if(b>0) {
            if(a==0&&c==0){
                positive = 1;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
            else if(a==0){
                negative = 1;
                positive = 1;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
            else if(c==0){
                negative = 1;
                positive = 1;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
            else {
                negative = 2;
                positive = 1;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
        }
        else if(c>0) {
            if(b==0&&a==0){
                positive = 1;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
            else if(b==0){
                negative = 1;
                positive = 1;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
            else if(a==0){
                negative = 1;
                positive = 1;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
            else {
                negative = 2;
                positive = 1;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
        }
        else if(a<0&&b<0) {
            if(c==0){
                negative = 2;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
            else {
                negative = 2;
                positive = 1;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
        }
        else if(a<0&&c<0) {
            if(b==0){
                negative = 2;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
            else {
                negative = 2;
                positive = 1;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
        }
        else if(b<0&&c<0) {
            if(a==0){
                negative = 2;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
            else {
                negative = 2;
                positive = 1;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
        }
        else if(a<0) {
            if(b==0&&c==0){
                negative = 1;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
            else {
                negative = 1;
                positive = 2;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
        }
        else if(b<0) {
            if(a==0&&c==0){
                negative = 1;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
            else {
                negative = 1;
                positive = 2;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
        }
        else if(c<0) {
            if(b==0&&a==0){
                negative = 1;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
            else {
                negative = 1;
                positive = 2;
                System.out.println("Number of negative numbers: " + negative);
                System.out.println("Number of positive numbers: " + positive);
            }
        }
        else{
            System.out.println("Number of negative numbers: " + negative);
            System.out.println("Number of positive numbers: " + positive);
        }

        br.close();

    }
}
