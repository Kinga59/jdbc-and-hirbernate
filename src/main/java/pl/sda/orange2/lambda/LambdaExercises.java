package pl.sda.orange2.lambda;

public class LambdaExercises {

    public static void main(String[] args) {
        BoysDontCry boy = new ChłopakiNiePłaczą();
        boy.silnoreki();
        ((ChłopakiNiePłaczą) boy).sing();

        ChłopakiNiePłaczą boy2 = new ChłopakiNiePłaczą();
        boy2.sing();

        BoysDontCry anonymusClassReference = new BoysDontCry() {
            @Override
            public void silnoreki() {
                System.out.println("Anonimowy Silnoręki");
            }
        };

        anonymusClassReference.silnoreki();

        //BoysDontCry = new String(" ");

        // () parenthesis - arguments list
        // -> arguments, body separator
        // {} parenthesis - method body
        BoysDontCry firstLambda = () -> {};
        BoysDontCry secondLambda = () -> System.out.println("Lambda:)");
        secondLambda.silnoreki();
        BoysDontCry thirdLambda = () -> {
            System.out.println("one");
            System.out.println("second");
        };
    }
}
