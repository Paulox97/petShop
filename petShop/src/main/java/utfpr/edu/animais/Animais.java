package utfpr.edu.animais;

import java.util.Scanner;


public class Animais {
    private String nome;
    private String especie;
    private int idade;
    
    Scanner scan = new Scanner(System.in);

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public Animais cadastroAnimal(){
        int animal;
        
        System.out.println("QUAL O TIPO DE ANIMAL VAMOS HOSPEDAR?");
        System.out.println("1 - CACHORRO \n"
                + "2 - GATO \n"
                + "3 - PEIXE");
        animal = scan.nextInt();
        scan.nextLine();
        while (animal != 1 && animal != 2 && animal != 3){
            System.out.println("O VALOR DGITADO NÃO É VALIDO, POR GENTILEZA PREENCHA NOVAMENTE: ");
            System.out.println("1 - CACHORRO \n"
                + "2 - GATO \n"
                + "3 - PEIXE");
            animal = scan.nextInt();

        }
        if (animal == 1){
            Cachorro cachorro = new Cachorro();
            System.out.println("INFORME O NOME DO CACHORRO: ");
            cachorro.setNome(scan.nextLine());
            System.out.println("INFORME A RAÇA DO CACHORRO: ");
            cachorro.setEspecie(scan.nextLine());
            System.out.println("INFORME A IDADE DO CACHORRO: ");
            cachorro.setIdade(scan.nextInt());
            return cachorro;
        }
        else if (animal == 2){
            Gato gato = new Gato();
            System.out.println("INFORME O NOME DO GATO: ");
            gato.setNome(scan.nextLine());
            System.out.println("INFORME A RAÇA DO GATO: ");
            gato.setEspecie(scan.nextLine());
            System.out.println("INFORME A IDADE DO GATO: ");
            gato.setIdade(scan.nextInt());
            return gato;
        }
        else {
            Peixe peixe = new Peixe();
            System.out.println("INFORME O NOME DO PEIXE: ");
            peixe.setNome(scan.nextLine());
            System.out.println("INFORME A RAÇA DO PEIXE: ");
            peixe.setEspecie(scan.nextLine());
            System.out.println("INFORME A IDADE DO PEIXE: ");
            peixe.setIdade(scan.nextInt());
            return peixe;
        }
        return Animais;
    }
    
    
    
}
