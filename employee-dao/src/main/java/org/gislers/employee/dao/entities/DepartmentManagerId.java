package org.gislers.employee.dao.entities;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * Created by:   jgisle
 * Created date: 9/10/15
 */
public class DepartmentManagerId {

    private Integer employeeId;
    private String departmentId;

    public DepartmentManagerId() {
    }

    public Integer getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Integer employeeId) {
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

        if (!(o instanceof DepartmentManagerId)) return false;

        DepartmentManagerId that = (DepartmentManagerId) o;

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
        final StringBuilder sb = new StringBuilder("DepartmentManagerId{");
        sb.append("employeeId=").append(employeeId);
        sb.append(", departmentId='").append(departmentId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
