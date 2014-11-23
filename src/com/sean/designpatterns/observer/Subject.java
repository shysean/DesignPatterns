package com.sean.designpatterns.observer;import java.util.ArrayList;import java.util.List;public class Subject {	private List<Oberver> oberverList = new ArrayList<Oberver>();		public void attach(Oberver oberver)	{		this.oberverList.add(oberver);	}		public void detach(Oberver oberver)	{		this.oberverList.remove(oberver);	}		public void notifyObservers()	{		for(Oberver oberver : this.oberverList)		{			oberver.update(this);		}	}			}