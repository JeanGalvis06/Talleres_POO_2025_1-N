public class Libro{

    private String titulo;
    private String autor;
    private int numeroPaginas;
       
    public Libro() {
        this.titulo = "default book";
    }
    
    public Libro(String titulo, String autor, int numeroPaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }
    
    @Override
    public String toString() {
        String libro;
        libro = "Libro : " + " Titulo: " + this.titulo + ", " +
                " Autor: " + this.autor + ", " + " Numero de Pagina: " + this.numeroPaginas;
    
        return libro;
    }
    
    public String getTitulo() {
        return titulo;
    }
    
    
    public String getAutor() {
        return autor;
    }
    
       
    public int getNumeroPaginas() {
        return numeroPaginas;
    }
    
    
}