class Library {
  private String name;
  private Book[] books;

  public Library(String name){
    this.name = name;
    this.books = new Book[10];
  }

  public String getName(){
    return this.name;
  }

  public int booksCount(){
    int count = 0;
    // For book in books
    for(Book book : books){
      // If we have set this thing to a Book()
      if(book != null){
        count++;
      }
    }
    return count;
  }

  public boolean isLibraryFull(){
      return booksCount() == books.length;
    }

  public void addBook(Book book){
    if(isLibraryFull()){
      return;
    }
    // Find the first empty index
    int booksCount = booksCount();
    // Set that array index to hold the book passed in
    books[booksCount] = book;
  }
}
