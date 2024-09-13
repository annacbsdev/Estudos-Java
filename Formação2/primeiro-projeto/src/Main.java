//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Esse é o Screen Match!");

        String nomeDoFilme = "Top Gun: Maverick";
        int anoDeLancamento = 2022;

        System.out.println("O ano de lançamento é: " + anoDeLancamento);

        boolean estaIncluidoNoPlano = true;
        double notaDoFilme = 8.1;

        double mediaDasAvaliacoes = (9.8 + 6.3 + 8.0) / 3;
        System.out.println(mediaDasAvaliacoes);

        //text blocks
        String sinopse =
            """
            Filme top Gun
            Muito bom!
            Filme de aventura com galã dos anos 80.
            Ano de lançamento:
            """ + anoDeLancamento;

        System.out.println(sinopse);

        int classificacao;
        classificacao = (int) (mediaDasAvaliacoes / 2);

    }
}