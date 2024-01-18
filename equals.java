public class Exemplo {
    private String nome;

    // Construtor da classe
    public Exemplo(String nome) {
        this.nome = nome;
    }

    // Sobrescrita do método equals
    @Override
    public boolean equals(Object obj) {
        // Verifica se os objetos são a mesma instância na memória
        if (this == obj) {
            return true;
        }

        // Verifica se o objeto passado é nulo ou de uma classe diferente
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Converte o objeto passado para a classe Exemplo
        Exemplo outroExemplo = (Exemplo) obj;

        // Compara o conteúdo do atributo 'nome'
        return nome.equals(outroExemplo.nome);
    }

    // Método principal para testar a classe
    public static void main(String[] args) {
        // Criação de instâncias da classe Exemplo
        Exemplo exemplo1 = new Exemplo("Java");
        Exemplo exemplo2 = new Exemplo("Java");
        Exemplo exemplo3 = new Exemplo("Python");

        // Testa a igualdade entre as instâncias usando o método equals
        System.out.println(exemplo1.equals(exemplo2));  // Saída: true
        System.out.println(exemplo1.equals(exemplo3));  // Saída: false
    }
}

