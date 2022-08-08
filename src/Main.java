import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso();
        c1.setTitulo("Java");
        c1.setDescricao("Estudando Java");
        c1.setCargaHoraria(72);

        Mentoria m1 = new Mentoria();

        m1.setTitulo("Java");
        m1.setDescricao("Estudando Java");
        m1.setData(LocalDate.now());
    }
}
