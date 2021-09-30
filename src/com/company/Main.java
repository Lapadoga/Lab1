package com.company;

import CustomList.List;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args){
        Integer x = -1;
        List<Integer> obj = new List<Integer>();
        Scanner sc = new Scanner(System.in);
        while (x != 0) {
            System.out.println("1. Добавить элемент в начало\n2. Добавить элемент в конец\n3. Добавить элемент в веденную позицию\n4. Извлечь элемент из начала\n5. Извлечь элемент из конца\n6. Извлечь элемент из выбранной позиции\n7. Удалить элемент из начала\n8. Удалить элемент из конца\n9. Удалить элемент из выбранной позиции\n0. Выход");
           try {
               x = sc.nextInt();
           }
           catch (Exception ex)
           {
               System.out.println("Вводимое значение должно быть целочисленного типа");
               sc = new Scanner(System.in);
           }
           if (x > 9 || x < 0)
               System.out.println("Введите номер действия из списка");
            switch (x) {
                case 1: {
                    System.out.println("Введите добавляемый элемент");
                    Integer el = null;
                    try {
                        el = sc.nextInt();
                    }
                    catch (Exception ex)
                    {
                        System.out.println("Вводимое значение должно быть целочисленного типа");
                        sc = new Scanner(System.in);
                        break;
                    }
                    try {
                        obj.addToHead(el);
                    }
                    catch (Exception ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                    String s = obj.toString();
                    System.out.println("Список: ");
                    System.out.println(s);
                    break;
                }
                case 2: {
                    System.out.println("Введите добавляемый элемент");
                    Integer el = null;
                    try {
                        el = sc.nextInt();
                    }
                    catch (Exception ex)
                    {
                        System.out.println("Вводимое значение должно быть целочисленного типа");
                        sc = new Scanner(System.in);
                        break;
                    }
                    obj.addToTail(el);
                    String s = obj.toString();
                    System.out.println("Список: ");
                    System.out.println(s);
                    break;
                }
                case 3:
                {
                    System.out.println("Введите добавляемый элемент и позицию");
                    Integer el = null;
                    Integer pos = null;
                    try {
                        el = sc.nextInt();
                        pos = sc.nextInt();
                    }
                    catch (Exception ex)
                    {
                        System.out.println("Вводимое значение должно быть целочисленного типа");
                        sc = new Scanner(System.in);
                        break;
                    }
                    try
                    {
                        obj.addTo(el, pos);
                    }
                    catch (Exception ex)
                    {
                        System.out.println(ex.getMessage());
                    }
                    String s = obj.toString();
                    System.out.println("Список: ");
                    System.out.println(s);
                    break;
                }
                case 4:
                {
                    try
                    {
                        Integer el = obj.popFromHead();
                        System.out.print("Извлеченный элемент: ");
                        System.out.println(el);
                        String s = obj.toString();
                        System.out.println("Список: ");
                        System.out.println(s);
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 5:
                {
                    try
                    {
                        Integer el = obj.popFromTail();
                        System.out.print("Извлеченный элемент: ");
                        System.out.println(el);
                        String s = obj.toString();
                        System.out.println("Список: ");
                        System.out.println(s);
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 6: {
                    System.out.println("Введите позицию");
                    Integer pos = null;
                    try {
                        pos = sc.nextInt();
                    }
                    catch (Exception ex)
                    {
                        System.out.println("Вводимое значение должно быть целочисленного типа");
                        sc = new Scanner(System.in);
                        break;
                    }
                    try
                    {
                        Integer el = obj.popFrom(pos);
                        System.out.print("Извлеченный элемент: ");
                        System.out.println(el);
                        String s = obj.toString();
                        System.out.println("Список: ");
                        System.out.println(s);
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 7:
                {
                    try
                    {
                        obj.deleteFromHead();
                        String s = obj.toString();
                        System.out.println("Список: ");
                        System.out.println(s);
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 8:
                {
                    try
                    {
                        obj.deleteFromTail();
                        String s = obj.toString();
                        System.out.println("Список: ");
                        System.out.println(s);
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 9:
                {
                    System.out.println("Введите позицию");
                    Integer pos = null;
                    try {
                        pos = sc.nextInt();
                    }
                    catch (Exception ex)
                    {
                        System.out.println("Вводимое значение должно быть целочисленного типа");
                        sc = new Scanner(System.in);
                        break;
                    }
                    try
                    {
                        obj.deleteFrom(pos);
                        String s = obj.toString();
                        System.out.println("Список: ");
                        System.out.println(s);
                    } catch (Exception ex) {
                        System.out.println(ex.getMessage());
                    }
                    break;
                }
                case 0:
                    break;
            }
        }
    }
}
