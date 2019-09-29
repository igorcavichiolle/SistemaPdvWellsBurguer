package model;

public class ModelUsuario {

    private int idUsuario;
    private String usuNome;
    private String usuLogin;
    private String usuSenha;

    public ModelUsuario() {
    }

    public void setIdUsuario(int pIdUsuario) {
        this.idUsuario = pIdUsuario;
    }

    public int getIdUsuario() {
        return this.idUsuario;
    }

    public void setUsuNome(String pUsuNome) {
        this.usuNome = pUsuNome;
    }

    public String getUsuNome() {
        return this.usuNome;
    }

    public void setUsuLogin(String pUsuLogin) {
        this.usuLogin = pUsuLogin;
    }

    public String getUsuLogin() {
        return this.usuLogin;
    }

    public void setUsuSenha(String pUsuSenha) {
        this.usuSenha = pUsuSenha;
    }

    public String getUsuSenha() {
        return this.usuSenha;
    }

    @Override
    public String toString() {
        return "ModelUsuario {" + "::idUsuario = " + this.idUsuario + "::usuNome = " + this.usuNome + "::usuLogin = " + this.usuLogin + "::usuSenha = " + this.usuSenha + "}";
    }
}
