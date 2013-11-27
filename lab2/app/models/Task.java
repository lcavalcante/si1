package models;

import java.util.*;

import play.db.ebean.*;
import play.data.validation.Constraints.*;

import javax.persistence.*;

@Entity
public class Task extends Model implements Comparable<Task> {

	@Id
	private Long id;

	@Required
	private String Nome;
	@Required
	private String Projeto;
	@Required
	private Integer Prioridade;

	private boolean Concluido = false;

	public static Finder<Long, Task> find = new Finder(Long.class, Task.class);

	public static List<Task> all() {
		List<Task> tarefas = new ArrayList<Task>(find.all());
		Collections.sort(tarefas);
		return tarefas;
	}

	public static void create(Task task) {
		task.save();
	}

	public static void delete(Long id) {
		find.ref(id).delete();
	}

	public static void mark(Long id) {
		Task tarefa = find.ref(id);
		tarefa.setConcluido(true);
		tarefa.update();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String descricao) {
		this.Nome = descricao;
	}

	public String getProjeto() {
		return Projeto;
	}

	public void setProjeto(String projeto) {
		this.Projeto = projeto;
	}

	public Integer getPrioridade() {
		return Prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.Prioridade = prioridade;
	}

	public boolean getConcluido() {
		return Concluido;
	}

	public void setConcluido(boolean status) {
		this.Concluido = status;
	}

	@Override
	public int compareTo(Task tarefa) {
		return getPrioridade() - tarefa.getPrioridade();
	}

}