package org.gislers.employee.dao.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
@Entity
@Table(name="employees", schema="employee")
public class EmployeeEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="emp_no", nullable=false, unique=true)
    private Integer employeeId;

    @Column(name="birth_date", nullable=false)
    private Date birthDate;

    @Column(name="first_name", length=14, nullable=false)
    private String firstName;

    @Column(name="last_name", length=16, nullable=false)
    private String lastName;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Column(name="hire_date", nullable=false)
    private Date hireDate;

    public EmployeeEntity() {
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
        this.employeeId = employeeId;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
