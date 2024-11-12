package org.example.test;

import org.example.controller.FuncionarioController;
import org.example.domain.FuncionarioDomain;

import java.sql.SQLException;
import java.util.List;

public class Funcionarios {
    public Funcionarios() {
    }

    public static void obtenerFuncionarios(FuncionarioController funcionarioController) {
        try {
            List<FuncionarioDomain> funcionarios = funcionarioController.obtenerFuncionarios();
            if (funcionarios.isEmpty()) {
                System.out.println("No hay funcionarios registrados");
            } else {
                funcionarios.forEach((funcionarioDomain) -> {
                    System.out.println("ID: " + funcionarioDomain.getId());
                    System.out.println("Tipo ID: " + funcionarioDomain.getTipo_id());
                    System.out.println("Nombres: " + funcionarioDomain.getNombres());
                    System.out.println("Apellidos: " + funcionarioDomain.getApellidos());
                    System.out.println("Estado Civil: " + funcionarioDomain.getEstado_civil());
                    System.out.println("Sexo: " + funcionarioDomain.getSexo());
                    System.out.println("Direccion: " + funcionarioDomain.getDireccion());
                    System.out.println("Telefono: " + funcionarioDomain.getTelefono());
                    System.out.println("Fecha Nacimiento: " + funcionarioDomain.getFecha_nacimiento());
                    System.out.println("=====================================");
                });
            }
        }catch (SQLException var2) {
            SQLException ex = var2;
            ex.printStackTrace();
            System.out.println("Error al obtener los funcionarios");
        }
    }

}
