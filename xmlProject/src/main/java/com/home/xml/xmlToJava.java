package com.home.xml;

import java.io.File;
import java.io.StringWriter;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import com.home.entity.bookstore;

public class xmlToJava {

	public static void main(String[] args) throws JAXBException {

		JAXBContext jaxbContext;
		
		    jaxbContext = JAXBContext.newInstance(bookstore.class);		 
		    Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
				    
		    bookstore bookst = (bookstore)jaxbUnmarshaller.unmarshal(new File("sample.xml"));
          System.out.println(bookst);
		    

          System.out.println("===========================================================");
          Marshaller jaxmarshaller = jaxbContext.createMarshaller();
          jaxmarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
          
          StringWriter sw = new StringWriter();
          jaxmarshaller.marshal(bookst, sw);
          
          System.out.println(sw.toString());
          
          
          
          
	}

}
