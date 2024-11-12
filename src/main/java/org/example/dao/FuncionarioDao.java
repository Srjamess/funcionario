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

            while (resultSet.next()) {
                FuncionarioDomain funcionario = new FuncionarioDomain();
                funcionario.setId(resultSet.getInt("id"));
                funcionario.setTipo_id(resultSet.getString("tipo_id"));
                funcionario.setNombres(resultSet.getString("nombres"));
                funcionario.setApellidos(resultSet.getString("apellidos"));
                funcionario.setEstado_civil(resultSet.getString("estado_civil"));
                funcionario.setSexo(resultSet.getString("sexo"));
                funcionario.setDireccion(resultSet.getString("direccion"));
                funcionario.setTelefono(resultSet.getString("telefono"));
                funcionario.setFecha_nacimiento(resultSet.getString("fecha_nacimiento"));
                funcionarios.add(funcionario);
            }

            return funcionarios;
        }finally {
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
            if (resultSet != null) {
                resultSet.close();
            }
        }
    }

}
