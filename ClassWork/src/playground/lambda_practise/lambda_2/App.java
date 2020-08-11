package playground.lambda_practise.lambda_2;

public class App {

    public static void main(String[] args) {

        TextFilter textFilter = new TextFilter("This is a test subject running through words and sentences");
        textFilter.printFilteredTexts(new WordFilterer() {
            @Override
            public boolean isValid(String s) {
                return s.contains("s");
            }
        });

        System.out.println("******************************");

        textFilter.printFilteredTexts(new WordFilterer() {
            @Override
            public boolean isValid(String s) {
                return s.startsWith("a");
            }
        });
    }
}
