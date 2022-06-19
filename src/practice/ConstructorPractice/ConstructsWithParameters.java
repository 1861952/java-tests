package practice.ConstructorPractice; 
public class ConstructsWithParameters {
    int modelYear;
    String modelName;

    /* constructor doesn't have public void or static void 
        and is named after file name*/

    public ConstructsWithParameters(int year, String name) {
        modelYear = year;
        modelName = name;
    }

}
