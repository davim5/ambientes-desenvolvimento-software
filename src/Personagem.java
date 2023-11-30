public class Personagem {
    private String nome;
    private String classe;
    private int level;
    private int força;
    private int velocidade;
    private int inteligencia;
    private int pontosDeVida;
    private int experiencia;

    public Personagem(String nome, String classe, int level, int força, int velocidade, int inteligencia, int pontosDeVida, int experiencia) {
        this.nome = nome;
        this.classe = classe;
        this.level = level;
        this.força = força;
        this.velocidade = velocidade;
        this.inteligencia = inteligencia;
        this.pontosDeVida = pontosDeVida;
        this.experiencia = experiencia;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public String getClasse() {
        return classe;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getLevel() {
        return level;
    }

    public void setForça(int força) {
        this.força = força;
    }

    public int getForça() {
        return força;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public void atacar(Personagem alvo) {
        System.out.println(nome + " está atacando " + alvo.getNome());
        alvo.receberDano(força);
    }

    public void receberDano(int dano) {
        pontosDeVida -= dano;
        System.out.println(nome + " recebeu " + dano + " de dano");
        if (pontosDeVida <= 0) {
            System.out.println(nome + " morreu");
        }
    }

    public void ganharExperiencia(int experiencia) {
        this.experiencia += experiencia;
        System.out.println(nome + " ganhou " + experiencia + " de experiência");   
        if(this.experiencia >= (100 * level)) {
            subirDeLevel();
            this.experiencia = 0;
        }
    }

    public void subirDeLevel() {
        level++;
        System.out.println(nome + " subiu para o level " + level);
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "\nClasse: " + classe + "\nLevel: " + level + "\nForça: " + força + "\nVelocidade: " + velocidade + "\nInteligência: " + inteligencia;
    }
}
