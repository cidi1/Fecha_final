void main(String[] args) {
   Fecha fech1 = new Fecha(12, 6, 2007);
   fech1.MostrarFecha();
    System.out.println("----------------------");
    fech1.setMes(1);
    fech1.setDia(27);
    fech1.setAño(1967);
    fech1.MostrarFecha();
}