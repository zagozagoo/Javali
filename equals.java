public class Exemplo {
    private String nome;

    public Exemplo(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;  // Mesma instância na memória
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;  // Tipos diferentes ou objeto nulo
        }

        Exemplo outroExemplo = (Exemplo) obj;
        return nome.equals(outroExemplo.nome);
    }

    public static void main(String[] args) {
        Exemplo exemplo1 = new Exemplo("Java");
        Exemplo exemplo2 = new Exemplo("Java");
        Exemplo exemplo3 = new Exemplo("Python");

        System.out.println(exemplo1.equals(exemplo2));  // Saída: true
        System.out.println(exemplo1.equals(exemplo3));  // Saída: false
    }
}
