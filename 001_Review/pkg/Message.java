package pkg;
import java.util.*;
import java.io.*;

public class Message {
	
	public String a;
	public String sub;
	public String bod;
	public int num;
	public ArrayList<Message> reply = new ArrayList<>();

	// Default Constructor
	public Message() {
		a = " ";
		sub = " ";
		bod = " ";
		num = 0;
	}
	
	// Parameterized Constructor
	public Message(String auth, String subj, String bod, int i) {
		a = auth;
		sub = subj;
		this.bod = bod;
		num = i;
	}

	// This function is responsbile for printing the Message
	// (whether Topic or Reply), and all of the Message's "subtree" recursively:

	// After printing the Message with indentation n and appropriate format (see output details),
	// it will invoke itself recursively on all of the Replies inside its childList, 
	// incrementing the indentation value at each new level.

	// Note: Each indentation increment represents 2 spaces. e.g. if indentation ==  1, the reply should be indented 2 spaces, 
	// if it's 2, indent by 4 spaces, etc. 
	public void print(int indentation, String ttl){
		if(indentation == 0){
			System.out.println("--------------------------------------------------------------------------"); 
		}
		for(int i = 0; i < indentation; i++){
			System.out.print("  ");
		}
		System.out.print("Message #" + num + ":");
		for(int i = 0; i < indentation; i++){
			System.out.print("Re:");
		}
		System.out.println("\"" + ttl + "\"");
		for(int i = 0; i < indentation; i++){
			System.out.print("  ");
		}
		System.out.print("From " + a + ": " + "\"" + bod + "\"");
		for(int i = 0; i < reply.size(); i++){
			reply.get(i).print(indentation + 1, ttl);
		}
		if(indentation == 0){
			System.out.println("\n------------------------------------------------------------------------");
		}
	}

	// Default function for inheritance
	public boolean isReply(){
		return true;
	}

	// Returns the subject String
	public String getSubject(){
		return sub;
	} 

	// Returns the ID
	public int getId(){
		return num;
	}

	// Adds a child pointer to the parent's childList.
	public void addChild(Message child){
		reply.add(child);
	}

}
