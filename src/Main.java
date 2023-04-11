public class Main {
    public static void main(String[] args) throws Exception {
        
        Persona persona = new Persona(); 
        persona.setterEdad1(43);

        int edad = persona.getterEdad();
        System.out.println(edad);

        persona.setterTel(2944);
        int tel = persona.getterTel();
        System.out.println(tel);

        persona.setterName("Nicolas");
        String name = persona.getterName();
        System.out.println(name);
    }


}

class Persona{
    private int edad; 
    private int tel;
    private String name;    

    /*setter */
public void setterEdad1(int valor){
    this.edad = valor;
}

public void setterTel(int valor){
    this.tel = valor;
}

public void setterName(String valor){
    this.name = valor;
}

    /*getter */
public int getterEdad(){
    return this.edad;
}

public int getterTel(){
    return this.tel;
}

public String getterName(){
    return this.name;
}


}

class Cliente extends Persona {}