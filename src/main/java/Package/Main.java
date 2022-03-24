package Package;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char salir = 'S';
        String nameSatel;

        do {
            Scanner read = new Scanner(System.in);
            shuttle();
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
                            System.out.println();
                            System.out.println("---------------Caracteristicas-------------");
                            System.out.println();
                            System.out.println("El nombre de la nave es "+Apolo.getName()+" tiene un motor "+Apolo.getMotor());
                            System.out.println("su misión fue "+Apolo.getMission()+"\n"+
                                    "con una tripulación de "+Apolo.getPassengers()+" personas");
                            break;
                        case 2:
                            mannedSnows Vostok;
                            Vostok = new mannedSnows("Vostok", "RD-107-8D74-1959", "Llevar al ser humano al espacio", 1 );
                            Vostok.target();
                            System.out.println("Las misiones que podría esta nave tener pueden ser: ");
                            Vostok.porposeShipp();
                            System.out.println();
                            System.out.println("---------------Caracteristicas-------------");
                            System.out.println("");
                            System.out.println("El nombre de la nave es "+Vostok.getName()+" tiene un motor "+Vostok.getMotor());
                            System.out.println("su misión fue "+Vostok.getMission()+"\n"+
                                    "con una tripulación de "+Vostok.getPassengers()+" personas");
                            break;
                        case 3:
                            mannedSnows Challenger ;
                            Challenger  = new mannedSnows("Challenger", "Orbitador", "Disponer de un vehículo reutilizable que permitiera reducir los costes del acceso al espacio", 3 );
                            Challenger.target();
                            System.out.println("Las misiones que podría esta nave tener pueden ser: ");
                            Challenger.porposeShipp();
                            System.out.println();
                            System.out.println("---------------Caracteristicas-------------");
                            System.out.println();
                            System.out.println("El nombre de la nave es "+Challenger.getName()+" tiene un motor "+Challenger.getMotor());
                            System.out.println("su misión fue "+Challenger.getMission()+"\n"+
                                    "con una tripulación de "+Challenger.getPassengers()+" personas");
                            break;
                        default:
                            System.out.println("La opción ingresada no se encuentra en este menú");
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
                            System.out.println();
                            System.out.println("---------------Caracteristicas-------------");
                            System.out.println();
                            System.out.println("El nombre de la nave es "+Pionero.getName()+" tiene un motor "+Pionero.getMotor());
                            System.out.println("su misión fue "+Pionero.getMission());

                            break;
                        case 2:
                            System.out.println("Ingrese el planeta del cual desea conocer su numero de satelites");
                            nameSatel = read.next();
                            UnmannedShips Mariner;
                            Mariner = new UnmannedShips("Mariner IV", "Paneles solares", "Conducir observaciones científicas muy de cerca del planeta Marte y transmitir éstas observaciones a la Tierra");
                            Mariner.target();
                            Mariner.setInformationSatellites(nameSatel);
                            Mariner.getInformation();
                            System.out.println();
                            System.out.println("---------------Caracteristicas-------------");
                            System.out.println();
                            System.out.println("El nombre de la nave es "+Mariner.getName()+" tiene un motor "+Mariner.getMotor());
                            System.out.println("su misión fue "+Mariner.getMission());
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



    public static void shuttle(){

        Scanner lanza = new Scanner(System.in);
        Rockets cohet = new Rockets("Saturno");

        System.out.println("Para todas las naves que se encuentran fuera de la tierra se necesito un cohete \n"+
                "o también conocido como vehiculo lanzadera, este vehiculo tiene las siguientes caracteristicas: ");
        System.out.println("");
        System.out.println("¿Desea tener una simulación de lanzamiento? Si/No");
        String lanzadera = lanza.next();
        System.out.println("");
        if(lanzadera == "Si"){
            cohet.setTakenOff(true);
            cohet.takeoff();
        }else {
            cohet.setTakenOff(false);
        }

        System.out.println("Su nombre es "+cohet.getName());
        System.out.println("El propusor es de "+cohet.getPropellant());
        System.out.println("Su peso es de "+cohet.getWeight()+"Tn");
        System.out.println("Su empuje es de "+cohet.getPush()+"kg");
        System.out.println("¿Autopropulsado?"+cohet.isSelfPropelled());
        System.out.println("Gasolina "+cohet.getFuel()+"Tn");
        System.out.println("Motor "+cohet.getMotor());
        System.out.println("El número de motores es de: "+cohet.getNumMotor());
        System.out.println("¿La nave esta en tierra? "+cohet.condition());
        System.out.println("Para que el cohete salga del planeta necesita una velocidad mayor a: "+cohet.exhaustSpeed());
        System.out.println("");
    }
}

