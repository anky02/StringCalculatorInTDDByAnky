/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stringcalc;

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
        }else{
            String arr[]=numbers.split(",|\n");
            
            for(String numArray:arr){
                
                sum+=Integer.parseInt(numArray);
            }
         return sum;    
        }
        
    }
}
