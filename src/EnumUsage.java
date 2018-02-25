enum Converter {/*from  j ava 2 s  .c  om*/
  DollarToEuro("Dollar to Euro") {
    @Override
    double convert(double value) {
      return value * 0.9;
    }
  },
  DollarToPound("Dollar to Pound") {
    @Override
    double convert(double value) {
      return value * .8;
    }
  };
  Converter(String desc) {
    this.desc = desc;
  }

  private String desc;

  @Override
  public String toString() {
    return desc;
  }

  abstract double convert(double value);

}
public class EnumUsage{
  public static void main(String[] args) {
    System.out.println(Converter.DollarToEuro + " = " + Converter.DollarToEuro.convert(100.0));
    System.out.println(Converter.DollarToPound + " = " + Converter.DollarToPound.convert(98.6));
  }

}