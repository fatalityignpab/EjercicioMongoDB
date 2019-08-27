package com.microservice.training.countriesdemo.model;

public enum Continent {

  ASIA(1, "asia"), EUROPE(2, "europe"), AFRICA(3, "africa"), NORTH_AMERICA(4,
      "north_america"), SOUTH_AMERICA(5, "south_america"), UNKNOWN(0, "UNKNOWN");

  private int continentId;
  private String continentName;

  Continent(int continentId, String productId) {
    this.continentId = continentId;
    this.continentName = productId;
  }

  /**
   * Method to return the actual continentName
   * 
   * @return continentName string to describe continent.
   */
  public String getContinentName() {
    return this.continentName;
  }

  /**
   * Method to return the actual continentId
   * 
   * @return continentId integer to identify the continent
   */
  public int getContinentId() {
    return this.continentId;
  }

  /**
   * Get a Continent element passing in the continentId String.
   * 
   * @param continentId String that identifies the corresponding product element.
   * @return Continent element filtered by continentId.
   */
  public static Continent continentById(int continentId) {
    for (Continent continent : values()) {
      if (continent.getContinentId() == continentId) {
        return continent;
      }
    }
    return UNKNOWN;
  }

  /**
   * Get a Continent element passing in the continentName String.
   * 
   * @param continentName String that identifies the corresponding product element.
   * @return Continent element filtered by continentId.
   */
  public static Continent continentByName(String continentName) {
    for (Continent continent : values()) {
      if (continent.getContinentName().equalsIgnoreCase(continentName)) {
        return continent;
      }
    }
    return UNKNOWN;
  }

}
