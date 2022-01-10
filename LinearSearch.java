package javaapplication1;
import java.util.Scanner;

public class LinearSearch {

    public static void main(String[] args) {
//        System.out.println("Hello"); 
int n=10000000;
int array[]=new int[n];
int Var = 1;
Scanner sc = new Scanner(System.in);
for(int i=0;i<n;i++){
    array[i]= Var++;
}

int key = 555;
int i = 0;
while(i<n){
    
    if(array[i]==key){
        int myindex = i;
        System.out.println("Index of " + key + "is : " + myindex);
    }
i++;
}
    }  
}
