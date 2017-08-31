package org.lanqiao.rbac.core;

import com.zaxxer.hikari.HikariDataSource;
import org.junit.Test;
import org.lanqiao.rbac.base.BaseTester;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import javax.sql.DataSource;

import static org.assertj.core.api.Assertions.assertThat;


public class ContextTest extends BaseTester {
  @Autowired
  // @Qualifier("master")
  private DataSource dataSource;

  @Test
  public void testDb() {
    assertThat( dataSource instanceof HikariDataSource ).isTrue();
  }
}
