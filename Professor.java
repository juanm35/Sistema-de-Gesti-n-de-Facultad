public class Professor extends Employee {

    public String department; 

    public Professor(String _name, String _lastName, int _idNumber, String _status, int _officeNumber, String _department ) {
      super(_name, _lastName, _idNumber, _status, _officeNumber);
      this.department = _department;
    }

    public void setDepartment(String newDepartment) {
    this.department = newDepartment;
  }



    
}