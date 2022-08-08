import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso c1 = new Curso();
        c1.setTitulo("Java");
        c1.setDescricao("Estudando Java");
        c1.setCargaHoraria(72);

        Curso c2 = new Curso();
        c2.setTitulo("JavaScript");
        c2.setDescricao("Descriação sobre o JS");
        c2.setCargaHoraria(36);

        Mentoria m1 = new Mentoria();
        m1.setTitulo("Java");
        m1.setDescricao("Estudando Java");
        m1.setData(LocalDate.now());

        Bootcamp b1 = new Bootcamp();
        b1.setNome("Java Developer");
        b1.setDescricao("Descricao curso Java Developer");
        b1.getConteudos().add(c1);
        b1.getConteudos().add(c2);
        b1.getConteudos().add(m1);

        Dev d1 = new Dev();
        d1.setNome("Poliana");
        d1.inscreveBootcamp(b1);
        System.out.println("Conteúdos inscritos de " + d1.getNome() + ": " + d1.getConteudosInscritos());
        d1.progredir();
        System.out.println("######");
        System.out.println("Conteúdos inscritos de " + d1.getNome() + ": " + d1.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + d1.getNome() + ": " + d1.getConteudosConcluidos());
        System.out.println("XP: " + d1.calcularTotalXP());

        System.out.println("_______________");
        Dev d2 = new Dev();
        d2.setNome("José");
        d2.inscreveBootcamp(b1);
        System.out.println("Conteúdos inscritos de " + d2.getNome() + ": " + d2.getConteudosInscritos());
        d2.progredir();
        System.out.println("######");
        System.out.println("Conteúdos inscritos de " + d2.getNome() + ": " + d2.getConteudosInscritos());
        System.out.println("Conteúdos concluídos de " + d2.getNome() + ": " + d2.getConteudosConcluidos());
        System.out.println("XP: " + d2.calcularTotalXP());
    }
}
