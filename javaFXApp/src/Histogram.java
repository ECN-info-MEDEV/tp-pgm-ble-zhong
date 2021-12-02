public class Histogram {

  public void generateHisto() {

    int array[] = { 0, 0, 0, 0, 0 };

    String output = "Value\tHistogram";

    for (int counter = 0; counter < array.length; counter++) {
      output += "\n" + array[counter] + "\t";

      for (int stars = 0; stars < array[counter]; stars++) {
        output += "*";
      }
    }
    System.out.println(output);
  }
}