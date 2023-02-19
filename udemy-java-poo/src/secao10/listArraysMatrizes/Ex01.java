package secao10.listArraysMatrizes;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.w3c.dom.NameList;

public class Ex01 {
    public static void main(String[] args) {
        List<String> nameList = new ArrayList<>();
        nameList.add("Nathan");
        nameList.add("Thiago");
        nameList.add("Giovanny");
        nameList.add("Leticia");
        nameList.add("Marcia");
        nameList.add("Chris");
        nameList.add("Akemi");
        nameList.add("Julia");
        nameList.add("Giovana");
        nameList.add("Leonard");
        nameList.add("Camilinha");
        nameList.add("Camila");


        for(String name: nameList) {
            System.out.println(name);
        }
        
        // Remover o elemento (crente) na posição 0
        nameList.remove(0); // Nathan desviou

        // Remover todos que começam com letra J
        nameList.removeIf(x -> x.charAt(0) == 'J');

        // Retorna o índice (posição) do elemento
        nameList.indexOf("Nathan");

        // Filtrar todos os elementos que inicam com letra C
        List<String> result = nameList.stream().filter(x -> x.charAt(0) == 'C').collect(Collectors.toList());

        // Encontrar o 1o elemento com a letra A
        String name = nameList.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null);
    }
    
}
