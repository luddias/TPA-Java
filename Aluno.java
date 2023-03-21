public class Aluno {
    private String nome;
    private int matricula;
    private int nota;
    public Aluno(String nome, int matricula, int nota){
        this.nome=nome;
        this.matricula=matricula;
        this.nota=nota;
    }
    public int compareTo(Aluno a){
        return Integer.compare(this.matricula, a.matricula);
    }
}
