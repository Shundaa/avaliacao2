
import utfpr.ct.dainf.if62c.avaliacao.PoligonalFechada;
import utfpr.ct.dainf.if62c.avaliacao.PontoXZ;

/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Segunda avaliação parcial 2014/2.
 * @author 
 */
public class Avaliacao2 {

    public static void main(String[] args) {
        PontoXZ p =new PontoXZ (-3,2);
        PontoXZ p1 =new PontoXZ (-3,6);
        PontoXZ p2 =new PontoXZ (0,2);
        PoligonalFechada n = new PoligonalFechada (3);
        n.set(0,p);
        n.set(1,p1);
        n.set(2,p2);
        System.out.println(n.getComprimento());
    }
}
