public class AVL_Tree {
    private class AVL_NODE{
        private int value;
        private AVL_NODE leftChild;
        private AVL_NODE rightChild;
        private int height;

        public AVL_NODE(int value){
            this.value = value;
        }
        @Override
        public  String toString(){
            return "Node = "+value;
        }
    }
    private AVL_NODE root;
    public void insert(int value){
        this.root =  insert(root,value);
    }
    private AVL_NODE insert(AVL_NODE root,int value){
        if(root == null) // BASE CASE
            return new AVL_NODE(value);
        if(value < root.value)
            root.leftChild = insert(root.leftChild,value);
        else if(value > root.value)
            root.rightChild = insert(root.rightChild,value);
        //root.height = Math.max(height(root.leftChild),height(root.rightChild))+1;
        setHeight(root);
        //balance(root);
        /*int balanceFactor = balanceFactor(root);
        if(isLeftHeavy(root))
            System.out.println(root.value+" is Left Heavy "+" Balance Factor = "+balanceFactor);
        if(isRightHeavy(root))
            System.out.println(root.value+" is Right Heavy"+" Balance Factor = "+balanceFactor)*/;
        root = balance(root);
        return root;
    }

    private int height(AVL_NODE node){
        if(node == null)
            return -1; // Height
        return node.height;
    }
    private boolean isLeftHeavy(AVL_NODE node){
        return balanceFactor(node) > 1;
    }
    private boolean isRightHeavy(AVL_NODE node){
        return balanceFactor(node) < -1;
    }
    private int balanceFactor(AVL_NODE node){
        return (node == null ) ? 0 : height(node.leftChild) - height(node.rightChild);
    }

    private AVL_NODE balance(AVL_NODE root){
        if(isLeftHeavy(root)){
            if(balanceFactor(root.leftChild) <0)
                //System.out.println("Left Rotate : "+root.leftChild.value);
                root.leftChild =  rotateLeft(root.leftChild);
            //System.out.println("Right Rotate : "+root.value);
            root = rotateRight(root);
        }
        else if(isRightHeavy(root)){
            if(balanceFactor(root.rightChild) >0)
                //System.out.println("Right Rotate : "+root.rightChild.value);
                root.rightChild =  rotateRight(root.rightChild);
            //System.out.println("Left Rotate : "+root.value);
            root = rotateLeft(root);
        }
        return root;
    }

    private AVL_NODE rotateLeft(AVL_NODE root){
        AVL_NODE newRoot = root.rightChild;
        root.rightChild = newRoot.leftChild;
        newRoot.leftChild = root;
        setHeight(root);
        setHeight(newRoot);
        return newRoot;
    }
    private AVL_NODE rotateRight(AVL_NODE root){
        AVL_NODE newRoot = root.leftChild;
        root.leftChild = newRoot.rightChild;
        newRoot.rightChild = root;
        setHeight(root);
        setHeight(newRoot);
        return newRoot;
    }

    private void setHeight(AVL_NODE node){
        node.height = Math.max(height(root.leftChild),height(root.rightChild))+1;
    }
}