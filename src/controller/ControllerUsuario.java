package controller;

import model.ModelUsuario;
import DAO.DAOUsuario;
import java.util.ArrayList;

public class ControllerUsuario {

    private DAOUsuario daoUsuario = new DAOUsuario();

    public int salvarUsuarioController(ModelUsuario pModelUsuario) {
        return this.daoUsuario.salvarUsuarioDAO(pModelUsuario);
    }

    public ModelUsuario getUsuarioController(int pIdUsuario) {
        return this.daoUsuario.getUsuarioDAO(pIdUsuario);
    }

    public ArrayList<ModelUsuario> getListaUsuarioController() {
        return this.daoUsuario.getListaUsuarioDAO();
    }

    public boolean atualizarUsuarioController(ModelUsuario pModelUsuario) {
        return this.daoUsuario.atualizarUsuarioDAO(pModelUsuario);
    }

    public boolean excluirUsuarioController(int pIdUsuario) {
        return this.daoUsuario.excluirUsuarioDAO(pIdUsuario);
    }

    public boolean getValidarUsuarioController(ModelUsuario pModelUsuario) {
        return this.daoUsuario.getValidarUsuarioDAO(pModelUsuario);
    }
}
