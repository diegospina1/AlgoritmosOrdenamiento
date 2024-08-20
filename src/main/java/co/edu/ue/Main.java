package co.edu.ue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import co.edu.ue.services.Ordenamiento;

//Presentado por: Danna García y Diego Ospina.
//Programa: Ingeniería de software. 14A
//Estructura de datos, Algoritmos de ordenamiento

public class Main {

    public static void main(String[] args) {
        Ordenamiento ordenamiento = new Ordenamiento();

        Integer[] first = new Integer[]{40, 21, 4, 9, 10, 35};
        List<Integer> firstList =  Arrays.asList(first);
        Integer[] second = new Integer[]{47, 1, 5, 3, 7, 13, 25, 60, 0};
        List<Integer> secondList = Arrays.asList(second);
        Integer[] third = new Integer[]{5, 2, 7, 3, 1, 8, 2, 6, 9};
        List<Integer> thirdList = Arrays.asList(third);
        Integer[] fourth = new Integer[]{3, 5, 33, 1, 8, 1, 24, 23, 8};
        List<Integer> fourthList = Arrays.asList(fourth);

        //Punto 1 (Array 1: {40, 21, 4, 9, 10, 35})
//        System.out.println("\nPRIMERA LISTA");
//        System.out.println("SELECCIÓN ----\n");

     //   ordenamiento.algoritmoSeleccion(firstList, false);
//        System.out.println();
//        ordenamiento.algoritmoSeleccion(firstList, true);

//        System.out.println("\nBURBUJA ----\n");
//
//        ordenamiento.algoritmoBurbuja(firstList, false);
//        System.out.println();
//        ordenamiento.algoritmoBurbuja(firstList, true);
//
        System.out.println("\nINSERCIÓN DIRECTA ----\n");

        ordenamiento.algoritmoInsercionDirecta(firstList, false);
        System.out.println();
        ordenamiento.algoritmoInsercionDirecta(firstList, true);

//        System.out.println("\nSHELL ----\n");
//
//        ordenamiento.algoritmoShell(firstList, false);
//        System.out.println();
//        ordenamiento.algoritmoShell(firstList, true);
//
//        System.out.println("\nQUICKSORT ----\n");
//
//        ordenamiento.algoritmoQuickSort(firstList, false);
//        System.out.println();
//        ordenamiento.algoritmoQuickSort(firstList, true);
//
//        //Punto 2 (Array 2: {47, 1, 5, 3, 7, 13, 25, 60, 0})
//        System.out.println("\nSEGUNDA LISTA");
//        System.out.println("SELECCIÓN ----\n");
//
//        ordenamiento.algoritmoSeleccion(secondList, false);
//        System.out.println();
//        ordenamiento.algoritmoSeleccion(secondList, true);
//
//        System.out.println("\nBURBUJA ----\n");
//
//        ordenamiento.algoritmoBurbuja(secondList, false);
//        System.out.println();
//        ordenamiento.algoritmoBurbuja(secondList, true);
//
//        System.out.println("\nINSERCIÓN DIRECTA ----\n");
//
//        ordenamiento.algoritmoInsercionDirecta(secondList, false);
//        System.out.println();
//        ordenamiento.algoritmoInsercionDirecta(secondList, true);
//
//        System.out.println("\nSHELL ----\n");
//
//        ordenamiento.algoritmoShell(secondList, false);
//        System.out.println();
//        ordenamiento.algoritmoShell(secondList, true);
//
//        System.out.println("\nQUICKSORT ----\n");
//
//        ordenamiento.algoritmoQuickSort(secondList, false);
//        System.out.println();
//        ordenamiento.algoritmoQuickSort(secondList, true);
//
//        //Punto 3 (Array 3: {5, 2, 7, 3, 1, 8, 2, 6, 9})
//        System.out.println("\nTERCERA LISTA");
//        System.out.println("SELECCIÓN ----\n");
//
//        ordenamiento.algoritmoSeleccion(thirdList, false);
//        System.out.println();
//        ordenamiento.algoritmoSeleccion(thirdList, true);
//
//        System.out.println("\nBURBUJA ----\n");
//
//        ordenamiento.algoritmoBurbuja(thirdList, false);
//        System.out.println();
//        ordenamiento.algoritmoBurbuja(thirdList, true);
//
//        System.out.println("\nINSERCIÓN DIRECTA ----\n");
//
//        ordenamiento.algoritmoInsercionDirecta(thirdList, false);
//        System.out.println();
//        ordenamiento.algoritmoInsercionDirecta(thirdList, true);
//
//        System.out.println("\nSHELL ----\n");
//
//        ordenamiento.algoritmoShell(thirdList, false);
//        System.out.println();
//        ordenamiento.algoritmoShell(thirdList, true);
//
//        System.out.println("\nQUICKSORT ----\n");
//
//        ordenamiento.algoritmoQuickSort(thirdList, false);
//        System.out.println();
//        ordenamiento.algoritmoQuickSort(thirdList, true);
//
//        //Punto 4 (Array 4: {3, 5, 33, 1, 8, 1, 24, 23, 8})
//        System.out.println("\nCUARTA LISTA");
//        System.out.println("SELECCIÓN ----\n");
//
//        ordenamiento.algoritmoSeleccion(fourthList, false);
//        System.out.println();
//        ordenamiento.algoritmoSeleccion(fourthList, true);
//
//        System.out.println("\nBURBUJA ----\n");
//
//        ordenamiento.algoritmoBurbuja(fourthList, false);
//        System.out.println();
//        ordenamiento.algoritmoBurbuja(fourthList, true);
//
//        System.out.println("\nINSERCIÓN DIRECTA ----\n");
//
//        ordenamiento.algoritmoInsercionDirecta(fourthList, false);
//        System.out.println();
//        ordenamiento.algoritmoInsercionDirecta(fourthList, true);
//
//        System.out.println("\nSHELL ----\n");
//
//        ordenamiento.algoritmoShell(fourthList, false);
//        System.out.println();
//        ordenamiento.algoritmoShell(fourthList, true);
//
//        System.out.println("\nQUICKSORT ----\n");
//
//        ordenamiento.algoritmoQuickSort(fourthList, false);
//        System.out.println();
//        ordenamiento.algoritmoQuickSort(fourthList, true);


    }
}