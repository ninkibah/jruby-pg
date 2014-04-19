package org.jruby.pg.internal;


@SuppressWarnings("serial")
public class PostgresqlException extends Exception {
  private final ResultSet resultSet;

  public PostgresqlException(String message, ResultSet resultSet) {
    super(message);
    this.resultSet = resultSet;
  }

  public ResultSet getResultSet() {
    return resultSet;
  }
}
