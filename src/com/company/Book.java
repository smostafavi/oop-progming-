package com.company;





//
//    Create a Book class that allows for Book title, author, description, price and isInStock variables
//
//    The Book class shall contain private member variables,
//    a default constructor,
//    an overloaded constructor
//    and a method called getDisplayText()
//    which prints the author, title and description.
//
//    The application shall also contain getters and setters for each private member variable.
//
//    Create another class called BookApp which contains the main method. In the main method you shall create an instance of a Book and print the Author, Title and Description.
//
//
//
//    Publish your solution to GitHub and submit your GitHub url as the assignment.*/




    public class Book {

        private String title;
        private String author;
        private String description;
        private double price;
        private boolean isInStock;

        public Book() {

        }

        public Book(String title, String author, String description, double price, boolean isInStock) {
            this.title = title;
            this.author = author;
            this.description = description;
            this.price = price;
            this.isInStock = isInStock;

        }
        public void settitle(String author){
           this.title=author;
}
          public String gettitle(){
              return title;

          }
        public void setAuthor(String author){
            this.author=author;
        }

        public String getAuthor(){
            return author;
        }
            public void setdescription(String description){
                this.description=description;
            }
            public String getdescription() {
                return description;
            }
        public void setprice(double price){
            this.price=price;
        }
        public double getprice() {
            return price;
        }

        public void setisInStock (boolean isInStock){
            this.isInStock=isInStock;
        }
        public boolean getisInStock(){
            return isInStock;
        }

        public String getDisplayText(){
            String a = author;
            String b = title;
            String c = description;
        return "The author is " + author + ", the title is " + title + ", the description: " + description;
    }

}


