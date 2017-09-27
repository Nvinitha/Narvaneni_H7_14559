import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {

	public static void main(String[] args) {
		
		DateFormat df = new SimpleDateFormat("yyyy-MM-dd");

		Student students[] = new Student[5];
		Date birthDate;
		
		try {
			birthDate = df.parse("1995-07-04");
	        students[0] = new Student(1, "Rajesh", birthDate, 45);
	        birthDate = df.parse("1995-05-04");
	        students[1] = new Student(2, "Suresh", birthDate, 78);
	        birthDate = df.parse("1995-02-04");
	        students[2] = new Student(3, "Ramesh", birthDate, 83);
	        birthDate = df.parse("1995-03-04");
	        students[3] = new Student(4, "Kamlesh", birthDate, 77);
	        birthDate = df.parse("1995-09-04");
	        students[4] = new Student(5, "Vignesh", birthDate, 93);
    
		} catch (ParseException e) {
			e.printStackTrace();
		}
    
        for(int i = 0; i < students.length; i++)
        {
            System.out.println( students[i].getFullName() + " got " + students[i].getAvgMark() + " marks." );
        }
    }

}

