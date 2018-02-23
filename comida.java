
/**
 * Constructor de la clase comida.
 *
 * @SergioAcebesPonga
 * @23/02/2018
 */
public class comida
{
    //nombre de la comida.
    private String nombreComida;
    //calorias de la comida.
    private int calorias;

    /**
     * Constructor de objetos de la clase comida.
     * @param nombreComida - Nombre de la comida.
     * @param calorias - Cantidad de calorias que tiene dicha comida.
     */
    public comida(String nombreComida,int calorias)
    {
        this.nombreComida = nombreComida;
        this.calorias = calorias;
    }
}
