package com.infostretch.referral.commons;

/**
 * The Class EmployeeReferralDetails.
 *
 * @author aneri.parikh
 */
public class EmployeeReferralDetails {
  /** The is close. */
  private Boolean isClose;
  /** The is contact. */
  private Boolean isContact;
  /** The is viable. */
  private Boolean isViable;
  /** The candidate id. */
  private Integer candidateId;
  /** The candidate name. */
  private String candidateName;

  /**
   * Instantiates a new employee referral details.
   */
  public EmployeeReferralDetails() {
  }

  /**
   * Instantiates a new employee referral details.
   *
   * @param candidateId
   *          the candidate id
   * @param candidateName
   *          the candidate name
   * @param isContact
   *          the is contact
   * @param isViable
   *          the is viable
   * @param isClosed
   *          the is closed
   */
  public EmployeeReferralDetails(final Integer candidateId, final String candidateName,
      final Boolean isContact, final Boolean isViable, final Boolean isClose) {
    this.candidateName = candidateName;
    this.candidateId = candidateId;
    this.isClose = isClose;
    this.isContact = isContact;
    this.isViable = isViable;
  }

  /**
   * Gets the candidate id.
   *
   * @return the candidate id
   */
  public Integer getCandidateId() {
    return this.candidateId;
  }

  /**
   * Gets the candidate name.
   *
   * @return the candidate name
   */
  public String getCandidateName() {
    return this.candidateName;
  }

  /**
   * Checks if is close.
   *
   * @return true, if is close
   */
  public boolean getIsClose() {
    return this.isClose;
  }

  /**
   * Checks if is contact.
   *
   * @return true, if is contact
   */
  public boolean getIsContact() {
    return this.isContact;
  }

  /**
   * Checks if is viable.
   *
   * @return true, if is viable
   */
  public boolean getIsViable() {
    return this.isViable;
  }

  /**
   * Sets the candidate id.
   *
   * @param candidateId
   *          the new candidate id
   */
  public void setCandidateId(final Integer candidateId) {
    this.candidateId = candidateId;
  }

  /**
   * Sets the candidate name.
   *
   * @param candidateName
   *          the new candidate name
   */
  public void setCandidateName(final String candidateName) {
    this.candidateName = candidateName;
  }

  /**
   * Sets the close.
   *
   * @param isClose
   *          the new close
   */
  public void setIsClose(final Boolean isClose) {
    this.isClose = isClose;
  }

  /**
   * Sets the contact.
   *
   * @param isContact
   *          the new contact
   */
  public void setIsContact(final Boolean isContact) {
    this.isContact = isContact;
  }

  /**
   * Sets the viable.
   *
   * @param isViable
   *          the new viable
   */
  public void setIsViable(final Boolean isViable) {
    this.isViable = isViable;
  }
}
