import java.util.HashMap;

public class Treino {
    private static final HashMap<String, String[]> treinos = new HashMap<>();

    static {
        treinos.put("INICIANTE-3", new String[]{"Treino A: Peito e Bíceps", "Treino B: Pernas e Ombros", "Treino C: Costas e Tríceps"});
        treinos.put("INICIANTE-4", new String[]{"Treino A: Peito e Bíceps", "Treino B: Pernas", "Treino C: Costas e Tríceps", "Treino D: Ombros e Abdômen"});
        treinos.put("INICIANTE-5", new String[]{"Treino A: Peito", "Treino B: Pernas", "Treino C: Costas", "Treino D: Ombros", "Treino E: Abdômen e Cardio"});

        treinos.put("INTERMEDIARIO-3", new String[]{"Treino A: Peito e Costas", "Treino B: Pernas e Ombros", "Treino C: Bíceps, Tríceps e Abdômen"});
        treinos.put("INTERMEDIARIO-4", new String[]{"Treino A: Peito e Tríceps", "Treino B: Pernas", "Treino C: Costas e Bíceps", "Treino D: Ombros e Abdômen"});
        treinos.put("INTERMEDIARIO-5", new String[]{"Treino A: Peito", "Treino B: Pernas", "Treino C: Costas", "Treino D: Ombros", "Treino E: Bíceps e Tríceps"});

        treinos.put("AVANCADO-3", new String[]{"Treino A: Full Body", "Treino B: Cardio Intensivo", "Treino C: Musculação Completa"});
        treinos.put("AVANCADO-4", new String[]{"Treino A: Peito e Costas", "Treino B: Pernas", "Treino C: Bíceps e Tríceps", "Treino D: Ombros e Abdômen"});
        treinos.put("AVANCADO-5", new String[]{"Treino A: Peito e Bíceps", "Treino B: Pernas", "Treino C: Costas e Tríceps", "Treino D: Ombros", "Treino E: Abdômen e Cardio"});
    }

    public static String[] getTreino(NivelTreino nivel, FrequenciaSemanal frequencia) {
        return treinos.get(nivel.name() + "-" + frequencia.getDias());
    }
}
