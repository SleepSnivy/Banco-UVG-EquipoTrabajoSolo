public class CuentaBancaria {
private String titular;
private double saldo;
private double[] movimientos = new double[10];
private int totalMovimientos = 0;
public CuentaBancaria(String titular, double saldoInicial) {
this.titular = titular;
this.saldo = saldoInicial;
}
public double getSaldo() {
return saldo;
}
public boolean registrarMovimiento(double cambio) {
if (totalMovimientos >= movimientos.length) {
System.out.println("Historial lleno (maximo 10).");
return false;
}
if (saldo + cambio < 0) {
System.out.println("Saldo insuficiente.");
return false;
}
saldo += cambio;
movimientos[totalMovimientos] = cambio;
totalMovimientos++;
return true;
}
public void mostrarMovimientos() {
System.out.println("--- MOVIMIENTOS ---");
if (totalMovimientos == 0) {
System.out.println("Aun no hay movimientos.");
}
for (int i = 0; i < totalMovimientos; i++) {
if (movimientos[i] > 0) {
System.out.println((i + 1) + ". Deposito: Q" + movimientos[i]);
} else {
System.out.println((i + 1) + ". Retiro: Q" + (-movimientos[i]));
}
}
}
}
