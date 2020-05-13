package csci3444.inheritance;

public class MainEntry {

	public static void main(String[] args) {
		 Person p1, p2;
         Teacher t = new TeacherImpl("ilker", "java");
         Student s = new StudentImpl("Rob Stapleton", "java");
        
          p1 = (Person) t;
         p2 = s;
        
         System.out.println("Person 1: " + p1.getName());
         System.out.println("Person 2: " + p2.getName());
        
         System.out.println("Person 1: " + p1.getDetails());
         System.out.println("Person 2: " + p2.getDetails());
    
     }
	}

