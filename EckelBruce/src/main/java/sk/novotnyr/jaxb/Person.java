/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sk.novotnyr.jaxb;

import java.util.Date;

/**
 *
 * @author bracek
 */
public class Person {

    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(final Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(final String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(final String lastName) {
        this.lastName = lastName;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(final float weight) {
        this.weight = weight;
    }
    private float weight;

    /* gettre a settre */
}
