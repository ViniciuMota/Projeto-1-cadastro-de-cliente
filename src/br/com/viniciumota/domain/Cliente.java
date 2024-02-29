import java.util.Objects;

public class Cliente {
    private String nome;
    private Long cpf;
    private Long tel;
    private String end;
    private Integer numero;
    private String cidade;
    private String estado;

    public Cliente(String nome, java.lang.Long cpf, java.lang.Long tel, String end, java.lang.Integer numero, String cidade, String estado) {
        this.nome = nome;
        this.cpf = cpf;
        this.tel = tel;
        this.end = end;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public java.lang.Long getCpf() {
        return cpf;
    }

    public void setCpf(java.lang.Long cpf) {
        this.cpf = cpf;
    }

    public java.lang.Long getTel() {
        return tel;
    }

    public void setTel(java.lang.Long tel) {
        this.tel = tel;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public java.lang.Integer getNumero() {
        return numero;
    }

    public void setNumero(java.lang.Integer numero) {
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        if (!super.equals(object)) return false;
        Cliente cliente = (Cliente) object;
        return Objects.equals(cpf, cliente.cpf);
    }

    public int hashCode() {
        return Objects.hash(super.hashCode(), cpf);
    }
}
