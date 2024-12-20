package org.example.controller;

import org.example.dao.FuncionarioDao;
import org.example.domain.FuncionarioDomain;

import java.sql.SQLException;
import java.util.List;


public class FuncionarioController {
    private FuncionarioDao funcionarioDao;

    public FuncionarioController() {
        this.funcionarioDao = new FuncionarioDao();
    }

    public List<FuncionarioDomain> obtenerFuncionarios() throws SQLException {
        return this.funcionarioDao.obtenerFuncionarios();
    }

    public void crear(FuncionarioDomain funcionario) throws SQLException {
        this.funcionarioDao.crear(funcionario);
    }

    public FuncionarioDomain obtenerFuncionarioPorId(int id) throws SQLException {
        return this.funcionarioDao.obtenerFuncionarioPorId(id);
    }

    public void actualizar(int id, FuncionarioDomain funcionario) throws SQLException {
        this.funcionarioDao.actualizar(id, funcionario);
    }

    public void eliminar(int id) throws SQLException {
        this.funcionarioDao.eliminar(id);
    }
}
