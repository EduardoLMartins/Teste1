package hotel;
import java.util.Scanner;
import hotel.quartos;
public class Main {

	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Quantos quartos foram alugados?");
            int n = sc.nextInt();
            String name;
            String email;
            int numQuarto;
            quartos[] vect = new quartos[10];
            
		for(int i=0;i<n;i++) {
			sc.nextLine();
			System.out.print("Nome: ");
			name = sc.nextLine();
			System.out.println("Email: ");
			email = sc.nextLine();
			System.out.println("Numero do quarto: ");
			numQuarto = sc.nextInt();
			vect[numQuarto] = new quartos(name, email, numQuarto);
		}
       for(int i =0;i<9;i++) {
    	   if(vect[i]!= null) {
    		   System.out.println(vect[i] +","+ i);
    	   }else {System.out.println();}
       }
		sc.close();
		
	}

	}
