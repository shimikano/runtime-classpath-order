package org.sample;

import java.io.IOException;
import java.net.URL;

import com.google.common.base.Charsets;
import com.google.common.io.Resources;

public final class Service {

  public String readResource() throws IOException {
    System.out.println(System.getProperty("java.class.path"));

    URL resource = Resources.getResource("resource.txt");

    return Resources.toString(resource, Charsets.UTF_8);
  }

}
