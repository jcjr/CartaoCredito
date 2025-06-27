import java.util.Scanner;

public class CartaoCredito {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("\n\nDigite o número do cartão de crédito: ");
      String bandeira = identificarBandeira(scanner.nextLine());
      System.out.println("A bandeira do cartão é: " + bandeira);
      scanner.close();
   }

   public static String identificarBandeira(String numeroCartao) {
      if (numeroCartao.startsWith("4")) {
         return "Visa";
      } else if (numeroCartao.startsWith("5")) {
         return "MasterCard";
      } else if (numeroCartao.startsWith("34") || numeroCartao.startsWith("37")) {
         return "American Express";
      } else if (numeroCartao.startsWith("6011") || numeroCartao.startsWith("65")) {
         return "Discover";
      } else if (numeroCartao.startsWith("35")) {
         return "JCB";
      } else if (numeroCartao.startsWith("36") || numeroCartao.startsWith("38")) {
         return "Diners Club";
      } else if (numeroCartao.startsWith("62")) {
         return "UnionPay";
      } else if (numeroCartao.startsWith("30")) {
         return "Diners Club (Carte Blanche)";
      } else if (numeroCartao.startsWith("50") || numeroCartao.startsWith("56") || 
                 numeroCartao.startsWith("57") || numeroCartao.startsWith("58")) {
         return "Elo";
      } else if (numeroCartao.startsWith("60")) {
         return "Hipercard";
      } else if (numeroCartao.startsWith("38")) {
         return "Cabal";
      } else if (numeroCartao.startsWith("637095") || numeroCartao.startsWith("637568") ||
                 numeroCartao.startsWith("637599") || numeroCartao.startsWith("637609") ||
                 numeroCartao.startsWith("637612")) {
         return "Banescard";
      } else if (numeroCartao.startsWith("40")) {
         return "Aura";
      } else {
         return "Desconhecida";
      }
   }
}