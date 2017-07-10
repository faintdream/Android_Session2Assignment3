/*
*
*program to evaluate user input and tell biggest among 3 inputs
*
*/
package biggernumber;

import java.util.Scanner;

public class BiggerNumber {
  int number []=new int [3];                            // holds 3 user input + null [0,1,2,3]
  int counter;                                          //counter variable used for iteration                                
  int result;                                           // holds integer evaluation
  Scanner scan = new Scanner(System.in);                //since we are taking use input scanner class helps
                                                        // accept console input
    
    void getNum(){
        for(;counter<number.length;counter++){                              //iterate through array length -1
            System.out.print("Please input an integer :  ");
            number[counter]=scan.nextInt();                                 //store user input  at number index ' counter'
        }
        
    }
    
    void evalNum(){
        for (counter=0;counter<number.length;counter++){                    //iterate through array length -1
            if(result<number[counter]){                                     //initially result is 0 ( default constructor initializes a variable 
                                                                            //when programmer doesn't
                                                                            // result is smaller then number at index 'counter'
                result=number[counter];                                     //assign it to result variable
            }
        }        
        System.out.println("");
        System.out.println("Biggest of three is :: "+result);               //print result
    }
    public static void main(String[] args) {
        BiggerNumber objBN= new BiggerNumber();                             // object creation and calling default constuctor
        objBN.getNum();                                     
        objBN.evalNum();
    }
    
}
