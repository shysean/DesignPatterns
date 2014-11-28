package com.sean.designpatterns.memento;public class Original {	private String name;	private int id;		public Memento createMemento() {		Memento memento = new Memento(this.name, this.id);		return memento;	}		public void recoverMemento(Memento memento)	{		this.name = memento.getName();		this.id = memento.getId();	}		public String toString()	{		return this.id+ ":" + name;	}		public String getName() {		return name;	}	public void setName(String name) {		this.name = name;	}	public int getId() {		return id;	}	public void setId(int id) {		this.id = id;	}}