package org.example.controller;

import org.example.dao.FuncionarioDao;
import org.example.domain.FuncionarioDomain;
import org.example.test.Funcionarios;

import java.sql.SQLException;
import java.util.List;

public class FuncionarioController {
    private FuncionarioDao funcionarioDao;

    public FuncionarioController() {
    }

    public List<FuncionarioDomain> obtenerFuncionarios() throws SQLException {
        return this.funcionarioDao.obtenerFuncionarios();
    }

    public void crear(FuncionarioDomain funcionario) throws SQLException {
        this.funcionarioDao.crear(funcionario);
    }
}
