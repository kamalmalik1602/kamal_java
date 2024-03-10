package javaGradedAssignment8;
import java.io.*;
import java.util.*;
public class ProjectDeserializer {
     
	 @SuppressWarnings("unchecked")
	    public static HashMap<Project, ArrayList<Employee>> deserializeProjectDetails(String fileName) {
	        HashMap<Project, ArrayList<Employee>> projectMap = null;
	        try {
	            FileInputStream fileInputStream = new FileInputStream(fileName);
	            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
	            
	            projectMap = (HashMap<Project, ArrayList<Employee>>) objectInputStream.readObject();
	            
	            objectInputStream.close();
	            fileInputStream.close();
	            
	            System.out.println("Deserialized Data:");
	        } catch (IOException | ClassNotFoundException e) {
	            e.printStackTrace();
	        }
	        return projectMap;
	    }

	public static void main(String[] args) {
		  HashMap<Project, ArrayList<Employee>> deserializedProjectMap = deserializeProjectDetails("MapFiles.txt");
	        if (deserializedProjectMap != null) {
	            for (Map.Entry<Project, ArrayList<Employee>> entry : deserializedProjectMap.entrySet()) {
	                Project project = entry.getKey();
	                ArrayList<Employee> employees = entry.getValue();
	                System.out.println("Project: " + project);
	                System.out.println("Employees:.....");
	                for (Employee employee : employees) {
	                    System.out.println(employee);
	                }
	                System.out.println("----------------------");
	            }
	        }


	}

}
