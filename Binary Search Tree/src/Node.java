
public class Node {
	
	public int iData;		// data item (key)
	public double dData;	// data item
	
	public Node leftChild;		// this node's left child
	public Node rightChild;		// this node's right child
	
	public void displayNode() 	// display ourselves
	{
		System.out.print(iData);
		System.out.print(", ");
		System.out.print(dData);
	}
}
