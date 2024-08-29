package app;

import Util.Util;
import model.Book;
import model.Person;
import model.PrimitiveTypes;
import model.Student;

public class Main {
    public static void main(String[] args) {
        System.out.printf("Hello and welcome! \n");
        //for (int i = 1; i <= 5; i++) {
            //for (double k = 1; k <= 10; k++,) {
                //System.out.println("i = " + i);
                //System.out.print("Faz o L " + k + k);

//            Person person = new Person();
//            person.setAge(30);
//            person.setDateOfBirth(Util.getFormattedDate("1999-12-12"));
//        //}
//            Person person2 = new Person ("Raimundinho", 33, Util.getFormattedDate(""));

//        Student studet = new Student("Ramudinho", "22GC", 800123958);
//        studet.enrollInCourse("Roubo de Carro e Moto");
//        studet.enrollInCourse("Estelionato");
//        studet.enrollInCourse("Agiotagem");
//        studet.verifyCourse();
//        studet.cancelInCourse("Roubo de Carro e Moto");

        Book newBook = new Book("Como Fazer Peneiras", "Mariele Franco", 2018, "Dia a Dia", 13, true);

        newBook.LendBook("Como Fazer Peneiras");
        newBook.LendBook("Como Fazer Peneiras");
        newBook.DevolverBook("Como Fazer Peneiras");
        newBook.DevolverBook("Como Fazer Peneiras");
        newBook.BookInformation("Como Fazer Peneiras");
        newBook.VerifyBook("Como Fazer Peneiras");
    }

}
