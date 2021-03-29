package comp1721.cwk1;

import java.io.BufferedReader;
import java.io.File;
import java.time.LocalDate;

public class CovidDataset {
  CovidDataset(){}
  int num=0;
  CaseRecord[]dataset = new CaseRecord[1000];



  // TODO: Write stub for size()
  public int size(){
    return num;
  }
  // TODO: Write stub for getRecord()
    public CaseRecord getRecord(int index) {
    if (index>=num||index<0){
      throw new DatasetException("a");
    }
    else
    {
      CaseRecord a = dataset[index];
      return a;
    }
    }
  // TODO: Write stub for addRecord()
    public void addRecord(CaseRecord rec){
      dataset[num] = rec;
      num++;
    }
  // TODO: Write stub for dailyCasesOn()
    public CaseRecord dailyCasesOn(LocalDate day){
    for (int i=0;i<num;i++)
    {
      if (day==dataset[i].getDate())
      {
              return dataset[i];
      }
    }
    throw new DatasetException("a");
    }
  // TODO: Write stub for readDailyCases()
    public void readDailyCases(String filename){

  }

  // TODO: Write stub for writeActiveCases()
    public void writeActiveCases(String filename){
    }
}
