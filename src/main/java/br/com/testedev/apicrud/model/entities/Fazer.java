package br.com.testedev.apicrud.model.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Entity(name = "fazer")
public class Fazer implements Serializable {

    private static final long serialVersionUID = 1L;
    @GenericGenerator(name = "sq_fazer", strategy = "org.hibernate.id.enhanced.SequenceStyleGenerator", parameters = {@Parameter(name = "sequence_name", value = "sq_fazer"), @Parameter(name = "initial_value", value = "1"), @Parameter(name = "increment_size", value = "1")})
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sq_fazer")
    private Integer id;
    private String titulo;
    private String descricao;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date dataParaFinalizar;
    private Boolean finalizado = false;

    public Fazer() {
    }

    public Fazer(String titulo, String descricao, Date dataParaFinalizar, Boolean bool) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.dataParaFinalizar = dataParaFinalizar;
        this.finalizado = bool;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataParaFinalizar() {
        return dataParaFinalizar;
    }

    public void setDataParaFinalizar(Date dataParaFinalizar) {
        this.dataParaFinalizar = dataParaFinalizar;
    }

    public Boolean getFinalizado() {
        return finalizado;
    }

    public void setFinalizado(Boolean finalizado) {
        this.finalizado = finalizado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Fazer)) return false;
        Fazer fazer = (Fazer) o;
        return Objects.equals(getId(), fazer.getId()) && Objects.equals(getTitulo(), fazer.getTitulo()) && Objects.equals(getDescricao(), fazer.getDescricao()) && Objects.equals(getDataParaFinalizar(), fazer.getDataParaFinalizar()) && Objects.equals(getFinalizado(), fazer.getFinalizado());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId(), getTitulo(), getDescricao(), getDataParaFinalizar(), getFinalizado());
    }

}
