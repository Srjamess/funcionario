package org.example.test;

import org.example.controller.FuncionarioController;
import org.example.domain.FuncionarioDomain;

import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

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
                    System.out.println("Numero Documento: " + funcionarioDomain.getNumerodocumento());
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
        } catch (SQLException var2) {
            SQLException ex = var2;
            ex.printStackTrace();
            System.out.println("Error al obtener los funcionarios");
        }
    }

    public static void crear(FuncionarioController funcionarioController) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el tipo de ID: ");
            String tid = sc.nextLine();
            System.out.println("El nombre es : " + tid);
            System.out.println("__________________________________");
            System.out.println("Ingrese el numero de documento: ");
            String nd = sc.nextLine();
            System.out.println("El numero de documento es : " + nd);
            System.out.println("__________________________________");
            System.out.println("Ingrese los nombres: ");
            String n = sc.nextLine();
            System.out.println("Los nombres son : " + n);
            System.out.println("__________________________________");
            System.out.println("Ingrese los apellidos: ");
            String a = sc.nextLine();
            System.out.println("Los apellidos son : " + a);
            System.out.println("__________________________________");
            System.out.println("Ingrese el estado civil: ");
            String ec = sc.nextLine();
            System.out.println("El estado civil es : " + ec);
            System.out.println("__________________________________");
            System.out.println("Ingrese el sexo: ");
            String s = sc.nextLine();
            System.out.println("El sexo es : " + s);
            System.out.println("__________________________________");
            System.out.println("Ingrese la direccion: ");
            String d = sc.nextLine();
            System.out.println("La direccion es : " + d);
            System.out.println("__________________________________");
            System.out.println("Ingrese el telefono: ");
            String t = sc.nextLine();
            System.out.println("El telefono es : " + t);
            System.out.println("__________________________________");
            System.out.println("Ingrese la fecha de nacimiento: ");
            String fn = sc.nextLine();
            System.out.println("La fecha de nacimiento es : " + fn);
            System.out.println("__________________________________");

            FuncionarioDomain funcionario = new FuncionarioDomain();
            funcionario.setTipo_id(tid);
            funcionario.setNumerodocumento(nd);
            funcionario.setNombres(n);
            funcionario.setApellidos(a);
            funcionario.setEstado_civil(ec);
            funcionario.setSexo(s);
            funcionario.setDireccion(d);
            funcionario.setDireccion(d);
            funcionario.setTelefono(t);
            funcionario.setFecha_nacimiento(fn);
            funcionarioController.crear(funcionario);
            System.out.println("Funcionario creado correctamente");
        } catch (SQLException var12) {
            SQLException ex = var12;
            ex.printStackTrace();
            System.out.println("Error al crear el funcionario");
        }
    }
}


