/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dawid
 */
public class Book {
    private String author;
    private String title;
    private int pageCount;
    
    public Book(String auth, String titl, int pages){
        author = auth;
        title = titl;
        pageCount = pages;
    }
    
    public String getAuthor(){
        return author;
    }
    
    public String getName(){
        return title;
    }
    
    public int getPages(){
        return pageCount;
    }
    
    public String toString(){
        return author + ", " + title + ", " + pageCount + " pages";
    }
    
}
