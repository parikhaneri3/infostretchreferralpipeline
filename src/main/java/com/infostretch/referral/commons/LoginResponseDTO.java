package com.infostretch.referral.commons;

/**
 * The Class LoginResponseDTO.
 */
public class LoginResponseDTO {

  /** The status. */
  private Status status;

  /** The data. */
  private DataDTO data;

  /**
   * Instantiates a new login response dto.
   */
  public LoginResponseDTO() {
  }

  /**
   * Gets the data.
   *
   * @return the data
   */
  public DataDTO getData() {
    return this.data;
  }

  /**
   * Gets the status.
   *
   * @return the status
   */
  public Status getStatus() {
    return this.status;
  }

  /**
   * Sets the data.
   *
   * @param data
   *          the new data
   */
  public void setData(final DataDTO data) {
    this.data = data;
  }

  /**
   * Sets the status.
   *
   * @param status
   *          the new status
   */
  public void setStatus(final Status status) {
    this.status = status;
  }
}
