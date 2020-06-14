// Given an array of integers, find the first missing positive integer in linear time and constant space. 
// In other words, find the lowest positive integer that does not exist in the array.
//  The array can contain duplicates and negative numbers as well

// For example, the input [3, 4, -1, 1] should give 2. The input [1, 2, 0] should give 3.

import java.io.*;
import java.util.*;

import java.io.*;
import java.util.*;

public class missinginteger {
    public static void main(String[] args) {
        Integer[] lista = {3, 4, -1, 1};
        solution(lista);
    }

    public static void solution(Integer[] lista) {
        int minimuminteger=1;
        for(item: lista){
            if(item==minimuminteger){
                minimuminteger=item;
            }
        }
        System.out.println(minimuminteger);
        
    }
