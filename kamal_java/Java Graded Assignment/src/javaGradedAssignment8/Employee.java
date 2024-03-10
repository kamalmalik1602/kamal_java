package javaGradedAssignment8;
import java.io.Serializable;

public class Employee implements Serializable{
	private static final long serialVersionUID=1L;
	public String employeeId;
	public String employeeName;
	public String employeePhone;
	public String employeeEmailAddress;
	public int employeeSalary;
	
    public Employee(String employeeId, String employeeName, String employeePhone, String employeeEmailAddress,
			int employeeSalary) {
		super();
		 this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeePhone = employeePhone;
		this.employeeEmailAddress = employeeEmailAddress;
		this.employeeSalary = employeeSalary;
	}

	
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeePhone="
				+ employeePhone + ", employeeEmailAddress=" + employeeEmailAddress + ", employeeSalary="
				+ employeeSalary + "]";
	}
	
}
