package com.mcnz.rps;

public class GameSummary {

	String clientGesture;
	String serverGesture;
	String result;
	java.util.Date date;
	
	public String getClientGesture() {
		return clientGesture;
		//return "bogus";
	}

	public String getServerGesture() {
		return serverGesture;
		//return "bogus";
	}

	public String getResult() {
		return result;
		//return "bogus";
	}

	public java.util.Date getDate() {
		return date;
	}
	
	public GameSummary() {};

	public GameSummary(String clientGesture, String serverGesture, String result) {
		super();
		this.clientGesture = clientGesture;
		this.serverGesture = serverGesture;
		this.result = result;
		date = new java.util.Date();
	}
	@Override
	public String toString() {
		return "GameSummary [clientGesture=" + clientGesture
				+ ", serverGesture=" + serverGesture + ", result=" + result
				+ ", date=" + date + "]";
	}
	
	
}