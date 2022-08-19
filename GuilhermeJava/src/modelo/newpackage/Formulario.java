package modelo.newpackage;
public class Formulario {
    private String id_formulario;
    private Candidato candidato;
    private String endereco_usuario;
    private String experiencia_usuario;
    private String projetos_usuario;
    private String cursos_usuario;
    private String valores_pessoais;
    private String descricao_pessoais;
    private String descricao_valores_empresa;
    private String portifolio;

    public Formulario(String id_formulario, Candidato candidato, String endereco_usuario, String experiencia_usuario, String projetos_usuario, String cursos_usuario, String valores_pessoais, String descricao_pessoais, String descricao_valores_empresa, String portifolio) {
        this.id_formulario = id_formulario;
        this.candidato = candidato;
        this.endereco_usuario = endereco_usuario;
        this.experiencia_usuario = experiencia_usuario;
        this.projetos_usuario = projetos_usuario;
        this.cursos_usuario = cursos_usuario;
        this.valores_pessoais = valores_pessoais;
        this.descricao_pessoais = descricao_pessoais;
        this.descricao_valores_empresa = descricao_valores_empresa;
        this.portifolio = portifolio;
    }

    public String getId_formulario() {
        return id_formulario;
    }

    public Candidato getCandidato() {
        return candidato;
    }

    public String getEndereco_usuario() {
        return endereco_usuario;
    }

    public String getExperiencia_usuario() {
        return experiencia_usuario;
    }

    public String getProjetos_usuario() {
        return projetos_usuario;
    }

    public String getCursos_usuario() {
        return cursos_usuario;
    }

    public String getValores_pessoais() {
        return valores_pessoais;
    }

    public String getDescricao_pessoais() {
        return descricao_pessoais;
    }

    public String getDescricao_valores_empresa() {
        return descricao_valores_empresa;
    }

    public String getPortifolio() {
        return portifolio;
    }

    public void setId_formulario(String id_formulario) {
        this.id_formulario = id_formulario;
    }

    public void setCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

    public void setEndereco_usuario(String endereco_usuario) {
        this.endereco_usuario = endereco_usuario;
    }

    public void setExperiencia_usuario(String experiencia_usuario) {
        this.experiencia_usuario = experiencia_usuario;
    }

    public void setProjetos_usuario(String projetos_usuario) {
        this.projetos_usuario = projetos_usuario;
    }

    public void setCursos_usuario(String cursos_usuario) {
        this.cursos_usuario = cursos_usuario;
    }

    public void setValores_pessoais(String valores_pessoais) {
        this.valores_pessoais = valores_pessoais;
    }

    public void setDescricao_pessoais(String descricao_pessoais) {
        this.descricao_pessoais = descricao_pessoais;
    }

    public void setDescricao_valores_empresa(String descricao_valores_empresa) {
        this.descricao_valores_empresa = descricao_valores_empresa;
    }

    public void setPortifolio(String portifolio) {
        this.portifolio = portifolio;
    }

    @Override
    public String toString() {
        return "formulario{" + "id_formulario=" + id_formulario + ", candidato=" + candidato + ", endereco_usuario=" + endereco_usuario + ", experiencia_usuario=" + experiencia_usuario + ", projetos_usuario=" + projetos_usuario + ", cursos_usuario=" + cursos_usuario + ", valores_pessoais=" + valores_pessoais + ", descricao_pessoais=" + descricao_pessoais + ", descricao_valores_empresa=" + descricao_valores_empresa + ", portifolio=" + portifolio + '}';
    }


}
