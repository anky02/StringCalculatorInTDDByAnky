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
        if(numbers.isEmpty()){
            return 0;    
        }
        else{
            int temp=Integer.parseInt(numbers);
            return temp;
        }
            
    }
}
