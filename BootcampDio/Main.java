import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java", "Aprenda Java do zero ao avançado!");

        Curso cursoJava = new Curso("Java Básico", "Curso introdutório de Java", 40);
        Curso cursoJavaAvancado = new Curso("Java Avançado", "Curso avançado de Java", 60);

        Mentoria mentoriaJava = new Mentoria("Mentoria de Java", "Sessão de mentoria para tirar dúvidas", LocalDate.now());

        bootcamp.adicionarCurso(cursoJava);
        bootcamp.adicionarCurso(cursoJavaAvancado);
        bootcamp.adicionarMentoria(mentoriaJava);

        Dev dev1 = new Dev("João", "joao@email.com");
        dev1.inscreverCurso(cursoJava);
        dev1.inscreverMentoria(mentoriaJava);

        bootcamp.inscreverDev(dev1);

        // Exibindo informações
        System.out.println("Bootcamp: " + bootcamp.getNome());
        System.out.println("Devs inscritos: " + bootcamp.getDevsInscritos().get(0).getNome());
        System.out.println("Cursos: ");
        for (Curso curso : bootcamp.getCursos()) {
            System.out.println("- " + curso.getTitulo());
        }
    }
}
