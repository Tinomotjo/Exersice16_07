package Exersice16_1;

/*
   Write a method called deleteBack that deletes the last value
   (the value at the back of the list) and returns the deleted value.
   If the list is empty, throw a NoSuchElementException.
 */

public class Run16 {

public static void main(String[] args)
{
    LinkedIntList list1 = new LinkedIntList();
    list1.add(1);
    list1.add(1);
    list1.add(1);
    list1.add(3);
    list1.add(3);
    list1.add(6);
    list1.add(9);
    list1.add(15);
    list1.add(15);
    list1.add(23);
    list1.add(23);
    list1.add(23);
    list1.add(40);
    list1.add(40);


    System.out.println(list1.deleteBack());
}
}