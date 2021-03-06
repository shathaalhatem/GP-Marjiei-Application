/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Shatha Suliman
 */
import java.util.Date;
public class WebPage extends ReferenceDocument {
    
    private Date AccessDate;
    private String URL;
    
      // Constructors
       public WebPage ()
    {
        Title = " "; 
        Author = " "; 
        Publisher = " "; 
        PublishYear = " ";
        PagesNo = " ";
        AccessDate = null;
        URL = " ";
    }
       
    public WebPage (String title, String author, String publisher, String pYear, String pages, Date aDate, String url)
    {
        Title = title; 
        Author = author; 
        Publisher = publisher; 
        PublishYear = pYear;
        PagesNo = pages;
        AccessDate = aDate;
        URL = url; 
    }
    
    /**
     * @return the AccessDate
     */
    public Date getAccessDate() {
        return AccessDate;
    }

    /**
     * @param AccessDate the AccessDate to set
     */
    public void setAccessDate(Date AccessDate) {
        this.AccessDate = AccessDate;
    }

    /**
     * @return the URL
     */
    public String getURL() {
        return URL;
    }

    /**
     * @param URL the URL to set
     */
    public void setURL(String URL) {
        this.URL = URL;
    }
}
