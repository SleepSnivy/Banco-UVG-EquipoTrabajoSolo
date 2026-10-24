class Deposito {
public static void realizar(CuentaBancaria cuenta, double monto) {
if (monto <= 0) {
System.out.println("El deposito debe ser mayor que cero.");
return;
}
if (cuenta.registrarMovimiento(monto)) {
System.out.println("Deposito exitoso: Q" + monto);
}
}
}
