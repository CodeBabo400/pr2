package de.bht.pr2.lab01;

public class Student {

  //-------------------------------------------
  // Attribute
  private String name = "";

  // Matrikelnummer
  private int registrationNumber = 0;

  // Medieninformatik, Technische Informatik, Druck- und Medientechnik und Screen Based Media
  private String courseOfStudies = "";

  // Rückmeldegebühr
  public static final int TUITION_FEE = 312;

  /**
   * This contructor parses a comma-separated row describing a student object.
   *
   * @param dataRow a comma-separated row describing a student object
   */
  public Student(String dataRow) {
    // TODO: Here goes your code ...
    String[] data = dataRow.split(",");
    

    this.name = data[0];  // Name (z.B. "Anna Alt")
    this.registrationNumber = Integer.parseInt(data[1]);  // Matrikelnummer (z.B. "70001")
    this.courseOfStudies = data[2];  // Studiengang (z.B. "Medieninformatik")
  }

  public void displayStudentInfo() {
    System.out.println("Name:" + name);
    System.out.println("Matrikelnummer"+ registrationNumber);
    System.out.println("Studiengang"+ courseOfStudies);
  }

  
  
}
