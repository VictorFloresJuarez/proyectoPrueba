class Main {
  public static void main(String[] args) {
    Persona persona1 = new Persona();
    String nombre = "Víctor El Pachas";
    int edad = 19;

    persona1.setEdad(edad);
    persona1.setNombre(nombre);

    System.out.println(persona1.getEdad());
    System.out.println(persona1.toString());
  }
}