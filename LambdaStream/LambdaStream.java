package LambdaStream;

import java.util.Arrays;
import java.util.List;
import java.util.SplittableRandom;
import java.util.stream.Collectors;

public class LambdaStream {

    static int gerarIdade(int min, int max) {
        return new SplittableRandom().nextInt(min, max);
    }

    public static void main(String[] args) {

        List<String> nomes = Arrays.asList("Alice", "João", "Maria", "Pedro", "Raquel", "Samuel");

        System.out.println("Lista de nomes: ");
        nomes.forEach((n) -> System.out.println(n));

        List<Pessoa> pessoas = nomes.stream().map((n) -> new Pessoa(n, gerarIdade(15, 30)))
                .collect(Collectors.toList());

        System.out.println("Lista de pessoas: ");
        pessoas.forEach((p) -> System.out.println(p.getNome() + " " + (p.getIdade())));

        System.out.println("Lista de maiores de idade: ");
        List<Pessoa> pessoasMaioresdeIdade = pessoas.stream().filter((p) -> p.getIdade() >= 18)
                .collect(Collectors.toList());
        pessoasMaioresdeIdade.forEach((p) -> System.out.println(p.getNome() + " " + p.getIdade()));

        System.out.println("Lista Ordenada de pessoas: ");
        List<Pessoa> pessoasOrdenadas = pessoasMaioresdeIdade.stream().sorted((p1, p2) -> p1.getIdade() - p2.getIdade())
                .collect(Collectors.toList());
        pessoasOrdenadas.forEach((p) -> System.out.println(p.getNome() + " " + p.getIdade()));

        System.out.println("Soma das idades: ");
        Integer totalIdade = pessoasOrdenadas.stream().map(p -> p.getIdade()).reduce(0,
                (somaIdade, idade) -> somaIdade += idade);
        System.out.println("A soma é: " + totalIdade);
    }

}
