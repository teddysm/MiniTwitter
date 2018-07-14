package edu.cpp.cs.cs356.MiniTwitter;

/**
 * Thanh T Doan
 * CS 356
 * Prof: Yu Sun
 * Project 2
 */

public interface ButtonVisitor {
    
    public void userTotalVisit(User user);

    public void totalMessagesVisit(User user);
    
    public void groupTotalVisit(Group group);
    
    public void positivePercentageVisit(User user);

}