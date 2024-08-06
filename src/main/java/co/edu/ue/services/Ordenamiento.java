package co.edu.ue.services;

import java.util.ArrayList;
import java.util.List;

public class Ordenamiento {

    public List<Integer> firstList = new ArrayList<>();

    public List<Integer> secondList = new ArrayList<>();

    public List<Integer> thirdList = new ArrayList<>();

    public List<Integer> fourthList = new ArrayList<>();

    public void addFirstElements() {
        firstList.add(40);
        firstList.add(21);
        firstList.add(4);
        firstList.add(9);
        firstList.add(10);
        firstList.add(35);
    }
    public void addSecondElements() {
        secondList.add(47);
        secondList.add(1);
        secondList.add(5);
        secondList.add(3);
        secondList.add(7);
        secondList.add(13);
        secondList.add(25);
        secondList.add(60);
        secondList.add(0);
    }
    public void addThirdElements() {
        thirdList.add(5);
        thirdList.add(2);
        thirdList.add(7);
        thirdList.add(3);
        thirdList.add(1);
        thirdList.add(8);
        thirdList.add(2);
        thirdList.add(6);
        thirdList.add(9);
    }
    public void addFourthElements() {
        fourthList.add(3);
        fourthList.add(5);
        fourthList.add(33);
        fourthList.add(1);
        fourthList.add(8);
        fourthList.add(1);
        fourthList.add(24);
        fourthList.add(23);
        fourthList.add(8);
    }

    public List<Integer> algoritmoSeleccion(List<Integer> listaDesordenada) {
        System.out.println("Lista inicial: " + listaDesordenada);
        System.out.println("--------------------------------------");

        int aux;
        int menor;


        for(int i = 0; i < listaDesordenada.size(); i++){
            menor = i;
            for(int j = i + 1 ; j < listaDesordenada.size(); j++){
                if(listaDesordenada.get(j) < listaDesordenada.get(menor)){
                    menor = j;
                }
            }
            aux = listaDesordenada.get(i);
            listaDesordenada.set(i, listaDesordenada.get(menor));
            listaDesordenada.set(menor, aux);

            System.out.println("Ordenación #" + (i+1) + ": "+ listaDesordenada);

        }
        System.out.println("--------------------------------------");
        System.out.println("Lista final: " + listaDesordenada);

        return listaDesordenada;
    }

}
