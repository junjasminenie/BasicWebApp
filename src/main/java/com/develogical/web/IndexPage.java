package com.develogical.web;

import java.io.PrintWriter;

public class IndexPage extends HtmlPage {

    @Override
    protected void writeContentTo(PrintWriter writer) {
        writer.println(
                "<h1>Welcome! This is Jasmine's Web App!!!</h1>" +
                "<p>Enter your query in the box below: " +
                  "<form><input type=\"text\" name=\"q\" />" +
                    "<input type=\"submit\">" +
                  "</form>" +
                "</p>");
    }
  
}

//made a change
