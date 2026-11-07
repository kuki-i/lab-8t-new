package ua.opnu;

public class BookData implements Comparable<BookData> {
    private String title;
    private String author;
    private int reviews;
    private double total;

    public BookData(String title) {
    this.title=title;
    }
    public String getTitle(){
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }

    public int getReviews(){
        return reviews;
    }
    public void setReviews(int reviews) {
        this.reviews = reviews;
    }

    public double getTotal(){
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }

    public double getRating() {
        if (reviews == 0){
            return 0.0;
        }
        else {
            return total/reviews;
        }
    }

    @Override
    public int compareTo(BookData other) {

        double myRating = this.getRating();
        double otherRating = other.getRating();

        int ratingComparison = Double.compare(otherRating, myRating);

        if (ratingComparison != 0) {
            return ratingComparison;
        } else {
            return this.title.compareTo(other.title);
        }
    }

}
