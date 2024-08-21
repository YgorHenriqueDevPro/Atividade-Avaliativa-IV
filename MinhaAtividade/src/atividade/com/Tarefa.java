package atividade.com;

public class Tarefa {

	String titulo;
	String descricao;
	boolean concluida;

	public Tarefa(String titulo, String descricao, boolean concluida) {
		this.titulo = titulo;
		this.descricao = descricao;
		this.concluida = concluida;

	}

	public String toString() {
		return "Tarefa [titulo=" + titulo + ", descricao=" + descricao + ", concluida=" + concluida + "]";
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

	public boolean isConcluida() {
		return concluida;
	}

	public void setConcluida(boolean concluida) {
		this.concluida = concluida;
	}

}
