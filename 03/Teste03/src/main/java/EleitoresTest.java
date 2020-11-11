
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 *
 * @author Sidnei
 */
public class EleitoresTest {

    static List<Rua> totalEleitoresPorRua(List lista, List eleitores) {

        Map<String, Integer> map = new HashMap<>();

        // Adicionando as Ruas 
        lista.forEach(value -> {
            map.put(value.toString(), 0);
        });

        // Adicionando Eleitores por rua        
        for (int i = 0; i < lista.size(); i++) {
            String ruaNome = lista.get(i).toString();
            Integer qtdEleitor = (Integer) eleitores.get(i);

            map.forEach((k, v) -> {
                if (k == ruaNome) {
                    v = v + qtdEleitor;
                    map.put(k, v);
                }
            });
        }

        // Ordenando
        final Map<String, Integer> mapNaoOrdenado = map;

        final Map<String, Integer> mapOrdenado = mapNaoOrdenado.entrySet()
                .stream()
                .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        List<Rua> listagemFinal = new ArrayList<>();

        //ordenado.forEach((key, value) -> System.out.println(value + " - " + key));
        mapOrdenado.forEach((key, value) -> {
            String dado = value + " - " + key;
            listagemFinal.add(new Rua("", dado));
        });

        return listagemFinal;
    }

    public static void main(String[] args) {

        /**
         * Questão (3)
         *
         * Um candidato a prefeito quer saber quais ruas ele deve visitar para
         * impactar o maior numero de eleitores. Abaixo seguem objetos ja
         * existentes que representam casas e ruas:
         *
         * Utilizando obrigatoriamente um Map em Java implemente um metodo que
         * receba uma List<Casa>
         * e devolva uma List<Rua> ordenada de maneira decrescente pelo total de
         * eleitores.
         *
         * Adicione as classes, os metodos que julgar necessarios.
         */
        
        // 1 - Alimentando as Classes
        Rua ruaUm = new Rua("01001-000", "Rua Tucano");
        Rua ruaDois = new Rua("01002-000", "Rua Beija-Flor");
        Rua ruaTres = new Rua("01003-000", "Rua Gaivota");
        Rua ruaQuatro = new Rua("01004-000", "Rua Pelicano");
        Rua ruaCinco = new Rua("01005-000", "Rua Curuja");

        Casa ruaUmCasa1 = new Casa(ruaUm, 1, 1);
        Casa ruaUmCasa2 = new Casa(ruaUm, 3, 3);

        Casa ruaDoisCasa1 = new Casa(ruaDois, 2, 1);
        Casa ruaDoisCasa2 = new Casa(ruaDois, 4, 0);

        Casa ruaTresCasa1 = new Casa(ruaTres, 5, 0);
        Casa ruaTresCasa2 = new Casa(ruaTres, 7, 0);

        Casa ruaQuatroCasa1 = new Casa(ruaQuatro, 6, 2);
        Casa ruaQuatroCasa2 = new Casa(ruaQuatro, 8, 3);

        Casa ruaCincoCasa1 = new Casa(ruaCinco, 9, 0);
        Casa ruaCincoCasa2 = new Casa(ruaCinco, 112, 2);

        // 2 - Criando com os dados dos leitores
        List<Casa> possiveisEleitores = new ArrayList<Casa>();
        possiveisEleitores.add(ruaUmCasa1);
        possiveisEleitores.add(ruaUmCasa2);
        possiveisEleitores.add(ruaDoisCasa1);
        possiveisEleitores.add(ruaDoisCasa2);
        possiveisEleitores.add(ruaTresCasa1);
        possiveisEleitores.add(ruaTresCasa2);
        possiveisEleitores.add(ruaQuatroCasa1);
        possiveisEleitores.add(ruaQuatroCasa2);
        possiveisEleitores.add(ruaCincoCasa1);
        possiveisEleitores.add(ruaCincoCasa2);

        // 3 - Criando Lista para alimentar MAP com eleitores existentes.
        List<Integer> eleitoresPorRua = new ArrayList<Integer>();        
        for (int i = 0; i < possiveisEleitores.size(); i++) {
            eleitoresPorRua.add(possiveisEleitores.get(i).totalEleitores);
        }

        System.out.println(totalEleitoresPorRua(possiveisEleitores, eleitoresPorRua));
    }

}
