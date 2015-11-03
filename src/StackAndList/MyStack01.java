package StackAndList;

import java.util.Stack;

public class MyStack01 {
	private Stack<Integer> stackData;
	private Stack<Integer> stackMin;

	public MyStack01() {
		stackData = new Stack<Integer>();
		stackMin = new Stack<Integer>();
	}

	public void push(int newNum) {
		this.stackData.push(newNum);
		if (this.stackMin.isEmpty()) {
			this.stackMin.push(newNum);
		} else if (this.stackMin.peek() >= newNum) {
			this.stackMin.push(newNum);
		}
	}

	public int pop()  {
	    if(this.stackData.isEmpty()){
	    	throw new RuntimeException("Õ»ÊÇ¿ÕµÄ");
	    }
	    int value = this.stackData.pop();
	    if(value==this.stackMin.peek()){
	        this.stackMin.pop();
	    }
	    return value;
	}

	public int getMin()  {
		if(this.stackMin.isEmpty()){
			throw new RuntimeException("¿ÕÁË");
		}
		return this.stackMin.peek();
	}
}
