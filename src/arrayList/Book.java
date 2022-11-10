public class Book implements Comparable {
    public Book(String name, String writer, int pageCount, int publishDate) {
        this.name = name;
        this.writer = writer;
        this.pageCount = pageCount;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWriter() {
        return writer;
    }

    public void setWriter(String writer) {
        this.writer = writer;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        this.pageCount = pageCount;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(int publishDate) {
        this.publishDate = publishDate;
    }

    private String name;
    private String writer;
    private int pageCount;
    private int publishDate;



    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
