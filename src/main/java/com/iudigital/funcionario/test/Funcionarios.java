package com.iudigital.funcionario.test;

import com.iudigital.funcionario.controller.FuncionarioController;
import com.iudigital.funcionario.domain.Funcionario;
import java.sql.SQLException;
import java.util.Scanner;


public class Funcionarios {

    public static void crear(FuncionarioController funcionarioController) {
        try {
            Scanner sc = new Scanner(System.in);

            System.out.println("Digite el tipo id");
            String tid = sc.nextLine();
            System.out.println("El Nombre es" + tid);
            System.out.println("--------------------");

            System.out.println("Digite el nombre");
            String nombre = sc.nextLine();
            System.out.println("el nombre es " + nombre);
            System.out.println("----------");

            System.out.println("Digite el apellido");
            String apellido = sc.nextLine();
            System.out.println("El apellido es " + apellido);
            System.out.println("--------------------");

            System.out.println("Digite el estado civil");
            String ec = sc.nextLine();
            System.out.println("el estado civil es " + ec);
            System.out.println("----------");

            System.out.println("Digite el sexo");
            String sexo = sc.nextLine();
            System.out.println("El sexo es" + sexo);
            System.out.println("--------------------");

            System.out.println("Digite el direccion");
            String direccion = sc.nextLine();
            System.out.println("La direccion es " + direccion);
            System.out.println("----------");

            System.out.println("Digite el telefono");
            String telefono = sc.nextLine();
            System.out.println("El telefono es " + telefono);
            System.out.println("--------------------");

            System.out.println("Digite el fecha de nacimiento");
            String fc = sc.nextLine();
            System.out.println("la fecha de nacimiento es " + fc);
            System.out.println("----------");

            Funcionario funcionario = new Funcionario();
            funcionario.setTipo_id(tid);
            funcionario.setNombres(nombre);
            funcionario.setApellidos(apellido);
            funcionario.setEstado_civil(ec);
            funcionario.setSexo(sexo);
            funcionario.setDireccion(direccion);
            funcionario.setTelefono(telefono);
            funcionario.setFecha_nacimiento(fc);
            funcionarioController.crear(funcionario);
            System.out.println("Se creo el F con exito");
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }

    public static void main(String[] args) {
        FuncionarioController funcionarioController = new FuncionarioController();
        crear (funcionarioController);
    }
}
