package classes;

/**
 * @author manoel.neto
 */
public class Livro {
    private String titulo;
    private int ano;
    private String autor;
    private String editora;
    private String serie;
    private String edicao;
    private boolean tem;

    public Livro(String titulo, int ano, String autor, String editora, String serie, String edicao, boolean tem) {
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        this.tem = tem;
        
        if(serie != null) this.serie = serie;
        else this.serie = titulo;
    }

    public Livro(String titulo, int ano, String autor, String editora, String serie, String edicao, int tem) {
        this.titulo = titulo;
        this.ano = ano;
        this.autor = autor;
        this.editora = editora;
        this.edicao = edicao;
        
        if(tem == 1) this.tem = true;
        else this.tem = false;
        
        if(serie != null) this.serie = serie;
        else this.serie = titulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAno() {
        return ano;
    }

    public String getAutor() {
        return autor;
    }

    public String getEditora() {
        return editora;
    }

    public String getSerie() {
        return serie;
    }

    public String getEdicao() {
        return edicao;
    }

    public int getTem() {
        if(isTem()) return 1;
        else return 0;
    }

    public boolean isTem() {
        return tem;
    }
}
