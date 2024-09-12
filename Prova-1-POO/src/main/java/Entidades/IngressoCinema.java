package Entidades;
import Entidades.Enum.DiaDaSemana;
import javax.swing.JOptionPane;

public class IngressoCinema {
    private DiaDaSemana dia;
    private boolean estudante;

    public IngressoCinema() {
    }

    public IngressoCinema(DiaDaSemana dia, boolean estudante) {
        this.dia = dia;
        this.estudante = estudante;
    }

    public DiaDaSemana getDia() {
        return dia;
    }

    public void setDia(DiaDaSemana dia) {
        if (dia == null) {
            JOptionPane.showMessageDialog(null, "Informe um valor!");
        } else {
            this.dia = dia;
        }
    }

    public boolean isEstudante() {
        return estudante;
    }

    public void setEstudante(boolean estudante) {
        this.estudante = estudante;
    }
    
    public Double precoCinema() {
        Double valor = 15.0;
        if (isEstudante()) {
            if (dia == dia.SEGUNDA || dia == dia.SEXTA) {
                return valor - valor * 0.3;
            }
            
            if (dia == dia.SABADO || dia == dia.DOMINGO) {
                return (valor * 1.4) - ((valor * 1.4) * 0.3) ;
            }
            
            if (dia == dia.TERCA || dia == dia.QUARTA || dia == dia.QUINTA) {
                return (valor * 0.5) - ((valor * 0.5) * 0.3);
            }
        } else {
            if (dia == dia.TERCA || dia == dia.QUARTA || dia == dia.QUINTA) {
                return valor * 0.5;
            }  
            if (dia == dia.SABADO || dia == dia.DOMINGO) {
                return valor * 1.4;
            }
        }
        return valor;
    }
}
