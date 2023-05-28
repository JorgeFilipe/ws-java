import java.util.Scanner;
class Main {
  public static void main(String[] args) {
    Scanner ler = new Scanner(System.in);
    System.out.println("");
    System.out.println("");
    System.out.println(" IMOBILIÁRIA");
    System.out.println("");
    System.out.println(":::'###::::'##::::'##:'########:::'#######::'########:::::'###::::");
    System.out.println("::'## ##::: ##:::: ##: ##.... ##:'##.... ##: ##.... ##:::'## ##:::");
    System.out.println(":'##:. ##:: ##:::: ##: ##:::: ##: ##:::: ##: ##:::: ##::'##:. ##::");
    System.out.println("'##:::. ##: ##:::: ##: ########:: ##:::: ##: ########::'##:::. ##:");
    System.out.println(" #########: ##:::: ##: ##.. ##::: ##:::: ##: ##.. ##::: #########:");
    System.out.println(" ##.... ##: ##:::: ##: ##::. ##:: ##:::: ##: ##::. ##:: ##.... ##:");
    System.out.println(" ##:::: ##:. #######:: ##:::. ##:. #######:: ##:::. ##: ##:::: ##:");
    System.out.println("..:::::..:::.......:::..:::::..:::.......:::..:::::..::..:::::..::");
    System.out.println("");
    
    System.out.println("Vendemos apenas terrenos retangulares!");
    System.out.println("");
    
    System.out.println("Insira o valor da base do terreno: ");
    double base = ler.nextDouble();

    System.out.println("Insira o valor da altura do terreno: ");
    double altura = ler.nextDouble();

    double area=(base*altura);

    System.out.println("Area do Terreno : "+area);
  }
}