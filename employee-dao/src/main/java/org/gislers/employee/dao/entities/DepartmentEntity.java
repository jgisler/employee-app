package org.gislers.employee.dao.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
@Entity
@Table(name="departments", schema="employees")
public class DepartmentEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="dept_no", length=4, nullable=false, unique=true)
    private String departmentId;

    @Column(name="dept_name", length=40, nullable=false, unique=true)
    private String departmentName;

    public DepartmentEntity() {
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getDepartmentName() {
        return departmentName;
    }

    public void setDepartmentName(String departmentName) {
        this.departmentName = departmentName;
    }
}
