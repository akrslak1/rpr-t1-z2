package com.company;
import java.util.Scanner;

public class Main {
    public static int sumaCifara(int broj){
        int help=broj;
        int sum=0;
        while(help!=0){
            sum+=help%10;
            help/=10;
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println("Unesite broj n: ");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println("Brojevi od 1 do n koji su djeljivi sa svojom sumom cifara su: ");
        for (int i=1;i<=n;i++){
            if(i%sumaCifara(i)==0){
                System.out.println(i);
            }
        }
    }
}
