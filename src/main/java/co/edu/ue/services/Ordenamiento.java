package co.edu.ue.services;

import java.util.ArrayList;
import java.util.List;

public class Ordenamiento {

    public int count = 0;

    public void imprimirCambios(List<Integer> list, Integer j, Integer target) {
        int finalJ = j;
        int finalTarget = target;

        System.out.print(" [");
        list.stream().forEach(c -> {
            if (c.equals(list.get(finalJ))) {
                if (c.equals(list.getFirst())) {
                    System.out.print(list.get(finalTarget));
                } else {
                    System.out.print(", " + list.get(finalTarget));
                }
            } else if (c.equals(list.get(finalTarget))) {
                System.out.print(", " + list.get(finalJ));
            } else {
                if (c.equals(list.getFirst())) {
                    System.out.print(c);
                } else {
                    System.out.print(", " + c);
                }
            }
        });
        System.out.print("]");

    }

    public List<Integer> algoritmoSeleccion(List<Integer> listaDesordenada, boolean descendant) {
        System.out.println("Algoritmo selección");
        System.out.println("Lista inicial: " + listaDesordenada);
        System.out.println("--------------------------------------");

        int aux;
        int target;
        int j;
        for (int i = 0; i < listaDesordenada.size(); i++) {
            target = i;
            for (j = i + 1; j < listaDesordenada.size(); j++) {
                //Condicion para saber si la lista se pide descendente o ascendente.
                System.out.print("\nSe compara el " + listaDesordenada.get(j) + " con " + listaDesordenada.get(target) + ", ");
                if (descendant) {
                    if (listaDesordenada.get(j) > listaDesordenada.get(target)) {
                        target = j;
                        System.out.print("nuevo valor mayor: " + listaDesordenada.get(target));
                    } else {
                        System.out.print("no hay cambios.");
                    }
                } else {
                    if (listaDesordenada.get(j) < listaDesordenada.get(target)) {
                        target = j;
                    }
                }
            }
            if(listaDesordenada.get(target) != listaDesordenada.get(i)){
                System.out.println("\n~ Valor a cambiar: " +  listaDesordenada.get(target) + " con " + listaDesordenada.get(i));
            }

            aux = listaDesordenada.get(i);
            listaDesordenada.set(i, listaDesordenada.get(target));
            listaDesordenada.set(target, aux);
            //Imprimimos las listas y su ordenamiento en cada pasada.
            if (i == listaDesordenada.size() - 1) {
                System.out.println("\n--------------------------------------");
                System.out.println("Lista ordenada " + (descendant ? "descendente: " : "ascendente: ") + listaDesordenada);
            }
        }
        //Un simple return por si queremos manejar la lista ordenada después.
        return listaDesordenada;
    }

    public List<Integer> algoritmoBurbuja(List<Integer> listaDesordenada, boolean descendant) {
        System.out.println("Algoritmo Burbuja");
        System.out.println("Lista inicial: " + listaDesordenada);
        System.out.println("--------------------------------------");
        int aux;
        for (int i = 0; i < listaDesordenada.size(); i++) {
            for (int j = 0; j < (listaDesordenada.size() - i); j++) {
                if ((j + 1) < listaDesordenada.size()) {
                    if (descendant) {
                        if (listaDesordenada.get(j + 1) > listaDesordenada.get(j)) {
                            aux = listaDesordenada.get(j + 1);
                            listaDesordenada.set(j + 1, listaDesordenada.get(j));
                            listaDesordenada.set(j, aux);
                            System.out.println("Pasada " + (i + 1) + ": " + listaDesordenada);
                        }
                    } else {
                        if (listaDesordenada.get(j + 1) < listaDesordenada.get(j)) {
                            aux = listaDesordenada.get(j + 1);
                            listaDesordenada.set(j + 1, listaDesordenada.get(j));
                            listaDesordenada.set(j, aux);
                            System.out.println("Pasada " + (i + 1) + ": " + listaDesordenada);
                        }
                    }
                }
            }
            if (i == listaDesordenada.size() - 1) {
                System.out.println("--------------------------------------");
                System.out.println("Lista ordenada " + (descendant ? "descendente: " : "ascendente: ") + listaDesordenada);
            }
        }
        return listaDesordenada;
    }

    public List<Integer> algoritmoInsercionDirecta(List<Integer> listaDesordenada, boolean descendant) {
        System.out.println("Algoritmo inserción directa");
        System.out.println("Lista inicial: " + listaDesordenada);
        System.out.println("--------------------------------------");
        int aux;
        int j;
        for (int i = 0; i < listaDesordenada.size(); i++) {
            aux = listaDesordenada.get(i);
            for (j = i - 1; j >= 0; j--) {
                if ((j + 1) < listaDesordenada.size()) {
                    if (descendant) {
                        if (aux < listaDesordenada.get(j)) {
                            listaDesordenada.set((j + 1), aux);
                            break;
                        } else {
                            listaDesordenada.set((j + 1), listaDesordenada.get(j));
                        }
                    } else {
                        if (aux > listaDesordenada.get(j)) {
                            listaDesordenada.set((j + 1), aux);
                            break;
                        } else {
                            listaDesordenada.set((j + 1), listaDesordenada.get(j));
                        }
                    }
                }
            }
            if (j == -1) {
                listaDesordenada.set(0, aux);
            }
            System.out.println("Ordenando el " + aux + ": " + listaDesordenada);
        }
        System.out.println("--------------------------------------");
        System.out.println("Lista ordenada " + (descendant ? "descendente: " : "ascendente: ") + listaDesordenada);

        return listaDesordenada;
    }

    public List<Integer> algoritmoShell(List<Integer> listaDesordenada, boolean descendant) {
        System.out.println("Algoritmo Shell");
        System.out.println("Lista inicial: " + listaDesordenada);
        System.out.println("------------------------------------------------");

        int salto = listaDesordenada.size();
        int aux;
        for (int i = 0; i < listaDesordenada.size(); i++) {
            if (salto > 1) salto /= 2;
            for (int j = 0; j < listaDesordenada.size(); j++) {
                aux = listaDesordenada.get(j);
                if ((j + salto) < listaDesordenada.size()) {
                    if (descendant) {
                        if (aux < listaDesordenada.get(j + salto)) {
                            listaDesordenada.set(j, listaDesordenada.get(j + salto));
                            listaDesordenada.set((j + salto), aux);
                            System.out.println("Ordenando con salto = " + salto + ": " + listaDesordenada + " ~ PASADA NUMERO: " + (i + 1));
                        }
                    } else {
                        if (aux > listaDesordenada.get(j + salto)) {
                            listaDesordenada.set(j, listaDesordenada.get(j + salto));
                            listaDesordenada.set((j + salto), aux);
                            System.out.println("Ordenando con salto = " + salto + ": " + listaDesordenada + " ~ PASADA NUMERO: " + (i + 1));
                        }
                    }
                }
            }
        }
        System.out.println("------------------------------------------------");
        System.out.println("Lista ordenada " + (descendant ? "descendente: " : "ascendente: ") + listaDesordenada);

        return listaDesordenada;
    }

    public List<Integer> aoQuickSort(List<Integer> listaDesordenada, int inicio, int fin, boolean descendant) {
        if (inicio >= fin) return listaDesordenada;
        int pivote = listaDesordenada.get(inicio);
        int left = inicio + 1;
        int rigth = fin;
        //Para validar si se solicitó descendente o ascendente
        if (descendant) {
            //Este if es para validar que se pidió la lista descendiente, si no, pasa al else
            while (left <= rigth) {
                while (left <= fin && listaDesordenada.get(left) > pivote) {
                    left++;
                }
                while (rigth > inicio && listaDesordenada.get(rigth) <= pivote) {
                    rigth--;
                }
                if (left < rigth) {
                    int temp = listaDesordenada.get(left);
                    listaDesordenada.set(left, listaDesordenada.get(rigth));
                    listaDesordenada.set(rigth, temp);
                } else {
                    count++;
                    System.out.println("Paso " + count + ": " + listaDesordenada);
                }
            }
        } else {
            //Este else es para imprimir la lista ordenada ascendentemente
            while (left <= rigth) {
                while (left <= fin && listaDesordenada.get(left) < pivote) {
                    left++;
                }
                while (rigth > inicio && listaDesordenada.get(rigth) >= pivote) {
                    rigth--;
                }
                if (left < rigth) {
                    int temp = listaDesordenada.get(left);
                    listaDesordenada.set(left, listaDesordenada.get(rigth));
                    listaDesordenada.set(rigth, temp);
                } else {
                    count++;
                    System.out.println("Paso " + count + ": " + listaDesordenada);
                }
            }
        }
        if (rigth > inicio) {
            int temp = listaDesordenada.get(inicio);
            listaDesordenada.set(inicio, listaDesordenada.get(rigth));
            listaDesordenada.set(rigth, temp);
            count++;
            System.out.println("Paso " + count + ": " + listaDesordenada);
        }
        //Una vez no se ejecute más el while, se volverá a ejecutrar al propio algoritmo hasta que esté ordenada la listas
        aoQuickSort(listaDesordenada, inicio, rigth - 1, descendant);
        aoQuickSort(listaDesordenada, rigth + 1, fin, descendant);

        return listaDesordenada;
    }

    public List<Integer> algoritmoQuickSort(List<Integer> listaDesordenada, boolean descendant) {
        System.out.println("Algoritmo QuickSort");
        System.out.println("Lista inicial: " + listaDesordenada);
        System.out.println("------------------------------------------------");
        //El tamaño de la lista menos 1. Para evitar errores de "out of bounds".
        int length = (listaDesordenada.size() - 1);
        //Reiniciamos contador de la clase, para que no se acumule con otras llamadas del algoritmo QuickSort
        count = 0;
        //Usar el algoritmo QuickSort para generar la lista ordenada. Solo es para mayor comodidad al leers
        List<Integer> listaOrdenada = aoQuickSort(listaDesordenada, 0, length, descendant);
        //Imprimir lista ordenada
        System.out.println("------------------------------------------------");
        System.out.println("Lista ordenada " + (descendant ? "descendente: " : "ascendente: ") + listaOrdenada);

        return listaOrdenada;
    }
}
