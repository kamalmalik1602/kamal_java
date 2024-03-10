package javaGradedAssignment8;
import java.io.Serializable;

public class Project implements Serializable {
	private static final long serialVersionUID=1L;
	public String projectCode;
	public String projectName;
	public int projectStrength;
    
	public Project(String projectCode, String projectName, int projectStrength) {
		super();
		this.projectCode = projectCode;
		this.projectName = projectName;
		this.projectStrength = projectStrength;
	}
	
	@Override
	public String toString() {
		return "Project [projectCode=" + projectCode + ", projectName=" + projectName + ", projectStrength="
				+ projectStrength + "]";
	}
    
    
}


