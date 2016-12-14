/*
 * Copyright 2016 Jason Holmberg
 */
package demo.cdi.tomcat;

import java.util.Date;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;

/**
 *
 * @author holmberg
 */
@RequestScoped
public class FooService {

  @Inject
  private Foo foo;

  public Date getFooNow()
  {
    return this.foo.getNow();
  }

  public String getFooMessage()
  {
    return this.foo.getMessage();
  }

}
