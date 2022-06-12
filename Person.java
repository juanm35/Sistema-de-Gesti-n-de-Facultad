public class Person {
    public String name; 
    public String lastName;
    public int idNumber;
    public String status;

    public Person(String _name, String _lastName, int _idNumber, String _status){
      
        name = _name;
        lastName = _lastName;
        idNumber = _idNumber;
        status = _status;        

    }


    public void setStatus(String newStatus) {
    this.status = newStatus;
  }

}






