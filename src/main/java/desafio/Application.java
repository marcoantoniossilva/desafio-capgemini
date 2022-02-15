package desafio;

import java.util.Scanner;

public class Application {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    // Teste da questão 01
    Password password = new Password();
    System.out.println("Digite uma senha para ser validada: ");
    String typedPassword = scanner.next();
    int addCharacters = password.checkPassword(typedPassword);
    System.out.printf("Devem ser adicionados no mínimo %d caracteres para a senha '%s' tornar-se forte.\n", addCharacters, typedPassword);

    // Teste da questão 02
    Stair stair = new Stair();
    System.out.println("Digite quantos degraus deseja que sejam impressos: ");
    int steps = scanner.nextInt();
    String mountedStair = stair.mountStair(steps);
    System.out.println(mountedStair);

  }

}
