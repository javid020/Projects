package findthebomb;


public class SNode_1 <type> {
type content ;
SNode<type> next ; 

public SNode_1(){
	content = null;
	next = null;
}
	
public SNode_1(type content , SNode<type> next){
	this.content = content ; 
	this.next = next;
}

public SNode_1(type content){
	this.content = content ; 
}

public type getContent() {
	return content;
}

public void setContent(type content) {
	this.content = content;
}

public SNode<type> getNext() {
	return next;
}

public void setNext(SNode<type> next) {
	this.next = next;
}


}
