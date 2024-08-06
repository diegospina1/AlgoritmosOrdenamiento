package co.edu.ue;

import java.util.ArrayList;
import java.util.List;
import co.edu.ue.services.Ordenamiento;

public class Main {

    public static void main(String[] args) {

        Ordenamiento ordenamiento = new Ordenamiento();

        ordenamiento.addFirstElements();
        ordenamiento.addSecondElements();
        ordenamiento.addThirdElements();
        ordenamiento.addFourthElements();

        List<Integer> firstList = ordenamiento.firstList;
        List<Integer> secondList = ordenamiento.secondList;
        List<Integer> thirdList = ordenamiento.thirdList;
        List<Integer> fourthList = ordenamiento.fourthList;

        ordenamiento.algoritmoSeleccion(firstList);



    }
}