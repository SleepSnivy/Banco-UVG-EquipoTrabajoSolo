import java.util.Scanner;
public class Main {
public static void main(String[] args) {
Scanner teclado = new Scanner(System.in);
CuentaBancaria cuenta = new CuentaBancaria("Cuenta UVG", 500.0);
String opcion = "";
while (!opcion.equals("0")) {
System.out.println("\n=== BANCO UVG ===");
System.out.println("1. Depositar");
System.out.println("2. Retirar");
System.out.println("3. Consultar saldo");
System.out.println("4. Ver movimientos");
System.out.println("0. Salir");
System.out.print("Opcion: ");
opcion = teclado.nextLine();
if (opcion.equals("1") || opcion.equals("2")) {
System.out.print("Monto en quetzales: ");
try {
double monto = Double.parseDouble(teclado.nextLine());
if (opcion.equals("1")) {
Deposito.realizar(cuenta, monto);
} else {
Retiro.realizar(cuenta, monto);
}
} catch (NumberFormatException e) {
System.out.println("Escribe un monto numerico.");
}
} else if (opcion.equals("3")) {
System.out.println("Saldo: Q" + cuenta.getSaldo());
} else if (opcion.equals("4")) {
cuenta.mostrarMovimientos();
} else if (!opcion.equals("0")) {
System.out.println("Opcion no valida.");
}
}
System.out.println("Gracias por usar Banco UVG.");
teclado.close();
}
}
