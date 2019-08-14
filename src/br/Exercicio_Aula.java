package br;

import jdk.nashorn.internal.runtime.ListAdapter;

import java.util.*;//pega bibliotecas list set e map
public class Exercicio_Aula {
    public static void main(String[] args) {

        Map<Integer, String> loteriaDoSonho = new HashMap<>();
        loteriaDoSonho.put(0, "Ovos");
        loteriaDoSonho.put(1, "Agua");
        loteriaDoSonho.put(2, "Escopeta");
        loteriaDoSonho.put(3, "Dentista");
        loteriaDoSonho.put(4, "Cavalo");
        loteriaDoSonho.put(5, "Fogo");


        Map<String, String> apelidosAmigos = new HashMap<>();
        apelidosAmigos.put("Joao", "Juan, Fissura,Maromba");
        apelidosAmigos.put("Miguel", "Night Watch, Bruce Wayne,Tampinha");
        apelidosAmigos.put("Maria", "Wonder Woman, Mary, Marilene");
        apelidosAmigos.put("Lucas", "Lukinha, Jorge,George");


        for (Integer chaveLoteria : loteriaDoSonho.keySet()) {//estrutura for para Map
            String valor = loteriaDoSonho.get(chaveLoteria);
            System.out.println(valor);
        }

        for (String chaveApelido : apelidosAmigos.keySet()) {
            String valor1 = apelidosAmigos.get(chaveApelido);
            System.out.println(valor1);
        }

        List<Integer> listaNum = new ArrayList<>();
        listaNum.add(1);
        listaNum.add(5);
        listaNum.add(5);
        listaNum.add(7);
        listaNum.add(8);
        listaNum.add(8);
        listaNum.add(8);

        for (Integer num : listaNum) {
            System.out.println(num);
        }


        Set<Integer> conjuntoNum = new HashSet<>();// nao aceita valor igual ele não, printa um dos repetidos, ordem não é relevante, guarda em qualquer ordem
        conjuntoNum.add(1);
        conjuntoNum.add(5);
        conjuntoNum.add(5);
        conjuntoNum.add(6);
        conjuntoNum.add(7);
        conjuntoNum.add(8);
        conjuntoNum.add(8);
        conjuntoNum.add(8);

        for (Integer varConjunto : conjuntoNum) {
            System.out.println(varConjunto);
        }



        public static int somaTotal(int soma){

            for (Integer varConjunto : conjuntoNum) {
                System.out.println(soma = soma + varConjunto);
            }

        }
    }
}