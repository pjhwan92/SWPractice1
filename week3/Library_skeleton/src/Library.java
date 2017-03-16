import java.util.Arrays;


// implement this class
public class Library {
  private String name;      // the name of this library
  private Book[] books;     // list of all books owned by this library
  private int cap;          // book capability of this library
  private int cur;          // current number of books in this library
  

  /*
   * Library(String [Library_name], int [Available number of books])
   * 
   * Constructor of Library class.
   */
  
  /*
   * String getName()
   * 
   * Return the name of this library.
   */
  
  /*
   * int getCapability()
   * 
   * Return the capability of this library.
   */
  
  /*
   * void extendCap(int [additional capability])
   * 
   * Extend the capability of this library by [additional capability].
   * 
   * Hint: recommend to use "String[] Arrays.copyOf(String[] arr)" method.
   */
  
  /*
   * boolean requestNewBook(String [name of book])
   * 
   * Add new book of [name of book].
   * Return true if success on adding book, else false.
   */
  
  /*
   * boolean requestNewBooks(String [name of book], int [# of books])
   * 
   * Add [# of books] new books of [name of book].
   * Return true if sccuess on adding all books, else false.
   * When returning false, do not add any of the books.
   */
  
  /*
   * boolean isBorrowed(String [name of book])
   * 
   * Check whether [name of book] is borrowed or not.
   * If borrowed, return true.
   * Else, return false.
   */
  
  /*
   * boolean borrow(String [name of book])
   * 
   * Find the [name of book] in library.
   * And update the status of book to be currently borrowed.
   * If success on updating, return true.
   * Else in all other cases, return false.
   */

}
