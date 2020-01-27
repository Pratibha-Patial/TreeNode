 class TreeNode
{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int d)
    {
        data=d;
        left=right=null;
    }
    public static void preorder(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        System.out.println(root.data);
        preorder(root.left);
        preorder(root.right);
    }
public static void main(String args[])
{
    TreeNode root=new TreeNode(10);
    root.left=new TreeNode(20);
    root.right=new TreeNode(30);
    preorder(root);
}
}