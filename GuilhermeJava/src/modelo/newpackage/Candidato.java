
package modelo.newpackage;

public class Candidato {
     private int id_candidato;
     private String celular_usuario;
     private String email_usuario;
     private String cpf;
     private String nome_usuario_completo;
     private String senha_usuario;

    public Candidato(int id_candidato, String celular_usuario, String email_usuario, String cpf, String nome_usuario_completo, String senha_usuario) {
        this.id_candidato = id_candidato;
        this.celular_usuario = celular_usuario;
        this.email_usuario = email_usuario;
        this.cpf = cpf;
        this.nome_usuario_completo = nome_usuario_completo;
        this.senha_usuario = senha_usuario;
    }

    public int getId_candidato() {
        return id_candidato;
    }

    public String getCelular_usuario() {
        return celular_usuario;
    }

    public String getEmail_usuario() {
        return email_usuario;
    }

    public String getCpf() {
        return cpf;
    }

    public String getNome_usuario_completo() {
        return nome_usuario_completo;
    }

    public String getSenha_usuario() {
        return senha_usuario;
    }

    public void setId_candidato(int id_candidato) {
        this.id_candidato = id_candidato;
    }

    public void setCelular_usuario(String celular_usuario) {
        this.celular_usuario = celular_usuario;
    }

    public void setEmail_usuario(String email_usuario) {
        this.email_usuario = email_usuario;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setNome_usuario_completo(String nome_usuario_completo) {
        this.nome_usuario_completo = nome_usuario_completo;
    }

    public void setSenha_usuario(String senha_usuario) {
        this.senha_usuario = senha_usuario;
    }

    @Override
    public String toString() {
        return "Candidato{" + "id_candidato=" + id_candidato + ", celular_usuario=" + celular_usuario + ", email_usuario=" + email_usuario + ", cpf=" + cpf + ", nome_usuario_completo=" + nome_usuario_completo + ", senha_usuario=" + senha_usuario + '}';
    }
     
    
    
}
