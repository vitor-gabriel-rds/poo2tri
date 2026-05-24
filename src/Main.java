import modelos.Guerreiro;

public class Main {
    public static void main(String[] args) {
        Guerreiro g1 = new Guerreiro("Thorin", 5, 120, "Machado");
        Guerreiro g2 = new Guerreiro("Aragorn", 6, 150, "Espada");

        System.out.println("--- Testando os Ataques ---");
        g1.atacar();
        g1.atacar(45);
        g1.atacar(60, "Orc");

        System.out.println("\n--- Comparação de Vida ---");
        if (g1.getPontosDeVida() > g2.getPontosDeVida()) {
            System.out.println(g1.getNome() + " está com mais vida.");
        } else if (g2.getPontosDeVida() > g1.getPontosDeVida()) {
            System.out.println(g2.getNome() + " está com mais vida.");
        } else {
            System.out.println("Ambos estão empatados.");
        }
    }
}