public class Staff extends Employee {

    public String section;

    public Staff(String _name, String _lastName, int _idNumber, String _status, int _officeNumber, String _section ) {
      super(_name, _lastName, _idNumber, _status, _officeNumber);
      this.section = _section;
    }

    public void setSection(String newSection) {
    this.section = newSection;
    
  }
    
}