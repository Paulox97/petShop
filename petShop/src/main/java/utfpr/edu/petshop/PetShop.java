package utfpr.edu.petshop;

import java.util.Scanner;
import utfpr.edu.animais.Animais;
import utfpr.edu.animais.Cachorro;
import utfpr.edu.animais.Gato;
import utfpr.edu.animais.Peixe;
import utfpr.edu.pessoas.Tutor;


public class PetShop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean continuar = true;
        int animal;
        
        System.out.println("OLÁ, SEJA BEM VINDO AO NOSSO HOTEL!");
        System.out.println("POR GENTILEZA PREENCHA OS DADOS A BAIXO.");
        System.out.println("----------------------------------------");
        
        while (continuar){
            Tutor tutor = new Tutor();
            
            Animais animais = new Animais();
            animais.cadastroAnimal();
            
            System.out.println(animais.getEspecie());
            

                    
                    
//            System.out.println("INFORME O NOME DO TUTOR: ");
//            tutor.setNome(scan.nextLine());
//            System.out.println("INFORME O DOCUMENTO DO TUTOR: ");
//            tutor.setDocumento(scan.nextLine());
            
            
        }
        
        
    }
}
