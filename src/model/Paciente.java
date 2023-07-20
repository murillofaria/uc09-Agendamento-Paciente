package model;

public class Paciente {

    private String nome;
    private String telefone;
    private String cpf;
    private String dataConsulta;
    private String consultaObservacoes;
    private String ConsultaRealizada = "Não";
    private String JaPaciente = "Não";
    private String ConsultaRealizadaPermanete = "Não";

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getDataConsulta() {
        return dataConsulta;
    }

    public void setDataConsulta(String dataConsulta) {
        this.dataConsulta = dataConsulta;
    }

    public String getConsultaObservacoes() {
        return consultaObservacoes;
    }

    public void setConsultaObservacoes(String consultaObservacoes) {
        this.consultaObservacoes = consultaObservacoes;
    }

    public String getConsultaRealizada() {
        return ConsultaRealizada;
    }

    public void setConsultaRealizada(String ConsultaRealizada) {
        this.ConsultaRealizada = ConsultaRealizada;
    }

    public String getJaPaciente() {
        return JaPaciente;
    }

    public void setJaPaciente(String JaPaciente) {
        this.JaPaciente = JaPaciente;
    }

    public String getConsultaRealizadaPermanete() {
        return ConsultaRealizadaPermanete;
    }

    public void setConsultaRealizadaPermanete(String ConsultaRealizadaPermanete) {
        this.ConsultaRealizadaPermanete = ConsultaRealizadaPermanete;
    }

}
