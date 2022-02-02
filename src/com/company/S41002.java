package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//1002 터렛
public class S41002 {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

        int T=Integer.parseInt(br.readLine());

        while (T-->0){
            int x1=Integer.parseInt(br.readLine());
            int y1=Integer.parseInt(br.readLine());
            int r1=Integer.parseInt(br.readLine());

            int x2=Integer.parseInt(br.readLine());
            int y2=Integer.parseInt(br.readLine());
            int r2 = Integer.parseInt(br.readLine());

            System.out.println();
        }

    }

    public static int tangent_point(int x1, int y1, int r1, int x2, int y2, int r2) {
        int distance_pow=(int)(Math.pow(x2-x1,2)+Math.pow(y2-y1,2));
        if (x1 == x2 && y1 == y2 && r1 == r2) {
            return -1;
        }
        else if(distance_pow>Math.pow(r1+r2,2)){
            return 0;
        }
        else if(distance_pow<Math.pow(r2-r1,2)){
            return 0;
        }
        else if(distance_pow==Math.pow(r1+r2,2)){
            return 1;
        }
        else if(distance_pow==Math.pow(r2-r1,2)){
            return 1;
        }
        else{
            return 2;
        }
    }
}
