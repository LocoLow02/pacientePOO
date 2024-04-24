import java.util.Scanner;
public class MainPaciente {
public static void main(String[] args){
Scanner p1 = new Scanner(System.in);
System.out.println("Nombre:");
String nombre=p1.next();
System.out.println("Apellido:");
String apellido=p1.next();
System.out.println("Edad:");
int edad=p1.nextInt();
System.out.println("Altura:");
double altura=p1.nextDouble();
System.out.println("Peso:");
double peso=p1.nextDouble();
System.out.println("Enfermedad:");
String enfermedad=p1.next();

Paciente th = new Paciente();
th.nombre=nombre;
th.apellido=apellido;
th.edad=edad;
th.altura=altura;
th.peso=peso;
th.enfermedad=enfermedad;

th.mostrarNombre();
th.mostrarApellido();
th.mostrarEdad();
th.mostrarAltura();
th.mostrarPeso();
th.mostrarEnfermedad();
    }
}