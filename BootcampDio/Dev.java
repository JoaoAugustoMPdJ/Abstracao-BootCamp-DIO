import java.util.ArrayList;
import java.util.List;

public class Dev {
    private String nome;
    private String email;
    private final List<Curso> cursosInscritos = new ArrayList<>();
    private final List<Mentoria> mentoriasInscritas = new ArrayList<>();

    public Dev(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    public void inscreverCurso(Curso curso) {
        cursosInscritos.add(curso);
    }

    public void inscreverMentoria(Mentoria mentoria) {
        mentoriasInscritas.add(mentoria);
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public List<Curso> getCursosInscritos() {
        return cursosInscritos;
    }

    public List<Mentoria> getMentoriasInscritas() {
        return mentoriasInscritas;
    }
}
