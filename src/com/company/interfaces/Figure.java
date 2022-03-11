package com.company.interfaces;

/*
*  Написать иерархию классов «Фигуры».
    Фигура -> Треугольник -> Прямоугольник -> Круг.
    Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет
    периметра. Создать массив из 5 фигур.
    Вывести на экран сумму периметра всех фигур в массиве.
* */
public interface Figure {
    double square();           // можно ли тут прописать передаваемые параметры?

                                // Или в классах передавать в этот метод параметры, если они тут не указаны?
                                // Class 'Triangle' must either be declared abstract or implement abstract method 'square()' in 'Figure'

                                // public или private сигнатура метода?
                                // if private → Private methods in interfaces should have a body
    void print();
}
