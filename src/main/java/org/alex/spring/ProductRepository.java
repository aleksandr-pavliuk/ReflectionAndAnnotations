package org.alex.spring;

import java.util.List;
import org.alex.spring.annotation.Component;

/**
 * @author Alex
 * @link https://intvw.me
 */
@Component
public class ProductRepository {

  public List<Product> getPrice(List<Product> items) {
    for (Product product : items) {

      //let's assume, reading from database
      Double price = (double) Math.round(30 * Math.random());

      System.out.println("Original Price of "+product.getName()+" is "+ price +" $.");

      product.setPrice(price);
    }

    return items;
  }
}
