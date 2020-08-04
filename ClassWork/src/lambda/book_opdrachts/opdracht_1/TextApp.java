package lambda.book_opdrachts.opdracht_1;

public class TextApp {

    public static void main(String[] args) {

        final String c = "e";

        Text text = new Text("Heelo this is an example of a sentence containing words");

        System.out.println("*** words containing 'e' ***");
        text.printFilteredWords(s -> s.contains(c));

        System.out.println("*** Long words ***");
        text.printFilteredWords(s -> s.length() > 4);

        System.out.println("*** Words starting with 'a' ***");
        text.printFilteredWords(s -> s.startsWith("a"));

        System.out.println("*** words with second letter 'e'  ***");
        text.printFilteredWords(s -> s.indexOf('e') == 1);

        System.out.println("*** Words containing 2x 'e' but not more ***");
        text.printFilteredWords(s -> s.indexOf('e') != s.lastIndexOf('e'));

        text.printFilteredWords(s -> {

            int count = 0;
            for(char e : s.toCharArray()){
                if(e == 'e')
                    count ++;

            }
            return count == 2;
        });

    }
}
