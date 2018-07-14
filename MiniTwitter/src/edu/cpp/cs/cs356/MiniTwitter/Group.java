package edu.cpp.cs.cs356.MiniTwitter;

import java.util.ArrayList;
import java.util.List;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 * Thanh T Doan
 * CS 356
 * Prof: Yu Sun
 * Project 2
 */

public class Group implements Tree{

    private String ID;
    private boolean property;
    private List<User> users = new ArrayList();
    private static DefaultMutableTreeNode root;

    private int totalGroups = 0;

    public Group() {
        root = new DefaultMutableTreeNode("Root");
        totalGroups++;
    }

    public Group(String ID) {
        this(ID, true);
        totalGroups++;
    }

    public Group(String ID, boolean property) {
        this.property = property;
        this.ID = ID;
        totalGroups++;
    }

    public int getTotalGroups() {
        return totalGroups;
    }

    public DefaultMutableTreeNode getRoot() {
        return root;
    }

    @Override
    public String getID() {
        return ID;
    }

    @Override
    public boolean isProperty() {
        return property;
    }
    
    @Override
    public String toString() {
        return ID;
    }
}
