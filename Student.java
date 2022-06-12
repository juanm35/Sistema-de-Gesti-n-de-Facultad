public class Student extends Person {

    public String course;

    public Student (String _name, String _lastName, int _idNumber, String _status, String _course ) {
      super(_name, _lastName, _idNumber, _status);
      this.course = _course;
    }

    public void setCourse(String newCourse) {
    this.course = newCourse;
    }

}