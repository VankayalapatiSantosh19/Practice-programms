package learn_java;
import java.util.*;
public class Sort_string_by_length_using_tree {
	class node{
		String data;
		node left;
		node right;
	}
	static int nodecount=0,llength=0,rlength=0;
	static node startnode=null;
	static node left_leafnode=null;
	static node right_leafnode=null;
	public void creatnode(String a){
		node n=new node();
		n.data=a;
		if(startnode==null){
			startnode=n;
			n.left=null;
			n.right=null;
			left_leafnode=n;
			right_leafnode=n;
			llength=rlength=a.length();
			nodecount++;
		}
		else {
	        if(a.length()>right_leafnode.data.length()) {
				right_leafnode.right=n;
				n.left=right_leafnode;
			    right_leafnode=n;
		    }
			else {
			   left_leafnode.left=n;
			   n.right=left_leafnode;
			   left_leafnode=n;
	        }
			nodecount++;
	   }
	}
	public void printtree() {
		System.out.println("the number of nodes are  "+ nodecount );
		while(left_leafnode!=null) {
			System.out.println(left_leafnode.data);
			left_leafnode=left_leafnode.right;
		}
	}
	public static void main(String[] args) {
		Sort_string_by_length_using_tree t=new Sort_string_by_length_using_tree(); 
		t.creatnode("santosh");
		t.creatnode("sukan");
		t.creatnode("madhaavvvv");
		t.printtree();
	}

}
