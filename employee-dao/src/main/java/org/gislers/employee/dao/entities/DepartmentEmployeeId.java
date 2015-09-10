package org.gislers.employee.dao.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
public class DepartmentEmployeeId {

    private String employeeId;
    private String departmentId;

    public DepartmentEmployeeId() {
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (!(o instanceof DepartmentEmployeeId)) return false;

        DepartmentEmployeeId that = (DepartmentEmployeeId) o;

        return new EqualsBuilder()
                .append(employeeId, that.employeeId)
                .append(departmentId, that.departmentId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(employeeId)
                .append(departmentId)
                .toHashCode();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("DepartmentEmployeeId{");
        sb.append("employeeId='").append(employeeId).append('\'');
        sb.append(", departmentId='").append(departmentId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
