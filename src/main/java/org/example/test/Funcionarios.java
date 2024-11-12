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
                    System.out.println("Tipo ID: " + funcionarioDomain.getTipoid());
                    System.out.println("Numero Documento: " + funcionarioDomain.getNumerodocumento());
                    System.out.println("Nombres: " + funcionarioDomain.getNombres());
                    System.out.println("Apellidos: " + funcionarioDomain.getApellidos());
                    System.out.println("Estado Civil: " + funcionarioDomain.getEstadocivil());
                    System.out.println("Sexo: " + funcionarioDomain.getSexo());
                    System.out.println("Direccion: " + funcionarioDomain.getDireccion());
                    System.out.println("Telefono: " + funcionarioDomain.getTelefono());
                    System.out.println("Fecha Nacimiento: " + funcionarioDomain.getFechanacimiento());
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

            FuncionarioDomain funcionario = new FuncionarioDomain();
            funcionario.setTipoid(tid);
            funcionario.setNumerodocumento(nd);
            funcionario.setNombres(n);
            funcionario.setApellidos(a);
            funcionario.setEstadocivil(ec);
            funcionario.setSexo(s);
            funcionario.setDireccion(d);
            funcionario.setDireccion(d);
            funcionario.setTelefono(t);
            funcionario.setFechanacimiento(fn);
            funcionarioController.crear(funcionario);
            System.out.println("Funcionario "+ n +" fue creado correctamente");
            System.out.println("__________________________________");
        } catch (SQLException var12) {
            SQLException ex = var12;
            ex.printStackTrace();
            System.out.println("Error al crear el funcionario");
            System.out.println("__________________________________");
        }
    }

    public static void obtenerFuncionariosPorId(FuncionarioController funcionarioController){
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ingrese el ID del funcionario: ");
            int id = sc.nextInt();
            FuncionarioDomain funcionario = funcionarioController.obtenerFuncionarioPorId(id);
            if (funcionario == null) {
                System.out.println("No se encontro el funcionario con el ID: " + id);
            } else {
                System.out.println("ID: " + funcionario.getId());
                System.out.println("Tipo ID: " + funcionario.getTipoid());
                System.out.println("Numero Documento: " + funcionario.getNumerodocumento());
                System.out.println("Nombres: " + funcionario.getNombres());
                System.out.println("Apellidos: " + funcionario.getApellidos());
                System.out.println("Estado Civil: " + funcionario.getEstadocivil());
                System.out.println("Sexo: " + funcionario.getSexo());
                System.out.println("Direccion: " + funcionario.getDireccion());
                System.out.println("Telefono: " + funcionario.getTelefono());
                System.out.println("Fecha Nacimiento: " + funcionario.getFechanacimiento());
                System.out.println("=====================================");
            }
        } catch (SQLException var2) {
            SQLException ex = var2;
            ex.printStackTrace();
            System.out.println("Error al obtener el funcionario");
        }
    }

    public static void actualizar (FuncionarioController funcionarioController) {
        try {
            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese el ID del funcionario: ");
            int id = sc.nextInt();
            FuncionarioDomain funcionario = funcionarioController.obtenerFuncionarioPorId(id);
            if (funcionario == null) {
                System.out.println("No se encontro el funcionario con el ID: " + id);
            } else {
                System.out.println("ID: " + funcionario.getId());
                System.out.println("Tipo ID: " + funcionario.getTipoid());
                System.out.println("Numero Documento: " + funcionario.getFechanacimiento());
                System.out.println("Nombres: " + funcionario.getNombres());
                System.out.println("Apellidos: " + funcionario.getApellidos());
                System.out.println("Estado Civil: " + funcionario.getEstadocivil());
                System.out.println("Sexo: " + funcionario.getSexo());
                System.out.println("Direccion: " + funcionario.getDireccion());
                System.out.println("Telefono: " + funcionario.getTelefono());
                System.out.println("Fecha Nacimiento: " + funcionario.getFechanacimiento());
                System.out.println("=====================================");
                System.out.println("Ingrese el tipo de ID: ");
                String tid = sc.next();
                System.out.println("Ingrese el numero de documento: ");
                String nd = sc.next();
                System.out.println("Ingrese los nombres: ");
                String n = sc.next();
                System.out.println("Ingrese los apellidos: ");
                String a = sc.next();
                System.out.println("Ingrese el estado civil: ");
                String ec = sc.next();
                System.out.println("Ingrese el sexo: ");
                String s = sc.next();
                System.out.println("Ingrese la direccion: ");
                String d = sc.next();
                System.out.println("Ingrese el telefono: ");
                String t = sc.next();
                System.out.println("Ingrese la fecha de nacimiento: ");
                String fn = sc.next();
                FuncionarioDomain funcionarioActualizado = new FuncionarioDomain();
                funcionarioActualizado.setId(id);
                funcionarioActualizado.setTipoid(tid);
                funcionarioActualizado.setNumerodocumento(nd);
                funcionarioActualizado.setNombres(n);
                funcionarioActualizado.setApellidos(a);
                funcionarioActualizado.setEstadocivil(ec);
                funcionarioActualizado.setSexo(s);
                funcionarioActualizado.setDireccion(d);
                funcionarioActualizado.setTelefono(t);
                funcionarioActualizado.setFechanacimiento(fn);
                funcionarioController.actualizar(id, funcionarioActualizado);
                System.out.println("Funcionario actualizado correctamente");
            }
        } catch (SQLException var14) {
            SQLException ex = var14;
            ex.printStackTrace();
            System.out.println("Error al actualizar el funcionario");
        }
    }

    public static void main(String[] args) {
        int option =-1;
        Scanner sc = new Scanner(System.in);
        FuncionarioController funcionarioController = new FuncionarioController();

        while (option != 0) {
            System.out.println("Seleccione una opción: ");
            System.out.println("1. Obtener funcionarios");
            System.out.println("2. Crear funcionario");
            System.out.println("3. Obtener funcionario por ID");
            System.out.println("4. Actualizar funcionario");
            System.out.println("0. Salir");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    obtenerFuncionarios(funcionarioController);
                    break;
                case 2:
                    crear(funcionarioController);
                    break;
                case 3:
                    obtenerFuncionariosPorId(funcionarioController);
                    break;
                case 4:
                    actualizar(funcionarioController);
                    break;
                case 0:
                    System.out.println("Saliendo...");
                    break;
                default:
                    System.out.println("Opción no válida");
                    break;
        }
    }

    }


}


