public class Libro {
    private int Codigo_ISBN;
    private String titulo,autor, editorial, categoria;

    public int getCodigo_ISBN() {
        return Codigo_ISBN;
    }

    public void setCodigo_ISBN(int codigo_ISBN) {
        Codigo_ISBN = codigo_ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}
