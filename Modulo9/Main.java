public class Main {
    public static void main(String[] args) throws Exception {
        
        Cliente cliente = new Cliente();
        cliente.edad = 43;
        System.out.println(cliente.edad);
    }


}

class Persona{
    int edad; 
    int tel;
    String name;    

}

class Cliente extends Persona {}



