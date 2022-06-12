import java.time.LocalDateTime;  // Import the LocalDateTime class
import java.time.format.DateTimeFormatter;  // Import the DateTimeFormatter class

public class Employee extends Person {

    public LocalDateTime dateIncorporation = LocalDateTime.now();
    public DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("yyyy");    
    public String yearIncorporation = dateIncorporation.format(myFormatObj); 

    public int officeNumber;

    public Employee(String _name, String _lastName, int _idNumber, String _status, int _officeNumber ) {
      super(_name, _lastName, _idNumber, _status);
      this.officeNumber = _officeNumber;
    }


}