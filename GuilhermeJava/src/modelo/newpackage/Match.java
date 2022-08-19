package modelo.newpackage;
public class Match {
    private int id_match;
    private Formulario formulario;
    private boolean match;

    public Match(int id_match, Formulario formulario, boolean match) {
        this.id_match = id_match;
        this.formulario = formulario;
        this.match = match;
    }

    public int getId_match() {
        return id_match;
    }

    public Formulario getFormulario() {
        return formulario;
    }

    public boolean isMatch() {
        return match;
    }

    public void setId_match(int id_match) {
        this.id_match = id_match;
    }

    public void setFormulario(Formulario formulario) {
        this.formulario = formulario;
    }

    public void setMatch(boolean match) {
        this.match = match;
    }

    @Override
    public String toString() {
        return "Match{" + "id_match=" + id_match + ", formulario=" + formulario + ", match=" + match + '}';
    }
    
    
}
