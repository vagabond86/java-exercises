public class Exercise058 {
    public static void main(String[] args) {

//        58. Write a Java program to capitalize the first letter of each word in a sentence.
//        Sample Output:
//
//        Input a Sentence: the quick brown fox jumps over the lazy dog.
//                The Quick Brown Fox Jumps Over The Lazy Dog.

        String sentence = "the quick brown fox jumps over the lazy dog.";
        String[] words = sentence.split(" ");

        // Dla każdego wyrazu zamień pierwszą literę na wielką
        for (Integer i = 0; i < words.length; i++) {
            String word = words[i];
            String firstLetter = word.substring(0, 1);
            String restOfWord = word.substring(1);
            words[i] = firstLetter.toUpperCase() + restOfWord;
        }

        // Połącz wyrazy w zdanie i wyświetl je na ekranie
        String result = String.join(" ", words);
        System.out.println(result);
    }
}

