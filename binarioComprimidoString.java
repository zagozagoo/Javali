import java.util.Random;
class Main
{
  public static void main(String[] args)
  {
      Random random = new Random();
      int numero1 = random.nextInt(100, 999);
      int numero2 = random.nextInt(100, 999);

      // Convertendo p binario
      String binario1 = String.format("%8s", Integer.toBinaryString(numero1)).replace(' ', '0');

      String binario2 = String.format("%8s", Integer.toBinaryString(numero2)).replace(' ', '0');

      System.out.println("primeiro numero: " + numero1 + " (em binario: " + binario1 + ")");
      System.out.println("segundo numero: " + numero2 + " (em binario: " + binario2 + ")\r\n");

      // Juntando os 4 primeiros digitos de binario
      String primeirosDigitos1 = binario1.substring(0, 4);
      String primeirosDigitos2 = binario2.substring(0, 4);

      System.out.println("Primeiros 4 digitos do primeiro numero binario: " + primeirosDigitos1);
      System.out.println("Primeiros 4 digitos do segundo numero binario: " + primeirosDigitos2 + "\r\n");

      String binarioComprimido = primeirosDigitos1 + primeirosDigitos2;
      System.out.println("Binario comprimido: " + binarioComprimido);
      String binarioDescomprimido = descomprimirBinario(primeirosDigitos1, primeirosDigitos2);
      System.out.println("Binarios descomprimidos: \r\n" + binarioDescomprimido);
  }
  private static String descomprimirBinario(String parte1, String parte2)
  {
      return "1: " + parte1 + "0000" + "\r\n" + "2: " + parte2 + "0000";
  }
}
