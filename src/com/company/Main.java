package com.company;

/*
* 1.

* */

import com.company.classesOne.Circle;
import com.company.classesOne.Rectangle;
import com.company.classesOne.Triangle;
import com.company.interfaces.Figure;
import com.company.interfaces.Staff;
import com.company.slassesTwo.Accountant;
import com.company.slassesTwo.Employee;
import com.company.slassesTwo.Principal;

public class Main {

    public static void main(String[] args) {

        double summ = 0.0;

        Figure[] figures = {new Triangle(15,3),
                            new Rectangle(10,5),
                            new Circle(5),
                            new Triangle(10,5),
                            new Rectangle(3,9)};            // а можно так?
      /*  for (int i = 0; i < 5; i++){
           switch (i){
               case 0: figures[i] = new Triangle(15,3);
               break;
               case 1: figures[i] = new Rectangle(10,5);
               break;
               case 2: figures[i] = new Circle(5);
               break;
               case 3: figures[i] = new Triangle(10,5);
               break;
               case 4: figures[i] = new Rectangle(3,9);
               break;
           }
        }*/

        System.out.println("*** Task 1 ***\n");

        for (Figure figure: figures){
            figure.print();
        }
        System.out.println("*********");
        for (Figure figure: figures){
            summ+=figure.square();
        }
        System.out.println("Сумма площади всех фигур равна: " + summ);

        System.out.println("\n *** Task 2 ***\n");

        Staff[] staff = {new Principal(),new Accountant(), new Employee()};

        for (Staff st: staff){
            st.printPosition();
        }

    }
}
