package javaapplication1;
import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        
        
    int array[]=new int[6];
Scanner sc = new Scanner(System.in);


for(int i=0;i<6;i++){
    array[i]=sc.nextInt();
}

int R =array.length-1;
int L = 0;
int num = 7; 
while(L<=R){
    int M = (L+R)/2;
    if(array[M]==num){
        System.out.println("Index is : " + M);break;
    }
    else if(array[M]<num){
        L=M+1;
                }
    
    else if(array[M]>num){
        R=M-1; 
                }
}
}
}
