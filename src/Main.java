public class Main {

    public static void main(String[] args) {
        Author authorName1 = new Author("Haruko", "Ichikawa");
        Author authorName2 = new Author("Tite", "Kubo");
        Book bookTitle1 = new Book("Land of the lustrous", 2012, authorName1);
        Book bookTitle2 = new Book("BLEACH", 2001, authorName2);
        System.out.println("Book title: " + bookTitle1.getBookTitle() + ". Author's name: " + authorName1.getFirstName() + " " + authorName1.getSurname() + ". Publication year: " + bookTitle1.getPublishingYear() + ".");
        bookTitle1.setPublishingYear(2022);
        System.out.println("Publication year: " + bookTitle1.getPublishingYear() + ".");
        System.out.println("Book title: " + bookTitle2.getBookTitle() + ". Author's name: " + authorName2.getFirstName() + " " + authorName2.getSurname() + ". Publication year: " + bookTitle2.getPublishingYear() + ".");
        bookTitle2.setPublishingYear(2016);
        System.out.println("Publication year: " + bookTitle2.getPublishingYear() + ".");
    }
}
