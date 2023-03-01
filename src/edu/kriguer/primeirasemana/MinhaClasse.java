package edu.kriguer.firstweek;

public class MinhaClasse {
    public static void main(String[] args) {
        String firstName = "Kriguer";
        String lastName = "Freitas";
        String fullName = nomeCompleto(firstName, lastName);
        System.out.println(fullName);
    }

    public static String nomeCompleto(String firstName, String lastName) {
        return firstName.concat(" ").concat(lastName);
    }
}
