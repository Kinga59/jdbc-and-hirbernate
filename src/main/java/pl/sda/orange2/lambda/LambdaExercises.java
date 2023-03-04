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

    }
}
