package org.example.dao;

import org.example.domain.FuncionarioDomain;
import org.example.util.ConnectionUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDao {

    //CRUD JAVA Y SQL
    private static final String GET_ALL_FUNCIONARIOS = "SELECT * FROM funcionario";
    private static final String CREATE_FUNCIONARIO = "INSERT INTO funcionario (tipo_id, nombres, apellidos, estado_civil, sexo, direccion, telefono, fecha_nacimiento) VALUES ('?', '?', '?', '?', '?', '?', '?',  '?')";
    private static final String GET_FUNCIONARIO_BY_ID = "SELECT * FROM funcionario WHERE id = ?";
    private static final String UPDATE_FUNCIONARIO = "UPDATE funcionario SET tipo_id = ?, nombres = ?, apellidos = ?, estado_civil = ?, sexo = ?, direccion = ?, telefono = ?, fecha_nacimiento = ?";
    private static final String DELETE_FUNCIONARIO = "DELETE FROM funcionario WHERE id = ?";

    //Metodo para listar funcionarios, obtener funcionario
    public List<FuncionarioDomain> obtenerFuncionarios() throws SQLException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        List<FuncionarioDomain> funcionarios = new ArrayList<>();

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_ALL_FUNCIONARIOS);
            resultSet = preparedStatement.getResultSet();
        }
    }
}
