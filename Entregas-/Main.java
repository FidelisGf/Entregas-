import Model.Agenda;
import Repository.AgendaDAO;
import Repository.MedicoDAO;
import Repository.PacienteDAO;
import Repository.SecretariaDAO;

public class Main {
    public static void main(String[] args) {
        AgendaDAO agendaDAO = new AgendaDAO();
        Agenda agenda = new Agenda();
        agenda = agendaDAO.verConsulta(1);
        System.out.println("\nPaciente " + agenda.getPaciente().getNome() + "\nMedico " + agenda.getMedico().getNome()
        + "\nSecretaria : " + agenda.getSecretaria().getNome() + "\nStatus do Agendamento : " + agenda.getStatusAgenda().getSts() +
                "\nDtAgendamento :" + agenda.getDataAgenda());

    }
}
