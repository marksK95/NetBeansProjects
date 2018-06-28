/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author HOME
 */
import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 
 public class Ld2151RDB52 {
 
 
 public static void main(String[] args)
 
 throws IOException{
    String text;
 BufferedReader br = new BufferedReader(
 new InputStreamReader(System.in));
 
 System.out.println("Didzis Freiss RDBI05 113nbc037");
 System.out.println("input string:");
 
 text = br.readLine();
 System.out.println("result:");
 char[] arr = text.toCharArray();
 int j;
 boolean rez=false;
 for (int i=0; i<arr.length; i++){
  if (arr[i] >= 'a' && arr[i] <= 'z' || arr[i] >= 'A' && arr[i] <= 'Z')
   for(j=i+1; j<arr.length; j++)
    if(arr[i]==arr[j])
     rez=true;
}
    System.out.print(rez);
 }
 
 }



