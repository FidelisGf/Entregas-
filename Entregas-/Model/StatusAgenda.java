package Model;


public enum StatusAgenda {
    Aprovado("Aprovado"),Cancelado("Cancelado"),Rejeitado("Rejeitado"),
    Compareceu("Compareceu"),NaoCompareceu("Nao Compareceu"),Pendente("Pendente");
    private String sts;
    StatusAgenda(String sts) {
        this.sts = sts;
    }
    public String getSts() {
        return sts;
    }
    public void setSts(String sts) {
        this.sts = sts;
    }
}
