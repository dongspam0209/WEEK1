package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1100 더하기 사이클
public class B11100 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int N= Integer.parseInt(br.readLine());
        int check=N;
        int count=0;

        while(true){
            N=(N%10)*10+(N/10+N%10)%10;
            count++;
            if(check==N)
                break;
        }
        System.out.println(count);
    }
}
