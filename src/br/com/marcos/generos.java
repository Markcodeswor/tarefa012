package br.com.marcos;

import java.util.ArrayList;

public class generos {


    public static class tarefa012 {
        public static void main(String[] args) {

            ArrayList<String> genero2 = new ArrayList<String>();
            ArrayList<String> genero = new ArrayList<String>();

            System.out.println(" *** Grupo Masculino *** \n ");

            genero.add("Mário - M");
            genero.add("Carlos - M");
            genero.add("José - M");
            genero.add("Eduardo - M \n" );

            System.out.println(genero.toString () );


            genero2.add("Joice - F");
            genero2.add("Maria - F");
            genero2.add("Fernanda - F");
            genero2.add("Eduarda - F" );




            System.out.println(" *** Grupo Feminino *** \n ");
            System.out.println(genero2.toString () );


        }


    }




}
