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
    
    public Pessoas cadastroTutor(Animais animal){
        
            Tutor tutor = new Tutor();
            System.out.println("INFORME O NOME DO TUTOR: ");
            tutor.setNome(scan.nextLine());
            System.out.println("INFORME O DOCUMENTO: ");
            tutor.setDocumento(scan.nextLine());
            tutor.setAnimal(animal);
            return tutor;
    }
    
}
