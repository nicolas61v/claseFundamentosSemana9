import java.util.Scanner;
public class main{
        public static void main(String args[]){
        Scanner kb = new Scanner(System.in);
        System.out.println("ingrese un texto ");
        String message = kb.next();
        int contA = 0;
        for(int i=0;i<message.length();i++){
            char current = message.charAt(i);
            if(current=='a'){
                contA++;
            }
        }
        System.out.println("total a es "+contA);
    }
    
}