package utfpr.edu.reservas;

import java.util.Date;
import utfpr.edu.pessoas.Funcionario;
import utfpr.edu.pessoas.Tutor;


public class Reservas {
    private Tutor tutor;
    private Funcionario funcionario;
    private Date checkIn;
    private Date checkOut;

    public Tutor getTutor() {
        return tutor;
    }

    public void setTutor(Tutor tutor) {
        this.tutor = tutor;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckIn(Date checkIn) {
        this.checkIn = checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }
    
    
}
