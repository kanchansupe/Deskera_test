public class DecimalToBinary{    
public static void toBinary(int dec){    
     int binary[] = new int[20];    
     int source = 0;    
     while(dec > 0){    
       binary[source++] = dec%2;    
       dec = dec/2;    
     }    
     for(int i = source-1;i >= 0;i--){    
       System.out.print(binary[i]);    
     }    
System.out.println();  
}    
public static void main(String args[]){      
System.out.println("Number 35 binary is ");  
toBinary(35);    
}}      
