import java.util.Stack;

public class Tree {
	private Node root; // first node of tree

	public Tree() { // constructor
		root = null; // no nodes in tree yet
	}

	public Node find(int key) { // find node with given key
	 // (assumes non-empty tree)
		Node current = root; // start at root
		while (current.iData != key) { // while no match;
		
			if (key < current.iData) { // go left ?
			
				current = current.leftChild;
			} else {// or go right?
			
				current = current.rightChild;
			}
			if (current == null) { // if no child, did't find it.
				return null;
			}
		} // end while()
		return current; // found it
	} // end find()

	public void insert(int id, double dd) {
		Node newNode = new Node(); // make new node
		newNode.iData = id; // insert data
		newNode.dData = dd;
		
		if (root == null) { // no node in root
			root = newNode;
		} else {
			Node current = root; // start at root
			Node parent;
			while (true) {
				parent = current;
				if (id < current.iData) { // go left?
					current = current.leftChild;
					if (current == null) { // if end of the line
						parent.leftChild = newNode;
						return;
					}
				} // end if go left
				else { // or go right?
					current = current.rightChild;
					if (current == null) { // if end of the line
						parent.rightChild = newNode; // insert on right
						return;
					}
				} // end else go right
			} // end while
		} // end else not root
	} // end insert()

	public boolean delete(int key) { // delete node with given key
										// (assumes non-empty list)
		Node current = root;
		Node parent = root;
		boolean isLeftChild = true;

		while (current.iData != key) { // search for key
			parent = current;
			if (key < current.iData) { // go left
				isLeftChild = true;
				current = current.leftChild;
			} else { // or go right
				isLeftChild = false;
				current = current.rightChild;
			}

			if (current == null) { // end of the line
				return false;
			}
		} // end while

		// found node to delete, it is just a matter of deleting it from this
		// point on

		// if it has no children, simply delete it
		if (current.leftChild == null && current.rightChild == null) {
			if (current == root) { // if root,
				root = null; // tree is empty
			} else if (isLeftChild) {
				parent.leftChild = null; // disconnect from parent
			} else {
				parent.rightChild = null; // disconnect from parent
			}
		}

		// if no right child, replace with left subtree
		else if (current.rightChild == null) {
			if (current == root) {
				root = current.leftChild;
			} else if (isLeftChild) {
				parent.leftChild = current.leftChild;
			} else {
				parent.rightChild = current.leftChild;
			}
		}
		// if no left child, replace with right subtree
		else if (current.leftChild == null) {
			if (current == root) {
				root = current.rightChild;
			} else if (isLeftChild) {
				parent.leftChild = current.rightChild;
			} else {
				parent.rightChild = current.rightChild;
			}
		} else { // two children
			// get successor of node to delete (current)
			Node successor = getSuccessor(current);
			// connect parent of current to successor instead
			if (current == root) {
				root = successor;
			} else if (isLeftChild) {
				parent.leftChild = successor;
			} else {
				parent.rightChild = successor;
			}
			// connect successor to current's left child
			successor.leftChild = current.leftChild;
		} // end else two children

		// (successor cannot have a left child)
		return true;
	} // end of delete

	// returns node with next-highest value after delNode
	// goes to right child then right child's left descendants
	private Node getSuccessor(Node delNode) {
		Node successorParent = delNode;
		Node successor = delNode;
		Node current = delNode.rightChild; // go to right child
		while (current != null) { // until no more left children
			successorParent = successor;
			successor = current;
			current = current.leftChild; // go to left child
		}

		if (successor != delNode.rightChild) { // if successor not right child,
												// make connections
			successorParent.leftChild = successor.rightChild;
			successor.rightChild = delNode.rightChild;
		}
		return successor;
	}

	public void traverse(int traverseType) {
		switch (traverseType) {
		case 1:
			System.out.print("\nPreorder Traversal: ");
			preOrder(root);
			break;
		case 2:
			System.out.print("\nInorder Traversal: ");
			inOrder(root);
			break;
		case 3:
			System.out.println("\nPostorder Traversal: ");
			postOrder(root);
			break;
		}
		System.out.println();
	}

	private void preOrder(Node localRoot) {
		if (localRoot != null) {
			System.out.print(localRoot.iData + " ");
			preOrder(localRoot.leftChild);
			preOrder(localRoot.rightChild);
		}
	}

	private void inOrder(Node localRoot) {
		if (localRoot != null) {
			inOrder(localRoot.leftChild);
			System.out.print(localRoot.iData + " ");
			inOrder(localRoot.rightChild);
		}
	}

	private void postOrder(Node localRoot) {
		if (localRoot != null) {
			postOrder(localRoot.leftChild);
			postOrder(localRoot.rightChild);
			System.out.print(localRoot.iData + " ");
		}
	}

	public void displayTree() {
		Stack<Node> globalStack = new Stack<Node>();
		globalStack.push(root);
		int nBlanks = 32;
		boolean isRowEmpty = false;
		System.out.println("--------------------------------------------------");
		while (isRowEmpty == false) {
			Stack<Node> localStack = new Stack<Node>();
			isRowEmpty = true;

			for (int j = 0; j < nBlanks; j++) {
				System.out.print(" ");
			}

			while (globalStack.isEmpty() == false) {
				Node temp = globalStack.pop();
				if (temp != null) {
					System.out.print(temp.iData);
					localStack.push(temp.leftChild);
					localStack.push(temp.rightChild);

					if (temp.leftChild != null || temp.rightChild != null) {
						isRowEmpty = false;
					}
				} else {
					System.out.print("  ");
					localStack.push(null);
					localStack.push(null);
				}

				for (int j = 0; j < nBlanks * 2 - 2; j++) {
					System.out.print(" ");
				}
			} // end while globalStack not empty
			System.out.println();
			nBlanks /= 2;
			while (localStack.isEmpty() == false) {
				globalStack.push(localStack.pop());
			}
		} // end while isRowEmpty is false
		System.out.println("---------------------------------------------------");
	} // end displayTree()
	
	public Node minimum() {
		Node current;
		Node last = null;
		current = root;
		while (current != null) {
			last = current;
			current = current.leftChild;
		}
		return last;
	}

	public Node maximum() {
		Node current;
		Node last = null;
		current = root;
		while (current != null) {
			last = current;
			current = current.rightChild;
		}
		return last;
	}
} // end class Tree
