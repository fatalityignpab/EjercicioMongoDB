package com.microservice.training.countriesdemo.errorhandling;

public class InvalidContinentException extends RuntimeException {

  /**
   * 
   */
  private static final long serialVersionUID = -4957281189808005732L;

  public InvalidContinentException() {
    super();
  }

  public InvalidContinentException(String message) {
    super(message);
  }

}
