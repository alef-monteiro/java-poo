package model;

import java.util.Date;

public class Person {
    private String name;
    private int age;
    private Date birthday; // O Date é um tipo referenciado. Importar do pacote util. São classes e métodos desprendidos dos conceitos de aplicação.

    //Inicializar construtor
        // Com parâmetros, ou seja, quando eu quiser que meus parâmetros sejam como eu quiser
    public Person(String name, int age, Date dateOfBirth){
        this.name = name;
        this.age = age;
        this.birthday = dateOfBirth;
    }
        //Sem parâmetros, ou seja, quero que fique com os dados padronizados.
    public Person(){
        this.name = "Nome padrão";
        this.age = 19;
        this.birthday = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

}
