package com.sean.designpatterns.command;public class ConcreteCommand implements Command {	/**	 * 持有相应的接受者对象	 */	private Receiver receiver = null;		/**	 * 构造方法	 */	public ConcreteCommand(Receiver receiver) {		this.receiver = receiver;	}	@Override	public void execute() {		receiver.action();	}}