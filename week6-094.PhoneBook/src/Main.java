
public class Main {

    public static void main(String[] args) {
        // write testcode here
        Phonebook phonebook = new Phonebook();
        
        phonebook.add("Pekka Mikola", "353454353");
        phonebook.add("Stoffel Waffle", "34367685");
        phonebook.add("Romain Grosjean", "575534583");
        
        phonebook.printAll();
        
        System.out.println("");
        String number = phonebook.searchNumber("Pekka Mikola");
        System.out.println(number);
    }    
}
