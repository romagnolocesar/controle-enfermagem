package com.romagnolocesar.controleenfermagem.modelo.Paciente;

import com.romagnolocesar.controleenfermagem.modelo.Funcionario.Funcionario;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;

@Entity
public class Paciente {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="id_paciente")
    private int id;

    private String nome;

    private String email;

    @Enumerated(EnumType.STRING)
    @Column(name = "tipo_paciente")
    private TipoPaciente tipoPaciente;

    @Temporal(TemporalType.DATE)
    @Column(name="data_cadastro")
    private Calendar dataCadastro;

    @Temporal(TemporalType.TIME)
    @Column(name="hora_cadastro")
    private Date horaCadastro;

// FIX - DECIDIDO QUE A RESPONSABILIDADE DE SABER QUE SÃO SEUS PACIENTES É DO FUNCIONARIO
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="id_funcionario")
    private Funcionario funcionario_responsavel;


    public Paciente() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Calendar getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Calendar dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public Date getHoraCadastro() {
        return horaCadastro;
    }

    public void setHoraCadastro(Date horaCadastro) {
        this.horaCadastro = horaCadastro;
    }

    public TipoPaciente getTipoPaciente() {
        return tipoPaciente;
    }

    public void setTipoPaciente(TipoPaciente tipoPaciente) {
        this.tipoPaciente = tipoPaciente;
    }

    public Funcionario getFuncionarioResponsavel() {
        return funcionario_responsavel;
    }

    public void setFuncionarioResponsavel(Funcionario funcionarioResponsavel) {
        this.funcionario_responsavel = funcionarioResponsavel;
    }
}
