package comp1721.cwk1;

import java.sql.Date;
import java.time.LocalDate;

public class CaseRecord {
  LocalDate date;
  int staffCases;
  int studentCases;
  int otherCases;
  int totalCases;
  String toString;
  
  // TODO: Write stub for constructor
  CaseRecord(LocalDate a,int b,int c,int d)
  {
    if(b<0||c<0||d<0)
    {
      throw new DatasetException("a");
    }
    date = a;
    staffCases = b;
    studentCases = c;
    otherCases = d;
  }
  
  // TODO: Write stubs for four getter methods
  public LocalDate getDate() {  
    return date;
  }
  public int getStaffCases() {
      return staffCases;
  }
  public int getStudentCases(){
      return studentCases;
  }
  public int getOtherCases() {
      return otherCases;
  }
  
  // TODO: Write stub for totalCases()
  public int totalCases(){
    totalCases=staffCases+studentCases+otherCases;
      return totalCases;
  }
  
  // TODO: Write stub for toString()
  public String toString(){
    toString=date+": "+staffCases+" staff, "+studentCases+" students, "+otherCases+" other";
    return toString;
  }
}
