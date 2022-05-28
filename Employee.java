package hibernatedemo.pojo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

//Hibernate demo with JPA Annotation

	/*
	 ->@Entity annotation is used make the class as Entity(table)
	 ->@table annotation is usedd assign the name to table where entity data is stored
	 
	  ->@ID annotation is used to make class attributes as primary key.
	  
	 
	 */

@Entity
@Table(name = "tbl_emp")
public class Employee {

	
	@Id
	@Column(name = "emp_id")
	private int empId;
	
	@Column(name="emp_name",length = 30)
	private String empName;
	
	private double empSalary;
	
	public Employee() {
		
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public double getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(double empSalary) {
		this.empSalary = empSalary;
	}
	
	
	
	
}
