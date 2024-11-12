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
    private static final String CREATE_FUNCIONARIO = "INSERT INTO funcionario (Tipoid, Numerodocumento, Nombres, Apellidos, Estadocivil, Sexo, Direccion, Telefono, Fechanacimiento) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
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
            resultSet = preparedStatement.executeQuery();

            while (resultSet.next()) {
                FuncionarioDomain funcionario = new FuncionarioDomain();
                funcionario.setId(resultSet.getInt("Id"));
                funcionario.setTipoid(resultSet.getString("Tipoid"));
                funcionario.setNumerodocumento(resultSet.getString("Numerodocumento"));
                funcionario.setNombres(resultSet.getString("Nombres"));
                funcionario.setApellidos(resultSet.getString("Apellidos"));
                funcionario.setEstadocivil(resultSet.getString("Estadocivil"));
                funcionario.setSexo(resultSet.getString("Sexo"));
                funcionario.setDireccion(resultSet.getString("Direccion"));
                funcionario.setTelefono(resultSet.getString("Telefono"));
                funcionario.setFechanacimiento(resultSet.getString("Fechanacimiento"));
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

    //Metodo para crear funcionario
    public  void crear(FuncionarioDomain funcionario) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareCall(CREATE_FUNCIONARIO);
            preparedStatement.setString(1, funcionario.getTipoid());
            preparedStatement.setString(2, funcionario.getNumerodocumento());
            preparedStatement.setString(3, funcionario.getNombres());
            preparedStatement.setString(4, funcionario.getApellidos());
            preparedStatement.setString(5, funcionario.getEstadocivil());
            preparedStatement.setString(6, funcionario.getSexo());
            preparedStatement.setString(7, funcionario.getDireccion());
            preparedStatement.setString(8, funcionario.getTelefono());
            preparedStatement.setString(9, funcionario.getFechanacimiento());
            preparedStatement.executeUpdate();
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }

    public FuncionarioDomain obtenerFuncionarioPorId(int id) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet resultSet = null;
        FuncionarioDomain funcionario = null;

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(GET_FUNCIONARIO_BY_ID);
            preparedStatement.setInt(1, id);
            resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                funcionario = new FuncionarioDomain();
                funcionario.setId(resultSet.getInt("Id"));
                funcionario.setTipoid(resultSet.getString("Tipoid"));
                funcionario.setNumerodocumento(resultSet.getString("Numerodocumento"));
                funcionario.setNombres(resultSet.getString("Nombres"));
                funcionario.setApellidos(resultSet.getString("Apellidos"));
                funcionario.setEstadocivil(resultSet.getString("Estadocivil"));
                funcionario.setSexo(resultSet.getString("Sexo"));
                funcionario.setDireccion(resultSet.getString("Direccion"));
                funcionario.setTelefono(resultSet.getString("Telefono"));
                funcionario.setFechanacimiento(resultSet.getString("Fechanacimiento"));
            }

            return funcionario;
        } finally {
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

    public void actualizar(int id,FuncionarioDomain funcionario) throws SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try{
            connection = ConnectionUtil.getConnection();
            preparedStatement =connection.prepareStatement(UPDATE_FUNCIONARIO);
            preparedStatement.setString(1, funcionario.getTipoid());
            preparedStatement.setString(2, funcionario.getNumerodocumento());
            preparedStatement.setString(3, funcionario.getNombres());
            preparedStatement.setString(4, funcionario.getApellidos());
            preparedStatement.setString(5, funcionario.getEstadocivil());
            preparedStatement.setString(6, funcionario.getSexo());
            preparedStatement.setString(7, funcionario.getDireccion());
            preparedStatement.setString(8, funcionario.getTelefono());
            preparedStatement.setString(9, funcionario.getFechanacimiento());
            preparedStatement.setInt(10, id);
            preparedStatement.executeUpdate();
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }
    }

    public void eliminar(int id) throws  SQLException {
        Connection connection = null;
        PreparedStatement preparedStatement = null;

        try {
            connection = ConnectionUtil.getConnection();
            preparedStatement = connection.prepareStatement(DELETE_FUNCIONARIO);
            preparedStatement.setInt(1, id);
            preparedStatement.executeUpdate();
        } finally {
            if (connection != null) {
                connection.close();
            }
            if (preparedStatement != null) {
                preparedStatement.close();
            }
        }

    }
}
