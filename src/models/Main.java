package models;

import enums.ROOFTYPE;
import enums.TYPE;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Car carsBenz = new Car();
        carsBenz.setName("yome");
        carsBenz.setTypeOfCar(TYPE.BENZ);
        List<Convertible> numConv = new ArrayList<>();
        List<Car> numCar =new ArrayList<>();
//        System.out.println(carsBenz.getTypeOfCar());

        int n = 0;
        for (int i = 0; i < 10; i++) {
         Car   benz = new Car(n, "mercedes benz", TYPE.BENZ, 2022);
            n++;
//            System.out.println(benz);
        }
        Roof openRoof =new Roof(1, ROOFTYPE.OPEN);
                Convertible convertible=new Convertible(1,"honda convertible",TYPE.HONDA, 2022, openRoof,2);
                numCar.add(convertible);
                numConv.add(convertible);
//                numConv.add(carsBenz); // cannot add a parent to a child list/method.
        System.out.println(convertible);
        System.out.println(convertible.getName());


    }
}

