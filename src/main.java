public class main {
    public static void main(String[] args) {
        // 1° Chamada, Informações do carro

        System.out.println("--- Criando personagem ---");
        Personagem Player1 = new Personagem("Davi", "Guerreiro", 1, 10, 10, 10, 100, 0);
        Player1.toString();

        System.out.println("--- Criando personagem 2 ---");
        Personagem Player2 = new Personagem("João", "Mago", 1, 10, 10, 10, 60, 0);
        Player2.toString();

        // Método de atacar
        Player1.atacar(Player2);

        // Ganhar experiência
        Player1.ganharExperiencia(100);
    }
}