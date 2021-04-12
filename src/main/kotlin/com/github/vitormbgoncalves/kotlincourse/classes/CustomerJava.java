package com.github.vitormbgoncalves.kotlincourse.classes;

import org.jetbrains.annotations.NotNull;

import java.util.Objects;

/**
 *<p>
 *  Java Class Sample
 *</p>
 *<p>
 * @author Vitor Goncalves
 * @since 05.04.2021, seg, 18:09
 *</p>
 */

public class CustomerJava {
    private int id;
    private String name;
    private String email;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void prettyPrint() {
        System.out.printf("Id: %d - Name: %s", id, name);
    }

    public @NotNull
    String neverNull() {
        return "A String";
    }

    public String sometimesNull() {
        return "A String";
    }

    @Override
    public String toString() {
        return "CustomerJava{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomerJava that = (CustomerJava) o;
        return id == that.id && Objects.equals(name, that.name) && Objects.equals(email, that.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, email);
    }
}
