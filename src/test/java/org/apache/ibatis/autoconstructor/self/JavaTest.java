package org.apache.ibatis.autoconstructor.self;

import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.net.URI;
import java.nio.file.*;

public class JavaTest {


  @Test
  public void dailyTestMethod() {
    A book = new A();
    Class cbook = book.getClass();
    //获取Book类的直接超类的Type
    Type type = cbook.getGenericSuperclass();
    Class cb = new B().getClass();
    TypeVariable<?> typeVar = ((TypeVariable<?>) type);
    System.out.println(type);
    System.out.println(cb);
    System.out.println(typeVar);
  }
}
