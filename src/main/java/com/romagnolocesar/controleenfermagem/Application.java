package com.romagnolocesar.controleenfermagem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {
        "com.romagnolocesar.main.java.controleenfermagem.modelo"
})
@EnableJpaRepositories(basePackages = {
        "com.romagnolocesar.main.java.controleenfermagem.repositorio"
})
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}

//public class App {
//    public static void main(String[] args){
//        EntityManagerFactory factory = Persistence.createEntityManagerFactory("controleEnfermagem");
//        EntityManager eManager = factory.createEntityManager();
//
//        Funcionario funcionario = new Funcionario();
//        funcionario.setNome("Enfermeiro");
//        funcionario.setStatusFuncionario(StatusFuncionario.ATIVO);
//
//
//        Paciente paciente = new Paciente();
//        paciente.setNome("César");
//        paciente.setEmail("cesar.romagnolo@gmail.com");
//        paciente.setDataCadastro(Calendar.getInstance());
//        paciente.setHoraCadastro(Calendar.getInstance().getTime());
//        paciente.setTipoPaciente(TipoPaciente.UTI);
//        paciente.setFuncionarioResponsavel(funcionario);
//
//        Paciente paciente2 = new Paciente();
//        paciente2.setNome("Janaina");
//        paciente2.setEmail("janaina.engenharia1@gmail.com");
//        paciente2.setDataCadastro(Calendar.getInstance());
//        paciente2.setHoraCadastro(Calendar.getInstance().getTime());
//        paciente2.setTipoPaciente(TipoPaciente.EMERGENCIA);
//        paciente2.setFuncionarioResponsavel(funcionario);
//
//        List<Paciente> pacientes = new ArrayList<>();
//        pacientes.add(paciente);
//        pacientes.add(paciente2);
//        funcionario.setPacientes(pacientes);
//
////        PROCEDIMENTOS
//        Procedimento procedimento = new Procedimento();
//        procedimento.setNome("Medir Temperatura");
//        procedimento.setDescricao("Usar termometro para medir temperatura do paciente");
//        procedimento.setFuncionario_responsavel(funcionario);
//        procedimento.setStatusProcedimento(StatusProcedimento.ATRASADO);
//        procedimento.setPaciente(paciente);
//
//        Procedimento procedimento2 = new Procedimento();
//        procedimento2.setNome("Dar Dipirona");
//        procedimento2.setDescricao("Dar 10mg de dipirona na veia");
//        procedimento2.setFuncionario_responsavel(funcionario);
//        procedimento.setStatusProcedimento(StatusProcedimento.AGUARDANDO);
//        procedimento2.setPaciente(paciente);
//
//
//
//        eManager.getTransaction().begin();
//        eManager.persist(funcionario);
//        eManager.persist(paciente);
//        eManager.persist(procedimento);
//        eManager.persist(paciente2);
//        eManager.persist(procedimento2);
//        eManager.getTransaction().commit();
//        eManager.close();
//    }
//}

