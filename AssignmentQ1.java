
public class AssignmentQ1 {

	public static void main(String[] args) {


		int [] student= new int [100];
		boolean [] status= new boolean [100]; 


		for (int i = 0; i < student.length; i++) {
			for (int j =i; j < status.length; j+= i+1) {
				status [j]= !status [j];								
				// now all lockers are open

			}

		}	

		for (int j = 0; j < status.length; j++) {
			if(status[j]) {													
				// starts at index 1 (student 2). Make locker = student (locker 2).
				// increment j (locker) by i + 1, because we are not incr index, but locker (index 0 is locker 1)
				System.out.println("locker "+ (j+1) + " is open" );

			} else 
				System.out.print("");

		}





	}

}
