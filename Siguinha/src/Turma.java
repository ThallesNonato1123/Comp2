import java.util.HashMap;
import java.util.Map;


public class Turma {

    private float nota;
    private Aluno aluno;
    private Professor professor;
    private float periodo;

    private final Map<Long , Aluno > alunoMap;
    private final Map<Long, Float> notaMap;


    public Turma(Disciplina disciplina, Professor professor){
        this.alunoMap = new HashMap<>();
        this.notaMap = new HashMap<>();
    }

    public void inscreverAluno(Aluno aluno){
        long dre = aluno.getDre();
        this.alunoMap.put(dre,aluno);
    }

    public void atribuirMediaFinal(long dre, float nota){
        dre = aluno.getDre();
        this.notaMap.put(dre,nota);
    }

    public float obtermediaFinal(long dre){
        return notaMap.get(dre);
    }
    public String listarAlunos(){
        String frase = "";
        for(Map.Entry<Long, Aluno> parChaveValor : alunoMap.entrySet()){
            Aluno aluno = parChaveValor.getValue();
            frase += aluno.getNome() + "\n";
        }
        return frase;
    }
}

