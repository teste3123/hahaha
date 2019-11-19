package ppp;

import java.util.Scanner;

public class dela {
  public static void main(String[] args){
   Scanner ds = new Scanner(System.in);
    int a = ds.nextInt();
    int b = ds.nextInt();
    int c = ds.nextInt();
    int d = ds.nextInt();
    if(a < b && c < b  && a < c && d < 0){
      System.out.println("S");
    }else if(a < b && c > b && a < c && d < 0){
      System.out.println("N");
    }else if(a < b && c < b && a < c && d > 0){
      System.out.println("N");
    }else if(a < b && c > b && a < c && d > 0){
      System.out.println("S");
    }else if(a > b && c > b && a < c && d < 0){
      System.out.println("S");
    }else if(a < b && c < b && a > c && d < 0){
      System.out.println("N");
    }else if(a > b && c > b && a < c && d > 0){
      System.out.println("N");
    }else if(a < b && c < b && a > c && d > 0){
      System.out.println("S");
    }else if(a > b && c < b && a > c && d < 0){
      System.out.println("S");
    }else if(a > b && c > b && a > c && d < 0){
      System.out.println("N");
    }else if(a > b && c < b && a > c && d > 0){
      System.out.println("N");
    }else if(a > b && c > b && a > c && d > 0){
      System.out.println("S");
    }
    }// by DaiSho
   
    }