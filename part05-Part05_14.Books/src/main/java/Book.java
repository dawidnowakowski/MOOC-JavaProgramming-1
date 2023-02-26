
public class Book {

    private String name;
    private int publicationYear;

    public Book(String name, int publicationYear) {
        this.name = name;
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
    
    @Override
    public boolean equals(Object comp){
        if(this == comp){
            return true;
        }
     
        if(!(comp instanceof Book)){
            return false;
        }
        
        Book c = (Book) comp;
        if(this.name == c.name && this.publicationYear == c.publicationYear){
            return true;
        }
        
        return false;
    }
    
    public String toString(){
        return name +" "+publicationYear;
    }

}
