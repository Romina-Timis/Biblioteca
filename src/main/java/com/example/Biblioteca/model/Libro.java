package com.example.Biblioteca.model;


import jakarta.persistence.*;

@Entity
@Table(name = "libri")
public class Libro {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titolo;
    private String autore;
    private int annoPubblicazione;
    
    @Enumerated(EnumType.STRING)
    private StatoLettura statoLettura;

    // Costruttori
    public Libro() {}

    public Libro(String titolo, String autore, int annoPubblicazione, StatoLettura statoLettura) {
        this.titolo = titolo;
        this.autore = autore;
        this.annoPubblicazione = annoPubblicazione;
        this.statoLettura = statoLettura;
    }

    // Getter e Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitolo() { return titolo; }
    public void setTitolo(String titolo) { this.titolo = titolo; }
    public String getAutore() { return autore; }
    public void setAutore(String autore) { this.autore = autore; }
    public int getAnnoPubblicazione() { return annoPubblicazione; }
    public void setAnnoPubblicazione(int annoPubblicazione) { this.annoPubblicazione = annoPubblicazione; }
    public StatoLettura getStatoLettura() { return statoLettura; }
    public void setStatoLettura(StatoLettura statoLettura) { this.statoLettura = statoLettura; }
}
