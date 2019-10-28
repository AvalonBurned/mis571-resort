package com.example.resortmanagement.constant;

public abstract class SQLCommand
{
    //query all students
    public static String QUERY_STUDENT = "SELECT stid,stname FROM Student";
    //list all data in books table
    public static String QUERY_1 = "select lbcallnum, lbtitle from libbook";
    //List the call numbers of books with the title ‘Database Management’
    public static String QUERY_2 = "select lbcallnum from libbook where lbtitle like '%Database Management%'";
    //List the student names of the students who have checked out a book
    public static String QUERY_3 = "select distinct stname " +
            "from student,checkout " +
            "where student.stid = checkout.stid";
    //list ordered names of students who have not returned the book
    public static String QUERY_4 = "SELECT distinct stname\n" +
            "FROM Student,CheckOut\n" +
            "WHERE Student.stid = Checkout.stid AND coreturned = 'N'\n" +
            "ORDER BY stname";
    //list id and the number of times each book has been checked out
    public static String QUERY_5 = "SELECT lbcallnum,COUNT(lbcallnum)\n" +
            "FROM CheckOut\n" +
            "GROUP BY lbcallnum\n";
    //list title of the books which are never checked out
    public static String QUERY_6 = "SELECT distinct lbtitle FROM LibBook, CheckOut\n" +
            "WHERE LibBook.lbcallnum NOT IN\n" +
            "(SELECT CheckOut.lbcallnum FROM CheckOut)";
    //list the names of students who have ever paid a fine
    public static String QUERY_7 = "SELECT stname FROM Student,Checkout\n" +
            "WHERE Student.stid = CheckOut.stid\n" +
            "GROUP BY CheckOut.stid\n" +
            "HAVING SUM(cofine)>0";
}
