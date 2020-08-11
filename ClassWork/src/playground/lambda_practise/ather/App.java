package playground.lambda_practise.ather;

public class App {

    public static void main(String[] args) {


        TextPrinter tp = new TextPrinter("this is where we are testing eveerything another eetoo");

        System.out.println("*** Worden met de letter 'e'");
        tp.printWordsFiltered((s) -> s.contains("e"));

        System.out.println("*** Worden langer dan vier letters");
        tp.printWordsFiltered((s) -> s.length() > 4);

        System.out.println("*** Worden die beginnen met de letter 'a'");
        tp.printWordsFiltered(s -> s.startsWith("a"));

        System.out.println("*** Worden die als tweede letter 'e' hebben");
        tp.printWordsFiltered(s -> s.substring(1,2).equals("e"));

        System.out.println("*** Worden die twee keer de letter 'e' bevatten");
        tp.printWordsFiltered(s -> {
            return s.contains("ee");
        });




    }
}
