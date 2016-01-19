package com.clockwork.exercise;

public class Step {
	private final int fromPeg;
	private final int toPeg;
	
	public Step(int from, int to) {
		this.fromPeg = from;
		this.toPeg = to;
	}
	
	public int getFromPeg() {
		return fromPeg;
	}
	
	public int getToPeg() {
		return toPeg;
	}
	
	@Override
	public boolean equals(Object obj) {
		Step other = (Step)obj;
		return other.getFromPeg() == this.getFromPeg() && other.getToPeg() == this.getToPeg();
	}
}
