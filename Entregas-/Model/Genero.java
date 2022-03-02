package Model;

public class Genero {
    private Long idGenero;
    private String nomeGenero;

    public Genero(Long idGenero, String nomeGenero) {
        this.idGenero = idGenero;
        this.nomeGenero = nomeGenero;
    }

    public Genero() {
    }

    public Genero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }

    public Long getIdGenero() {
        return idGenero;
    }

    public void setIdGenero(Long idGenero) {
        this.idGenero = idGenero;
    }

    public String getNomeGenero() {
        return nomeGenero;
    }

    public void setNomeGenero(String nomeGenero) {
        this.nomeGenero = nomeGenero;
    }

    @Override
    public String toString() {
        return "Genero{" +
                "idGenero=" + idGenero +
                ", nomeGenero='" + nomeGenero + '\'' +
                '}';
    }
}
