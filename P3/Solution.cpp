#include <iostream>
#include <vector>
using namespace std;

/**
 Definitions:

 Tree is a data structure consisting of nodes. Each node can be a parent or a child node.
 Root is a special node in a tree where it has no parent and may or may not have a child node.
 Leaves are special nodes in a tree where it has a parent but doesn't have any child node.

 It would be helpful to study Trees (Data Structure) to follow this solution.

**/
// Define the structure for a tree node
struct TreeNode {
    long long data;
    TreeNode* left;
    TreeNode* right;

    // Constructor to initialize a node
    TreeNode(long long value) : data(value), left(nullptr), right(nullptr) {}
};

// Define the largest prime factor initially as 1
long largestLeaf=1;

// Function to insert a new/child node into the tree/parent node
TreeNode* insertNode(TreeNode* root, long long value, int ident) {

    // Inserts value if current node address is empty (tree is empty; value will be the root)
    if (root == nullptr) {
        return new TreeNode(value);
    }

    // Insert to left if identifier is 0 else insert to the right
    if (ident == 0) {
        root->left = insertNode(root->left, value, ident);
    } else {
        root->right = insertNode(root->right, value, ident);
    }

    return root;
}

// Function to check if value is
bool isPrime(long long a) {

    // Loop from 2-a and check if value can be divided by any number less than of it.
    for (long long i=2; i< a; i++) {
        if (a%i == 0) {
            return false;
        }
    }

    // If no value is divisible, then the number is prime
    return true;
}

// Define a helper function.
void helper(TreeNode* root);

// Function getLeaf retrieves all leaves in the tree.
void getLeaf(TreeNode* root){
    
    // Current node is empty
    if(root == nullptr) {
        return;
    }

    // Check if the current node is a leaf
    if (root->left == nullptr && root->right == nullptr) {
        
        // If the current node is prime,
        if (isPrime(root->data)) {
            // Do nothing
        }
        else {
            // Else call helper function for further breakdown.
            helper(root);
        }
    }

    getLeaf(root->left);        // Check left child
    getLeaf(root->right);       // Check right child
}

// Function helper converts a non-prime child into a parent by inserting child nodes.
void helper(TreeNode* root) {

    // Loop from 2-node value and check if value can be divided by any number less than of it.
    for (long int i=2; i< root->data; i++) {
        if(root->data%i == 0) {
            
            // The node/i is a factor of node value, and can be inserted to the left.
            insertNode(root, root->data/i, 0);

            // The i is a factor of node value, and can be inserted to the right
            insertNode(root, i, 1);

            break;
        }
    }

    // Retrieve the new set of leaves in the updated tree.
    getLeaf(root);
}


// Function printLeaves aids for checking if leaves are indeed prime factors of the number
void printLeaves(TreeNode* root) {
    
    // Empty node
    if(root == nullptr) {
        return;
    }

    // Check if the current node is a leaf
    if (root->left == nullptr && root->right == nullptr) {
        cout << root->data << " ";  // Print the leaf value
    }

    // Recursively print leaves in the left and right subtrees
    printLeaves(root->left);
    printLeaves(root->right);
}


// Function getLargestLeaf traverses the trees and compares the value of each leaf
void getLargestLeaf(TreeNode* root) {
    if(root == nullptr) {
        return;
    }

    // Check if the current node is a leaf
    if (root->left == nullptr && root->right == nullptr) {

        // Update the largestLeaf variable if current node value is higher
        root->data > largestLeaf ? largestLeaf=root->data : largestLeaf;
    }

    // Recursively print leaves in the left and right subtrees
    getLargestLeaf(root->left);
    getLargestLeaf(root->right);
}

int main() {
    // Create an empty tree
    TreeNode* root = nullptr;

    // Insert nodes into the tree
    root = insertNode(root, 600851475143, 0);     //insert 600851475143 as root node   
    
    helper(root);
    
    // To aid solution visualization, display list of prime factor of the tree.
    printLeaves(root);
    
    // Display the largest prime factor.
    getLargestLeaf(root);
    cout << "\nThe largest leaf is : " << largestLeaf << "\n";

    return 0;
}