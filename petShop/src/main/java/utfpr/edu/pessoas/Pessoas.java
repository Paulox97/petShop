package utfpr.edu.pessoas;

import java.util.Scanner;
import utfpr.edu.animais.Animais;


public class Pessoas {
    private String nome;
    private String documento;
    private Animais animal;
    
    Scanner scan = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Animais getAnimal() {
        return animal;
    }

    public void setAnimal(Animais animal) {
        this.animal = animal;
    }
    
    public Pessoas cadastroPessoas(){
        int pessoa;
        
        System.out.println("QUAL O TIOPO DE PESSOA VAMOS CADASTRAR?");
        System.out.println("1 - TUTOR \n"
                + "2 - FUNCIONÁRIO");
        pessoa = scan.nextInt();
        scan.nextLine();
        while (pessoa != 1 && pessoa != 2){
            System.out.println("VALOR DIGITADO NÃO É VALIDO, POR GENTILEZA PREENCHA NOVAMENTE");
            System.out.println("1 - TUTOR \n"
                + "2 - FUNCIONÁRIO");
            pessoa = scan.nextInt();
            scan.nextLine();
        }
        if (pessoa == 1){
            Tutor tutor = new Tutor();
            System.out.println("INFORME O NOME DO TUTOR: ");
            tutor.setNome(scan.nextLine());
            System.out.println("INFORME O DOCUMENTO: ");
            tutor.setDocumento(scan.nextLine());
            return tutor;
        }
        else {
            Funcionario funcionario = new Funcionario();
            System.out.println("INFORME O NOME DO FUNCIONÁRIO: ");
            funcionario.setNome(scan.nextLine());
            System.out.println("INFORME O DOCUMENTO DO FUNCIONÁRIO: ");
            funcionario.setDocumento(scan.nextLine());
            return funcionario;
        }
        
    }
    
}
