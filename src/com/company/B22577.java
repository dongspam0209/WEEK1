package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
//2577 숫자의 개수
public class B22577 {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));

        int result= Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine())*Integer.parseInt(br.readLine());

        String str= Integer.toString(result);

        for (int i=0;i<10;i++){
            int count=0;
            for(int j=0;j<str.length();j++){
                if(str.charAt(j)-48==i)
                    count++;
            }
            System.out.println(count);
        }
    }
}
