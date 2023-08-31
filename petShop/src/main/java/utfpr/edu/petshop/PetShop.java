package utfpr.edu.petshop;

import java.util.Scanner;
import utfpr.edu.animais.Animais;
import utfpr.edu.animais.Cachorro;
import utfpr.edu.animais.Gato;
import utfpr.edu.animais.Peixe;
import utfpr.edu.pessoas.Pessoas;
import utfpr.edu.pessoas.Tutor;


public class PetShop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        boolean continuar = true;
        int animal, index = 0, aux = 0, opcoes = 0;
        
        Animais[] animaisCadastrados = new Animais[30];
        Pessoas[] pessoasCadastradas = new Pessoas[30];
        
        System.out.println("OLÁ, SEJA BEM VINDO AO NOSSO HOTEL!");
        System.out.println("POR GENTILEZA PREENCHA OS DADOS A BAIXO.");
        System.out.println("----------------------------------------");
        System.out.println("1 - CADASTRAR UM ANIMAL E PESSOA");
        System.out.println("2 - CADASTRAR UM FUNCIONÁRIO");
        System.out.println("3 - FAZER UM AGENDAMENTO");
        opcoes = scan.nextInt();
        scan.nextLine();
        if (opcoes == 1) {
            while (continuar){     

                Animais animais = new Animais();
                animaisCadastrados[index] = animais.cadastroAnimal();

                Pessoas pessoas = new Pessoas();
                pessoasCadastradas[index] = pessoas.cadastroPessoas(); 

                pessoasCadastradas[index].setAnimal(animaisCadastrados[index]);

                index++;

                System.out.println("GOSTARIA REALIZAR MAIS UM CADASTRO?");
                System.out.println("1 - SIM \n"
                        + "2 - NÃO");
                aux = scan.nextInt();
                while (aux != 1 && aux != 2){
                    System.out.println("VOCÊ DIGITOU A OPÇÃO ERRADA, POR FAVOR, INFORME NOVAMENTE");
                    System.out.println("1 - SIM \n"
                        + "2 - NÃO");
                    aux = scan.nextInt();
                }
                if (aux == 2){
                    continuar = false;
                }
            }
        }
        
        System.out.println(animaisCadastrados.getClass());
        
        for (Animais animaisArrays : animaisCadastrados){
            if (animaisArrays != null) {
                System.out.println(animaisArrays.getNome());
                
            }
        }
        
        for (Pessoas pessoasArrays : pessoasCadastradas){
            if (pessoasArrays != null) {
                System.out.println(pessoasArrays.getNome());
                
            }
        }

    }
}
