package Package;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char salir = 'S';
        String nameSatel;

        do {
            Scanner read = new Scanner(System.in);
            System.out.println("Seleccione el tipo de neve de la cual desea recibir información \n" +
                    "1. Naves espaciales tripuladas \n" +
                    "2. Naves espaciales NO tripuladas \n");
            int shipType = read.nextInt();

            switch (shipType) {
                case 1:
                    System.out.println("NAVES ESPACIALES TRIPULADAS \n" +
                            "1. Apolo 11 \n" +
                            "2. Vostok \n" +
                            "3. Orbitador");
                    int manned = read.nextInt();
                    switch (manned){
                        case 1:
                            mannedSnows Apolo;
                            Apolo = new mannedSnows("Apolo", "F1", "Conocer la superficie de la luna", 3 );
                            Apolo.target();
                            System.out.println("Las misiones que podría esta nave tener pueden ser: ");
                            Apolo.porposeShipp();
                            System.out.println(Apolo.getName());

                            break;
                        case 2:
                            mannedSnows Vostok;
                            Vostok = new mannedSnows("Vostok", "RD-107-8D74-1959", "Llevar al ser humano al espacio", 1 );
                            Vostok.target();
                            System.out.println("Las misiones que podría esta nave tener pueden ser: ");
                            Vostok.porposeShipp();
                            break;
                        case 3:
                            mannedSnows Challenger ;
                            Challenger  = new mannedSnows("Challenger", "Orbitador", "Disponer de un vehículo reutilizable que permitiera reducir los costes del acceso al espacio", 3 );
                            Challenger.target();
                            System.out.println("Las misiones que podría esta nave tener pueden ser: ");
                            Challenger.porposeShipp();
                            break;
                        default: System.out.println("La opción ingresada no se encuentra en este menú");
                            break;
                    }
                    break;

                case 2:
                    System.out.println("NAVES ESPACIALES NO TRIPULADAS \n" +
                            "1. Pionero X \n" +
                            "2. Mariner IV");
                    int unmanned = read.nextInt();
                    switch (unmanned){
                        case 1:
                            System.out.println("Ingrese el planeta del cual desea conocer su numero de satelites");
                            nameSatel = read.next();
                            UnmannedShips Pionero;
                            Pionero = new UnmannedShips("Pionero X", "Sensores solares", "Exploración espacial");
                            Pionero.target();
                            Pionero.setInformationSatellites(nameSatel);
                            Pionero.getInformation();
                            break;
                        case 2:
                            System.out.println("Ingrese el planeta del cual desea conocer su numero de satelites");
                            nameSatel = read.next();
                            UnmannedShips Mariner;
                            Mariner = new UnmannedShips("Mariner IV", "Paneles solares", "Conducir observaciones científicas muy de cerca del planeta Marte y transmitir éstas observaciones a la Tierra");
                            Mariner.target();
                            Mariner.setInformationSatellites(nameSatel);
                            Mariner.getInformation();
                            break;
                    }
                    break;
                default:
                    System.out.println("La opción ingresada no se encuentra en este menú");
                    break;
            }

            System.out.println("¿Desea continuar en el programa? Si/No");
            salir = read.next().charAt(0);
        }while (salir != 'N');

    }
}

