import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso = new Curso();
        curso.setTitulo("Curso: Java");
        curso.setDescricao("Descrição curso java");
        curso.setCargaHoraria(8);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria: Java");
        mentoria.setDescricao("Mentoria java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(mentoria);

        Dev devUsuario = new Dev();
        devUsuario.setNome("João");
        devUsuario.inscreverBootcamp(bootcamp);

        System.out.println("Conteúdo Inscrito de "+devUsuario.getNome()+ ": " + devUsuario.getConteudosInscritos());

        devUsuario.progredir();
        System.out.println("Conteúdo Concluido de "+devUsuario.getNome()+ ": " + devUsuario.getConteudosConcluidos());

        devUsuario.progredir();
        System.out.println("Conteúdo Inscrito de "+devUsuario.getNome()+ ": " + devUsuario.getConteudosInscritos());

        System.out.println("XP: " + devUsuario.calcularTotalXP());

    }
}