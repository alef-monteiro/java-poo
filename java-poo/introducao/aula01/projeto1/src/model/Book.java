package model;

public class Book {
    private String title;
    private String author;
    private int year;
    private String genre;
    private int pages;
    private boolean available;

    public Book(String title, String author, int year, String genre, int pages, boolean available) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.genre = genre;
        this.pages = pages;
        this.available = available;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public void LendBook (String title){
        if (available){
            available = false;
            System.out.println("LIVRO EMPRESTADO COM A SUA VÓ");
        }else{
            System.out.println("não disponivel para empretimo");
        }
    }

    public void DevolverBook (String title){
        if (!available){
            available = true;
            System.out.println("Livro Devolvido");
        }else{
            System.out.println("Livro Disponivels");
        }
    }

    public void VerifyBook (String title){
        if (available){
            System.out.println("Livro Dísponivel");
        }else{
            System.out.println("Livro Indisponivel");
        }
    }
    //Livro livro = new Livro(autor, ano, genero, paginas);

    //DevolverBook()

    public void BookInformation(String title){
        System.out.println("Autor: " + this.author + " Ano: " + this.year + " Genero: " + this.genre + " Páginas: " + this.pages);
    }
}
