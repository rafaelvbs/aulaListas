package br;

import java.util.*;

public class DH {
    public static void main(String[] args) {
        //HashSet
        Set<String> conjunto = new HashSet<>();// nao aceita valor igual ele não, printa um dos repetidos, ordem não é relevante, guarda em qualquer ordem
        conjunto.add("Erika");
        conjunto.add("Jessica");
        conjunto.add("Rafael");
        conjunto.add("Rafael");

        for (String valor : conjunto) {
            System.out.println(valor);
        }
        //HashMap
        Map<Integer, String> mapa = new HashMap<>();//aceita valores diferentes, pois o diferencial é a chave, mas ele sobrescreve caso tenha a mesma chave
        mapa.put(1, "Teste1");
        mapa.put(2, "Teste2");
        mapa.put(3, "Teste3");
        mapa.put(4, "Teste4");

        mapa.remove(3);

        for (Integer chave : mapa.keySet()) {
            String valor = mapa.get(chave);
            System.out.println(valor);
        }

        //Array List -segue uma ordem,

        List<String> lista = new ArrayList<>();
        lista.add("Rafael");
        lista.add("Ana");
        lista.add("Pedro");

        //defive o "valor" como o segundo item da lista, pode procurar o
        String valor = lista.get(2);
        //lista.remove(1);
        for (String valor2 : lista) {
            System.out.println(valor2);
        }

    }
}
