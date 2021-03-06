/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalc;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Pattern;

/**
 *
 * @author ankit
 */
public class StringCalc {

    /**
     * @param args the command line arguments
     */
   
    int add(String numbers){
        int sum=0;
        if(numbers.length()<2){
            if(numbers.isEmpty()){
                return 0;   
            }else{
                return Integer.parseInt(numbers);
            }
        }else {
            String delimiter = ",";
            if (numbers.matches("//(.*)\n(.*)")) {
                delimiter = Character.toString(numbers.charAt(2));
                numbers = numbers.substring(4);
            }

            String numList[] = splitNumbers(numbers, delimiter + "|\n");

                for(String numArray:numList){

                    sum+=Integer.parseInt(numArray);
                }
                return sum;    
        }
        
    }
    private String[] splitNumbers(String numbers, String divider) {
        return numbers.split(divider);
    }
    String negativeNumbers(String numbers) {
        StringBuilder sb=new StringBuilder();
        String arr[]=numbers.split(",");
        
        for (String number : arr) {
            if (Integer.parseInt(number) < 0) {
                sb.append(number.toString()).append(",");
            }
        }
        if(sb.length()>0){
            sb.deleteCharAt(sb.length()-1);
            
        }
        throw new IllegalArgumentException("Negatives not allowed: "+sb.toString());
    }
    int addOneThousand(String numbers){
        int sum=0;
        String arr[]=numbers.split("\\+");
        for(int i=0;i<arr.length;i++){
            if(Integer.parseInt(arr[i])<1000){
             sum=sum+Integer.parseInt(arr[i]);   
            }
        }
        return sum;
    }
    int otherDelimiter(String numbers){
        int sum=0;
        String delim=",";
        if(numbers.matches("//\\[(.*)\\]\n(.*)")){
            delim=Character.toString(numbers.charAt(6));
            numbers = numbers.substring(8);
        }
        String numList[]=numbers.split("([*])+");

                for(String numArray:numList){
                    if(!Pattern.matches("([*])+",numArray)) {
                         sum+=Integer.parseInt(numArray);
                    }
                   
                }
        return sum;   
    }
    int mutipleDelimiter(String numbers){
        int sum=0;
        String delim=",";
        if(numbers.matches("//\\[(.*)+\\]\\[(.*)+\\]\n(.*)+")){
            delim=Character.toString(numbers.charAt(7));
            numbers = numbers.substring(9);
        }
        String numList[]=numbers.split("([*])+|([\\%])+");

                for(String numArray:numList){
                    if(!Pattern.matches("([*])+ |([\\%])+",numArray)) {
                         sum+=Integer.parseInt(numArray);
                    }
                   
                }
        return sum;
    }
    int mutipleDelimiterMoreThanOneTime(String numbers){
        int sum=0;
        String delim=",";
        if(numbers.matches("//\\[(.*)+\\]\\[(.*)+\\]\n(.*)+")){
            delim=Character.toString(numbers.charAt(9));
            numbers = numbers.substring(11);
        }
        String numList[]=numbers.split("([*])+|([\\%])+");

                for(String numArray:numList){
                    if(!Pattern.matches("([*])+ |([\\%])+",numArray)) {
                         sum+=Integer.parseInt(numArray);
                    }
                   
                }
        return sum;
    }
}
