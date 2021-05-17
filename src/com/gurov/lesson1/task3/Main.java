package com.gurov.lesson1.task3;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try{
            Scanner in = new Scanner(System.in);
            System.out.println("Введите диапазон для поиска простых чисел (от.. до..)");
            int a = in.nextInt();
            int b = in.nextInt();
            if (a > b){
                throw new Exception("Диапазон чисел должен соответствовать правилам (от < до)");
            }
            System.out.println("Полученные простые числа");
            primeNumber(a,b);
        }
        catch (Exception ex){
            System.out.println(ex.getMessage());
        }
    }

    public static void primeNumber(int a,int b){

        boolean prime;
        for (int i=a;i<=b;i++){
            prime = true;
            for (int j=2;j<Math.abs(b);j++){
                if ((i % j ==0) & (i != j) || (i < 2)){
                    prime = false;
                    break;
                }
            }
            if (prime){
                System.out.print(i+" ");
            }
        }
    }
}
