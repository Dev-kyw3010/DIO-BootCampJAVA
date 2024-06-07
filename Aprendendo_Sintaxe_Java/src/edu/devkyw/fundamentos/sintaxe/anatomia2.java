package edu.devkyw.fundamentos.sintaxe;

public class anatomia2 {
    
    public static void main(String[]args){
        String fNamne = "Eduardo";
        String lName = "Kim";
        String chamandoMetodo = fullName(fNamne, lName);

        System.out.println(chamandoMetodo);
    }

    public static String fullName (String nome, String sobrenome){
        // .concat() é a forma de concatenar duas strings
        return nome.concat(" ").concat(sobrenome);
    }
}
