package javaassesmentLewisCode;

import java.util.Arrays;

public class JavaAssesmentLewisCode {

    public static void main(String[] args) {

        String[] testArray = {"0011","1010","0100","0000"};
        System.out.println(Arrays.toString(NibbleSub(testArray,true)));
    }
    
    public static String addition(String valueA,String valueB){
        
        //Creating Output Variable
        String outputString = "";
        
        //Loop Through String To Change Values
        for(int i = 0;i<4;i++){
            if (valueA.charAt(i) == valueB.charAt(i)){outputString += "0";}
            else{outputString += "1";}
        }
        
        //Testing Output
        //System.out.println(outputString);
        //Return Value
        return outputString;
    }
    
    public static String[] NibbleSub(String[] input,boolean isEncryption){
    //Create Empty output Array
    String[] output = new String[4];
    
    //Create X and Y coordinate variables
    int x;
    int y = 0;
    //Create Nibble Table
    String[][] nibbleSubTable = {
        {"0000","1110","1110"},
        {"0001","0100","0011"},
        {"0010","1101","0100"},
        {"0011","0001","1000"},
        {"0100","0010","0001"},
        {"0101","1111","1100"},
        {"0110","1011","1010"},
        {"0111","1000","1111"},
        {"1000","0011","0111"},
        {"1001","1010","1101"},
        {"1010","0110","1001"},
        {"1011","1100","0110"},
        {"1100","0101","1011"},
        {"1101","1001","0010"},
        {"1110","0000","0000"},
        {"1111","0111","0101"},
            
    };
    
    //Get Table X coordinate
    //If statement retreives which column of 2D Array to search
    if(isEncryption){x = 1;}else{ x = 2;}
    
    //Get Table Y coordinate
    //Loops through coloumn to find Y coordinate correct input nibble
    for(int nibble = 0 ;nibble<4;nibble++ ){
        boolean ySearch = true;
        int index = 0;
        while(ySearch){
            if(nibbleSubTable[index][0].equals(input[nibble])){
                y = index;ySearch=false;
            }
            else{index++;}
        }
        //Set new nibble to substituted nibble
        output[nibble] = nibbleSubTable[y][x];
    }
    //Test Array Output
    //System.out.println(Arrays.toString(output));
    return output;
    }


}
