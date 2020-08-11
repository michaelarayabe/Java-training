package learning.lambda.demo_3;

public class App {

    public static void main(String[] args) {

        FuncInterface fun = (String s) -> System.out.println(s);

        String s = "Hello there"; //good
        fun.functionality(s);

        s = "Something different";

        FuncInterface anonFun = new FuncInterface() {

            //Scope van onze anonieme geneste klasse

            String s = "I am always overlooked";

            @Override
            public void functionality(String s) {
                s = this.s;
                System.out.println(s);
            }
        };

        anonFun.functionality(s);
        fun = d -> System.out.println(d + "changed");

        fun.functionality(s);
    }
}
