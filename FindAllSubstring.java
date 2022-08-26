import java.util.*;
public class FindAllSubstring{
    // you tube channel, "stack education" youtube channle for print all substring
    // abc , a is at 0th position , b at 1th and c at 2th position 
    //when we want to print substring of a , the it would be a, ab, abc
    // means here we need starting point i.e. "a" and we traverse till the end, so we need ending point
    // we also need length of a string, why we need length?
    /* bcoz we will find substring of diffrent different length , like in length1 we have a jo ki a se bna h,b jo ki b se bna h,c jo ki c se bna h
    int length2 we have ab for a se bna hua substring, bc --b se bna hua substring
    now length3 we have abc jo  sirf a se bna hua substring h,,, isliye hum length k liye loop chalayenge 1 to size of length 
    hence--- a   b    c
             ab  bc
             abc  
     */
    static void print_substring(char[] arr, int str_length){
        for(int substring = 1; substring<= str_length; substring++){
            for(int start =0; start<= str_length - substring; start++){
                int end= substring+str_length-1;
                for(int str_index =start; str_index<=end ; str_index++){
                    System.out.print(arr[str_index]);
        
                }System.out.println();
            }

        }
    }
    
    public static void main(String [] args){
        char[] arr = {'a','b','c'};
        print_substring(arr, arr.length);
    }

    
}