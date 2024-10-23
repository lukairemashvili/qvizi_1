public class Ebook extends Book{
    double fileSize;
    public Ebook(String title, String author, double price, double fileSize){
        super(title,author,price);
        this.fileSize = fileSize;
    }
    public void getEbookInfo(){
        super.getBookInfo();
        if(fileSize<1024){
            System.out.println("the size of file is: " + fileSize + "kb");
        }else {
            System.out.println("the size of file is: " + fileSize + "mb");
        }
    }
}
