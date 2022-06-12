import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {  

    // ArrayLists creados para el último punto/testeo de la consigna
    ArrayList<Professor> professorsList = new ArrayList<Professor>();
    ArrayList<Student> studentsList = new ArrayList<Student>();
    //------
    

    // TESTS PARA LA CONSIGNA PROPUESTA: SE IMPRIME POR CONSOLA LOS RESULTADOS

    System.out.println();
    System.out.println("//TESTS//");
    System.out.println();

    // TESTS - 1. CREACIÓN DE UN ESTUDIANTE
    Student student1 = new Student ("Juan", "Migone", 1, "Soltero", "Matemática I");
    studentsList.add(student1);

    System.out.println("//ESTUDIANTE 1//");

    System.out.println();

    System.out.println("Nombre: " + student1.name);
    System.out.println("Apellido: " + student1.lastName);
    System.out.println("identificación: " + student1.idNumber);
    System.out.println("Estado Civil: " + student1.status); 
    System.out.println("Curso: " + student1.course);

    System.out.println();
    System.out.println();

    // TESTS - 2. CREACIÓN DE UN PROFESOR
    Professor professor1 = new Professor ("Jorge", "Pérez", 2, "Casado", 8, "Lenguajes");
    professorsList.add(professor1);

    System.out.println("//PROFESSOR 1//");

    System.out.println();

    System.out.println("Nombre: " + professor1.name);
    System.out.println("Apellido: " + professor1.lastName);
    System.out.println("identificación: " + professor1.idNumber);
    System.out.println("Estado Civil: " + professor1.status);
    System.out.println("Año de Incorporación: " + professor1.yearIncorporation);
    System.out.println("Número de despacho: " + professor1.officeNumber);
    System.out.println("Departamento: " + professor1.department);

    System.out.println();
    System.out.println();

    
    // TESTS - 3. CREACIÓN DE UN INTEGRANTE DEL PERSONAL
    Staff staff1 = new Staff ("Ramón", "González", 3, "Soltero", 31, "Biblioteca");
    System.out.println("//STAFF 1//");

    System.out.println();

    System.out.println("Nombre: " + staff1.name);
    System.out.println("Apellido: " + staff1.lastName);
    System.out.println("identificación: " + staff1.idNumber);
    System.out.println("Estado Civil: " + staff1.status);
    System.out.println("Año de Incorporación: " + staff1.yearIncorporation);
    System.out.println("Número de despacho: " + staff1.officeNumber);
    System.out.println("Sección: " + staff1.section);

    System.out.println();
    System.out.println();

    // TESTS - 4. MÉTODOS DE CAMBIO DE VARIABLES DE CADA CLASE

    System.out.println("///CAMBIOS DE ESTADOS///");

    System.out.println();

    student1.setStatus("Casado");
    System.out.println("Nuevo Estado Civil de " + student1.name + " " + student1.lastName + " : " + student1.status);

    student1.setCourse("Física");
    System.out.println("Nuevo Curso Matriculado del Alumno " + student1.name + " " + student1.lastName + " : " + student1.course);

    professor1.setDepartment("Matemáticas");
    System.out.println("Nuevo Departamento del Profesor " + professor1.name + " " + professor1.lastName + " : " + professor1.department);
    
    staff1.setSection("Secretaría");
    System.out.println("Nueva Secretaría del Personal " + staff1.name + " " + staff1.lastName + " : " + staff1.section);

    System.out.println();
    System.out.println();

    //TESTS 5 - FILTRADO DE PROFESORES o ESTUDIANTS
    System.out.println("///FILTRADO DE PROFESORES - ESTUDIANTES ///");
    System.out.println();

    // 5.1 - Creación de nuevos profesores para resultados mas ilustrativos.
    Professor professor2 = new Professor ("Jorge", "Pérez", 3, "Casado", 8, "Humanidades");
    Professor professor3 = new Professor ("Jorge", "Pérez", 4, "Casado", 8, "Matemáticas");
    Professor professor4 = new Professor ("Jorge", "Pérez", 5, "Casado", 8, "Matemáticas");
    Professor professor5 = new Professor ("Jorge", "Pérez", 6, "Casado", 8, "Humanidades");
    Professor professor6 = new Professor ("Jorge", "Pérez", 7, "Casado", 8, "Lenguajes");
    professorsList.add(professor2);
    professorsList.add(professor3);
    professorsList.add(professor4);
    professorsList.add(professor5);
    professorsList.add(professor6);

    // 5.2 - Filtrado de PROFESORES
    System.out.println("LISTA COMPLETA DE PROFESORES: " + professorsList);
    String filtroDepartamento = "Matemáticas";
    professorsList.removeIf(professor -> professor.department != filtroDepartamento);
    System.out.println("LISTA DE PROFESORES FILTRADO POR DEPARTAMENTO DE " +  filtroDepartamento + " : " + professorsList);

    System.out.println();

    // 5.3 - Creación de nuevos profesores para resultados mas ilustrativos.
    Student student2 = new Student ("Jorge", "Pérez", 8, "Casado", "Matemática I");
    Student student3 = new Student ("Jorge", "Pérez", 9, "Casado", "Inglés");
    Student student4 = new Student ("Jorge", "Pérez", 10, "Casado", "Física I");
    Student student5 = new Student ("Jorge", "Pérez", 11, "Casado", "Física I");
    Student student6 = new Student ("Jorge", "Pérez", 12, "Casado", "Matemática I");
    studentsList.add(student2);
    studentsList.add(student3);
    studentsList.add(student4);
    studentsList.add(student5);
    studentsList.add(student6);

    // 5.4 - Filtrado de ESTUDIANTES
    System.out.println("LISTA COMPLETA DE ESTUDIANTES: " + studentsList);
    String filtroCurso = "Matemática I";
    studentsList.removeIf(student -> student.course != filtroCurso);
    System.out.println("LISTA DE ESTUDIANTES FILTRADO POR CURSO DE " +  filtroCurso + " : " + studentsList);
    System.out.println();

  }
}