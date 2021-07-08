package question2;
import java.util.Stack;

public class Caretaker {
    private Stack<Memento> savedStates = new Stack<Memento>();
    
    public void addMemento(Memento mem) {
        savedStates.push(mem);
    }
    
    public Memento getMemento() {
        return savedStates.pop();
    }
    
    public Memento seeMemento() {
        return savedStates.peek();
    }
    
    public boolean isEmpty(){
        return savedStates.empty();
    }
}