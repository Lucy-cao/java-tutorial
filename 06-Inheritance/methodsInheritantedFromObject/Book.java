package methodsInheritantedFromObject;

public class Book {
    String ISBN;

    public Book(String ISBN) {
        this.ISBN = ISBN;
    }

    public String getISBN() {
        return ISBN;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Book)
            return ISBN.equals(((Book) obj).getISBN());
        else
            return false;
    }

    public static void main(String[] args) {
        Book firstBook = new Book("1022980");
        Book secondBook = new Book("1022980");
        if (firstBook.equals(secondBook))
            System.out.println("firstBook is equal to secondBook");
        else
            System.out.println("firstBook is not equal to secondBook");

        System.out.println("判断Hashcode: " + (firstBook.hashCode() == secondBook.hashCode()));
        /*
         * 如果在Book类中重写了equals方法，那么输出：firstBook is equal to secondBook
         * 如果在Book类中没有重写equals方法，那么输出：firstBook is not equal to secondBook
         */
    }
}
