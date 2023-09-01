package utfpr.edu.pessoas;

import java.util.Scanner;


public class Funcionario extends Pessoas{
        private String carteiraTrabalho;
        
        Scanner scan = new Scanner(System.in);

    public String getCarteiraTrabalho() {
        return carteiraTrabalho;
    }

    public void setCarteiraTrabalho(String carteiraTrabalho) {
        this.carteiraTrabalho = carteiraTrabalho;
    }
    
    public Funcionario cadastroFuncionario(){
        Funcionario funcionario = new Funcionario();
        System.out.println("INFORME O NOME DO FUNCIONÁRIO: ");
        funcionario.setNome(scan.nextLine());
        System.out.println("INFORME O DOCUMENTO DO FUNCIONÁRIO: ");
        funcionario.setDocumento(scan.nextLine());
        System.out.println("INFORME A CARTEIRA DE TRABALHO DO FUNCIONÁRIO: ");
        funcionario.setCarteiraTrabalho(scan.nextLine());
        
        return funcionario;
        
    }
}
