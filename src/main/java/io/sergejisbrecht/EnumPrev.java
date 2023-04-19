package io.sergejisbrecht;

public enum EnumPrev {
  ENUM_VALUE_1("ENUM^VALUE^1");

  private final String value;

  EnumPrev(String value) {
    this.value = value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }
}

