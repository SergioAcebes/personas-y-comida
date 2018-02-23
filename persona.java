
/**
 * Crea objetos de la clase persona que deberan ser alimentados.
 *
 * @SergioAcebesPonga
 * @23/02/2018
 */
public class persona
{
    //nombre de la persona.
    private String nombre;
    //sexo de la persona.
    private boolean esHombre;
    //peso de la persona.
    private int peso;
    //altura de la persona.
    private int altura;
    //edad de la persona.
    private int edad;
    /**
     * Constructor de objetos de la clase persona
     * @param nombre - nombre de la persona.
     * @param esHombre - si es hombre introducir true en caso de que sea mujer introducir false.
     * @param peso - peso en kilogramos de la persona.
     * @param altura - altura en centrimetros de la persona.
     * @param edad - edad de la persona.
     */
    public persona(String nombre,boolean esHombre,int peso,int altura,int edad)
    {
        this.nombre = nombre;
        this.esHombre = esHombre;
        this.peso= peso;
        this.altura = altura;
        this.edad = edad;
    }

    
}
