public class Filme {
    // Atributos
    public String nome;
    public int anoDeLancamento;
    public boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacao;
    public int duracaoEmMinutos;

    // Get
    public int getTotalDeAvaliacao() {
        return totalDeAvaliacao;
    }

    // Métodos
    public void exibeFichaTecnica() {
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacao++;
    }

    public double mediaDasAvaliacao() {
        return somaDasAvaliacoes / totalDeAvaliacao;
    }
}
