/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.gustavocx.mapexample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;
 
public class MapExample {

    /**
     * Diferencias principales:
     *
     * HashMap no mantiene un orden específico, 
     * TreeMap mantiene un orden ascendente basado en las claves y LinkedHashMap mantiene el orden de inserción. 
     * HashMap es más eficiente en cuanto a tiempo de ejecución en la mayoría de las operaciones, mientras que TreeMap es más lento pero mantiene los elementos ordenados.
     */
    
    public static void main(String[] args) {
        System.out.println("********* HashMap *********");
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "Gabelo");
        map.put(15, "Ramirez");
        map.put(3, "Roger Flores");
        map.put(5, "Marchena");
        map.put(11, "Chunche");
        map.put(14, "Guima");
        map.put(16, "Gonzales");
        map.put(8, "Jara");
        map.put(18, "Gomez");
        map.put(6, "Chavarria");
        map.put(7, "Cayasso");

        System.out.println("Imprimimos el Map con un Iterador");
        Iterator<Integer> it = map.keySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }

        System.out.println("\nImprimimos el Map con: for (Integer key : map.keySet()) {...}");
        for (Integer key : map.keySet()) {
            System.out.println("Clave: " + key + " -> Valor: " + map.get(key));
        }

        System.out.println("\n********* TreeMap *********");

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(1, "Gabelo");
        treeMap.put(15, "Ramirez");
        treeMap.put(3, "Roger Flores");
        treeMap.put(5, "Marchena");
        treeMap.put(11, "Chunche");
        treeMap.put(14, "Guima");
        treeMap.put(16, "Gonzales");
        treeMap.put(8, "Jara");
        treeMap.put(18, "Gomez");
        treeMap.put(6, "Chavarria");
        treeMap.put(7, "Cayasso");

        // Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente
        it = treeMap.keySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            System.out.println("Clave: " + key + " -> Valor: " + treeMap.get(key));
        }

        System.out.println("\n********* LinkedHashMap *********");
        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(1, "Gabelo");
        linkedHashMap.put(15, "Ramirez");
        linkedHashMap.put(3, "Roger Flores");
        linkedHashMap.put(5, "Marchena");
        linkedHashMap.put(11, "Chunche");
        linkedHashMap.put(14, "Guima");
        linkedHashMap.put(16, "Gonzales");
        linkedHashMap.put(8, "Jara");
        linkedHashMap.put(18, "Gomez");
        linkedHashMap.put(6, "Chavarria");
        linkedHashMap.put(7, "Cayasso");

        // Imprimimos el Map con un Iterador que ya hemos instanciado anteriormente 
        it = linkedHashMap.keySet().iterator();
        while (it.hasNext()) {
            Integer key = it.next();
            System.out.println("Clave: " + key + " -> Valor: " + linkedHashMap.get(key));
        }

        System.out.println("\n********* Trabajando con los métodos de Map *********");
        System.out.println("Mostramos el numero de elementos que tiene el TreeMap: treeMap.size() = " + treeMap.size());
        System.out.println("Vemos si el TreeMap esta vacio : treeMap.isEmpty() = " + treeMap.isEmpty());
        System.out.println("Obtenemos un elemento del Map pasandole la clave 6: treeMap.get(6) = " + treeMap.get(6));
        System.out.println("Borramos un elemento del Map el 18 (porque fue sustituido): treeMap.remove(18)" + treeMap.remove(18));
        System.out.println("Vemos que pasa si queremos obtener la clave 18 que ya no existe: treeMap.get(18) = " + treeMap.get(18));
        System.out.println("Vemos si existe un elemento con la clave 18: treeMap.containsKey(18) = " + treeMap.containsKey(18));
        System.out.println("Vemos si existe un elemento con la clave 1: treeMap.containsKey(1) = " + treeMap.containsKey(1));
        System.out.println("Vemos si existe el valo 'Cayasso' en el Map: treeMap.containsValue(\"Cayasso\") = " + treeMap.containsValue("Cayasso"));
        System.out.println("Vemos si existe el valo 'Ricardo' en el Map: treeMap.containsValue(\"Ricardo\") = " + treeMap.containsValue("Ricardo"));
        System.out.println("Borramos todos los elementos del Map: treeMap.clear()");
        treeMap.clear();
        System.out.println("Comprobamos si lo hemos eliminado viendo su tamaño: treeMap.size() = " + treeMap.size());
        System.out.println("Lo comprobamos tambien viendo si esta vacio treeMap.isEmpty() = " + treeMap.isEmpty());

        System.out.println("\n\n********* Foreach: Forma alternativa para recorrer los Map mostrando la Clave y el valor:*********");
        for (Entry<Integer, String> jugador : linkedHashMap.entrySet()) {
            Integer clave = jugador.getKey();
            String valor = jugador.getValue();
            System.out.println(clave + "  ->  " + valor);
        }

        System.out.println("\n\n********* TreeMap con Objetos y como Clave un String *********");
        Map<String, JugadorSeleccion> jugadores = new TreeMap<>();
        jugadores.put("Gabelo", new JugadorSeleccion(1, "Gabelo", "Portero"));
        jugadores.put("Ramirez", new JugadorSeleccion(15, "Ramirez", "Lateral Derecho"));
        jugadores.put("Roger Flores", new JugadorSeleccion(13, "Roger Flores", "Central"));
        jugadores.put("Marchena", new JugadorSeleccion(5, "Marchena", "Central"));
        jugadores.put("Chunche", new JugadorSeleccion(11, "Chunche", "Lateral Izquierdo"));
        jugadores.put("Guima", new JugadorSeleccion(14, "Guima", "Medio Centro"));
        jugadores.put("Gonzales", new JugadorSeleccion(16, "Gonzales", "Medio Centro"));
        jugadores.put("Jara", new JugadorSeleccion(8, "Jara", "Centro Campista"));
        jugadores.put("Gomez", new JugadorSeleccion(18, "Gomez", "Interior Izquierdo"));
        jugadores.put("Chavarria", new JugadorSeleccion(6, "Chavarria", "Interior Derecho"));
        jugadores.put("Cayasso", new JugadorSeleccion(7, "Cayasso", "Delantero"));

        for (Entry<String, JugadorSeleccion> jugador : jugadores.entrySet()) {
            String clave = jugador.getKey();
            JugadorSeleccion valor = jugador.getValue();
            System.out.println(clave + "  ->  " + valor.toString());
        }

        // Cuidado con comparar objetos que son iguales pero no son lo mismo 
        JugadorSeleccion Cayasso = new JugadorSeleccion(7, "Cayasso", "Delantero");
        System.out.println("\n\nEsta este objeto 'Cayasso' en el Map: jugadores.containsValue(Cayasso) = " + jugadores.containsValue(Cayasso));

    }

}

class JugadorSeleccion {

    private int dorsal;
    private String nombre;
    private String demarcacion;

    public JugadorSeleccion() {
    }

    public JugadorSeleccion(int dorsal, String nombre, String demarcación) {
        this.dorsal = dorsal;
        this.nombre = nombre;
        this.demarcacion = demarcación;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDemarcación() {
        return demarcacion;
    }

    public void setDemarcación(String demarcación) {
        this.demarcacion = demarcación;
    }

    @Override
    public String toString() {
        return this.dorsal + "  --  " + this.nombre + "  --  " + this.demarcacion;
    }

}
