package colecciones;

import ZoologicoTest.Vaca;

import java.util.ArrayList;

public class PruebaLista {

    public static void main(String[] args) {
        
        ArrayList <Vaca> lista = new ArrayList<>(); //Si se añade despues de ArrayList los simbolo <> y busca algo generico
        //debemos añadirlo dentro de los simbolos
        //eso permite buscar el tipo de objeto dentro de la lista
        //por lo tanto ya no podemos añadir otros rangos de busqueda

        //lista.add("Azul");
        //lista.add(1);
        System.out.println(lista.add(new Vaca("Vaca1", 0, 0)));
        lista.add(new Vaca("Vaca1", 0, 0));
        lista.add(new Vaca("Vaca2", 0, 0));//las listas tienen posiciones
        // y empiezan en 0
        

        System.out.println(lista.size());

        Vaca v3 = new Vaca("Vaca3", 0, 0);

        lista.add(1, new Vaca("Vaca4", 0, 0));

        lista.add(0,v3);


        //El dato antes de "new Vaca" establece la ubicacion del objeto en la lista
        lista.get(0).mugir();;
        for (Vaca vaca : lista) {
            vaca.mugir();
        }

        System.out.println("Existe : "+lista.contains(v3));

        System.out.println("Existe : "+ lista.contains(new Vaca("Vaca4", 0, 0)));
        

        // for (Object object : lista) {

        //     if(object instanceof Vaca){
        //         //((Vaca)object).mugir();

        //         Vaca v = (Vaca)object;
        //         v.mugir();
        //     }
        //     System.out.println(object);
        // }
    }



}
