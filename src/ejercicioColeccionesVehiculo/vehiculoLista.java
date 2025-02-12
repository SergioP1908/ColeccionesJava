package ejercicioColeccionesVehiculo;

import java.util.ArrayList;
import java.util.Arrays;

import vehiculos.Coche;

import vehiculos.Camion;

import vehiculos.Motocicleta;

import vehiculos.Vehiculo;
import vehiculos.VehiculoMotorizado;
public class vehiculoLista {

    public static void main(String[] args) {

        ArrayList <VehiculoMotorizado> lista = new ArrayList<>();

        //List<Vehiculo> vehiculos = new ArrayList
        //Esta es la manera mas comun de encontrar una lista

        lista.add(new Coche("Toyota", "2024", 0, 0, null, 0, false));

        lista.add(new Camion("Volvo", "FMX", 0, 0, null, 0, 0));

        lista.add(new Motocicleta("Yamaha", "MT-07", 0, 0, null, false, 0));

        

        System.out.println(lista.size());

        Coche coche1 = new Coche("Toyota", "2024", 0, 0, null, 0, false);

        Camion camion1 = new Camion("Volvo", "FMX", 0, 0, null, 0, 0);

        Motocicleta motocicleta1 = new Motocicleta("Yamaha", "MT-07", 0, 0, null, false, 0);

        //lista.add(coche1); de esta manera tambien se pueden añadir
        //los vehiculos a la lista

        //vehiculos = Arrays.asList(coche1,camion1,motocicleta1)
        //esta es otra manera de añadir datos a una lista

        //vehiculos.addAll(Arrays.asList(coche1,camion1,motocicleta1));

        //de esta manera se puede unir una segunda lista a la primera lista creada

        for(int i=0;i<lista.size();i++){
            System.out.println(lista.get(i)); 

            VehiculoMotorizado vm = lista.get(i);

            vm.encender();
        }

        
        
    }






}
