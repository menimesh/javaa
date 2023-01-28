import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.util.Scanner; // Import the Scanner class to read text files

public class file_search {
    

  public static void main(String[] args) {
    int i=0;
    try {
      File myObj = new File("Nimesh.txt");
      Scanner myReader = new Scanner(myObj);
      while (myReader.hasNextLine()) {
        String check="BIM";
        String data = myReader.nextLine();
        int count=data.indexOf(check);
      
        if(count==1){
         i=i+1;
        }
      
      }
      System.out.println("The sentences contain" +i+ "Bim");//checking how many bim words contain in file
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }}