package Model;

import java.time.LocalDateTime;

public abstract class AbstractEntity {
    private Long Id;
    private LocalDateTime cadastroData;
    private LocalDateTime atualizacaoData;
    private LocalDateTime exclucaoData;

    public AbstractEntity(LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData) {
        this.cadastroData = cadastroData;
        this.atualizacaoData = atualizacaoData;
        this.exclucaoData = exclucaoData;
    }

    public AbstractEntity(Long id, LocalDateTime cadastroData, LocalDateTime atualizacaoData, LocalDateTime exclucaoData) {
        Id = id;
        this.cadastroData = cadastroData;
        this.atualizacaoData = atualizacaoData;
        this.exclucaoData = exclucaoData;
    }

    public AbstractEntity() {
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public LocalDateTime getCadastroData() {
        return cadastroData;
    }

    public void setCadastroData(LocalDateTime cadastroData) {
        this.cadastroData = cadastroData;
    }

    public LocalDateTime getAtualizacaoData() {
        return atualizacaoData;
    }

    public void setAtualizacaoData(LocalDateTime atualizacaoData) {
        this.atualizacaoData = atualizacaoData;
    }

    public LocalDateTime getExclucaoData() {
        return exclucaoData;
    }

    public void setExclucaoData(LocalDateTime exclucaoData) {
        this.exclucaoData = exclucaoData;
    }

    @Override
    public String toString() {
        return "AbstractEntity{" +
                "Id=" + Id +
                ", cadastroData=" + cadastroData +
                ", atualizacaoData=" + atualizacaoData +
                ", exclucaoData=" + exclucaoData +
                '}';
    }
}
