package com.betrybe.playlist.service.exception;

public abstract class NotFoundException extends  RuntimeException {
  public NotFoundException(String message) {
    super(message);
  }
}
