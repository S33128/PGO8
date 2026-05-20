public class LibraryAccount {
    private String readerName;
    private int borrowedBooks;
    private int lateDays;
    public LibraryAccount(String readerName, int borrowedBooks, int lateDays) {
        this.readerName = readerName;
        this.borrowedBooks = borrowedBooks;
        this.lateDays = lateDays;
    }
    public String getReaderName() {
        return readerName;
    }

    public class FineCalculator{
        public double calculate(){
            return borrowedBooks * lateDays * 1.5;
        }
    }
}
