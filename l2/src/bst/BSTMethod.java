package bst;

import java.util.ArrayList;
import java.util.List;

class  Node {
	int data;
	Node left;
	Node right;
	Node(int value)
	{
		this.data=value;
	}
}


public class BSTMethod {
	
	public Node insertNode(Node node , int value) {
		
		if(node == null) {
			return new Node(value);
		}
		if(value < node.data) {
			node.left = insertNode(node.left,value);
		} else {
			node.right = insertNode(node.right,value);
		}
	
		return node;
	}
	
	
	int count = 0;
	private void sortedToBST(int start ,int end,int[] nums,int[] output) {
		
		if(start>end) {
			return;
		}
		int mid = (start+end)/2;
		
		output[count++] = nums[mid];
		
		sortedToBST(start,mid-1,nums,output);
		sortedToBST(mid+1,end,nums,output);
	
	}
	
	public int[] sortedArrayToBST(int[] arr) {
		
		int length = arr.length;
		
		int[] output = new int[length];
		
		sortedToBST(0,length-1,arr,output);
		
		return output;
	}
	

	 
	 public int minValue(Node node) {
		 if(node == null) {
			 return -1;
		 }
		 if(node.left==null) {
			 return node.data;
		 }
			 return minValue(node.left); 
	 }
	 
	 public Node lca(Node node , int n1 , int n2) {
		 if(node == null) {
			 return null;
		 }
		 
		 if(node.data > n1 && node.data > n2) {
			 return lca(node.left , n1 , n2);
		 }
		 if(node.data < n1 && node.data < n2) {
			 return lca(node.right,n1,n2);
		 }
		 return node;
	 }
	 
	 public boolean isBST(Node node) {
		 
		 if(node == null) {
			 return true;
		 }
		 
		 if(node.left!=null && node.left.data > node.data) {
			 return false;
		 }
		 if(node.right!=null && node.right.data < node.data) {
			 return false;
		 }
		 
		 if(!isBST(node.left) || !isBST(node.right)) {
			 return false;
		 }
		 return true;
	 }
	 
	 public Node constructBST(int[] arr) {
		 
		 int length = arr.length;
		 
		 Node node = null;
		 
		 for(int i = 0 ; i < length ; i++) {
			 node = insertNode(node,arr[i]);
		 }
		 preOrder(node);
		 return node;
	 }
	 
	 public void preOrder(Node node) {
		 if(node == null) {
			 return;
		 }
		 
		 System.out.print(node.data+" ");
		 preOrder(node.left);
		 preOrder(node.right);
	 }
	 
	 int sum = 0;
	 
	 List<Integer> list = new ArrayList<>();
	 public void printInOrder(Node node) {
		 if(node == null) {
			 return;
		 }
		 printInOrder(node.left);
		 list.add(node.data);
		 printInOrder(node.right);
	 }
	 

	 public int sumKElements(Node node,int k) {
		
		 if(node == null) {
			 return -1;
		 }
		 
		 printInOrder(node);
		 
		 for(int i= 0 ; i < k ; i++) {
			 sum += list.get(i);
		 }
		 return sum;
	 }
	 
	 public Node search(Node node , int k) {
		 
		 if(node == null) {
			 return null;
			 }
		 while(node!=null && node.data != k) {
			 if(k<node.data) {
				 node = node.left;
			 }else {
				 node = node.right;
			 }
		 }
		 return node;
	 }
	 
	 public Node trim(Node node,int low , int high) {
		 if(node == null) {
			 return null;
		 }
		 if(node.data >= low && node.data  <= high) {
			 node.left = trim(node.left,low,high);
			 node.right = trim(node.right,low,high);
		 }
		 else if(node.data < low) {
			 node = trim(node.right , low, high);
		 }
		 else if(node.data > high) {
			 node = trim(node.left , low , high);
		 }
		 return node;
	 }
}
