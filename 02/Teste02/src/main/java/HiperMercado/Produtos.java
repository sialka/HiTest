package HiperMercado;

/**
 *
 * @author Sidnei
 */
abstract class Produtos {
    
    static double lucroMaximo = 1.3d;
    static double lucroMinimo = 1.1d;

    public static double formulaMagica(double custo, int validade) {
        custo = custo * (validade <= 30 ? lucroMinimo : lucroMaximo);
        
        return Math.round(custo * 100.0) / 100.0;
    }

}
