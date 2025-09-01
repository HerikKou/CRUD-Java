
public class Produto {
    private int id;
    private String nome;
    private int quantidade;

    public Produto(Builder build) {
        this.id = build.id;
        this.nome = build.nome;
        this.quantidade = build.quantidade;
    }

    public static Builder builder(){
        return new Builder();
    }

        public static class Builder {
        private int id;
        private String nome;
        private int quantidade;

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Builder quantidade(int quantidade) {
            this.quantidade = quantidade;
            return this;
        }

        public Produto build() {
            return new Produto(this);
        }
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public int getQuantidade() {
        return quantidade;
    }
    @Override
    public String toString() {
        return "ID:" + id + "|" + "\s" + "Nome:" + nome + "|" + "\s" + "Quantidade:" + quantidade;
    }
}
