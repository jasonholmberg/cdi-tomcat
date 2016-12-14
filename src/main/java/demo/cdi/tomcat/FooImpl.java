/*
 * Copyright 2016 Jason Holmberg
 */
package demo.cdi.tomcat;

import java.util.Date;
import javax.annotation.PostConstruct;

/**
 *
 * @author holmberg
 */
public class FooImpl implements Foo {

  private Date now;
  private String message;

  @PostConstruct
  public void init()
  {
    this.now = new Date();
    this.message = "My message [" + now.toString() + "]";
  }

  @Override
  public Date getNow()
  {
    return this.now;
  }

  @Override
  public String getMessage()
  {
    return this.message;
  }

}
