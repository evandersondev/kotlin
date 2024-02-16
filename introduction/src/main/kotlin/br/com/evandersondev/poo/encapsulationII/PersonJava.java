package br.com.evandersondev.poo.encapsulationII;

import java.time.LocalDate;

public class PersonJava {

    private String name;
    private String cpf;
    private LocalDate birthDate;
    private Integer age;
    private String email;

    public PersonJava(String name, String cpf, LocalDate birthDate){
        this.name = name;
        this.cpf = cpf;
        this.birthDate = birthDate;
        this.age = LocalDate.now().getYear() - birthDate.getYear();
    }

    public String getName() {
        return name;
    }

    public String getCpf() {
        return cpf;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public Integer getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}