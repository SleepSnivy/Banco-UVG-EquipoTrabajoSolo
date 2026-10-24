public class Retiro {
public static void realizar(CuentaBancaria cuenta, double monto) {
if (monto <= 0) {
System.out.println("El retiro debe ser mayor que cero.");
return;
}
if (cuenta.registrarMovimiento(-monto)) {
System.out.println("Retiro exitoso: Q" + monto);
} else {
System.out.println("Retiro rechazado.");
}
}
}
