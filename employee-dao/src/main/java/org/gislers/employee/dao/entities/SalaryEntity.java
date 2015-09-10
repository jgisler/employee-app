package org.gislers.employee.dao.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
@Entity
@Table(name="salaries", schema="employee")
public class SalaryEntity extends BaseEntity {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="emp_no", nullable=false, unique=true)
    private Integer employeeId;
    private Integer salary;

    @Column(name="from_date")
    private Date fromDate;

    @Column(name="to_date")
    private Date toDate;

}
