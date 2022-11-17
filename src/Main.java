import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        /*System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp= new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devAntonio = new Dev();
        devAntonio.setNome("Antonio");
        devAntonio.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdos inscritos Antonio" + devAntonio.getConteudosInscritos());
        devAntonio.progredir();
        devAntonio.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Antonio" + devAntonio.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Antonio" + devAntonio.getConteudosConcluidos());
        System.out.println("XP: " + devAntonio.calcularTotalXp());

        System.out.println("-------");

        Dev devVictor = new Dev();
        devVictor.setNome("Victor");
        devVictor.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Victor" + devVictor.getConteudosInscritos());
        devVictor.progredir();
        devVictor.progredir();
        devVictor.progredir();
        System.out.println("-");
        System.out.println("Conteúdos inscritos Victor" + devVictor.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Victor" + devVictor.getConteudosConcluidos());
        System.out.println("XP: " + devVictor.calcularTotalXp());




    }
}