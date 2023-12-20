package draft;

public enum Book {
    ФАНТАСТИКА, ДРАММА, РОМАНТИКА;
    private static Book[] values;

    public int f() {
        Book[] books = Book.values();//метод values для перечисления значений енама
        //int[] books = {1, 2, 3, 3, 4};//метод values для перечисления значений енама
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        return 0;
    }
}
