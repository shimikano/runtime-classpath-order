package org.sample;

import org.junit.Test;
import static org.junit.Assert.*;

import java.io.IOException;

public final class ServiceTest {

  private final Service service = new Service();

  @Test
  public void readResource() throws IOException {
    assertEquals("resource in test/resources", service.readResource());
  }

}
