package objetos;

import java.util.ArrayList;
import java.util.LinkedList;

public class List {
    
    public static void main(String[] args) {

        ArrayList<String> pais = new ArrayList<>();
        pais.add("Joao");
        pais.add("Maria");
        
        LinkedList<String> filhos = new LinkedList<>(); // mais lento
        filhos.add("Pedro");
        filhos.add("Paulo");
        
        ArrayList<String> familia = new ArrayList<>();
        familia.addAll(pais);
        familia.addAll(filhos);
        
        System.out.println(pais);
        System.out.println(filhos);
        System.out.println(familia);
        
        System.out.println(familia.get(0));
        System.out.println(familia.get(1));
        System.out.println(familia.get(2));
        System.out.println(familia.get(3));

    }

}