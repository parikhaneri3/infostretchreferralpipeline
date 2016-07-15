package com.infostretch.referral.commons;

import java.util.Date;

import com.infostretch.referral.utilities.ObjectUtils;

/**
 * The Class EmployeeReferralDTO.
 *
 * @author aneri.parikh
 */
public class EmployeeReferralDTO {

  /** The id. */
  private int id;

  /** The candidate name. */
  private String candidateName;

  /** The created on. */
  private Date createdOn;

  /** The email. */
  private String email;

  /** The is attachment. */
  private boolean isAttachment;

  /** The is close. */
  private boolean isClose;

  /** The is contact. */
  private boolean isContact;

  /** The is viable. */
  private boolean isViable;

  /** The linkedin url. */
  private String linkedinUrl;

  /** The phone. */
  private String phone;

  /** The updated on. */
  private Date updatedOn;

  /** The created by. */
  private Integer createdBy;

  /** The updated by. */
  private Integer updatedBy;

  /**
   * Instantiates a new employee referral dto.
   */
  public EmployeeReferralDTO() {
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
   * Gets the created by.
   *
   * @return the created by
   */
  public Integer getCreatedBy() {
    return this.createdBy;
  }

  /**
   * Gets the created on.
   *
   * @return the created on
   */
  public Date getCreatedOn() {
    return ObjectUtils.clone(this.createdOn);
  }

  /**
   * Gets the email.
   *
   * @return the email
   */
  public String getEmail() {
    return this.email;
  }

  /**
   * Gets the id.
   *
   * @return the id
   */
  public int getId() {
    return this.id;
  }

  /**
   * Checks if is attachment.
   *
   * @return true, if is attachment
   */
  public boolean getIsAttachment() {
    return this.isAttachment;
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
   * Gets the linkedin url.
   *
   * @return the linkedin url
   */
  public String getLinkedinUrl() {
    return this.linkedinUrl;
  }

  /**
   * Gets the phone.
   *
   * @return the phone
   */
  public String getPhone() {
    return this.phone;
  }

  /**
   * Gets the updated by.
   *
   * @return the updated by
   */
  public Integer getUpdatedBy() {
    return this.updatedBy;
  }

  /**
   * Gets the updated on.
   *
   * @return the updated on
   */
  public Date getUpdatedOn() {
    return ObjectUtils.clone(this.updatedOn);
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
   * Sets the created by.
   *
   * @param createdBy
   *          the new created by
   */
  public void setCreatedBy(final Integer createdBy) {
    this.createdBy = createdBy;
  }

  /**
   * Sets the created on.
   *
   * @param createdOn
   *          the new created on
   */
  public void setCreatedOn(final Date createdOn) {
    this.createdOn = ObjectUtils.clone(createdOn);
  }

  /**
   * Sets the email.
   *
   * @param email
   *          the new email
   */
  public void setEmail(final String email) {
    this.email = email;
  }

  /**
   * Sets the id.
   *
   * @param id
   *          the new id
   */
  public void setId(final int id) {
    this.id = id;
  }

  /**
   * Sets the attachment.
   *
   * @param isAttachment
   *          the new attachment
   */
  public void setIsAttachment(final boolean isAttachment) {
    this.isAttachment = isAttachment;
  }

  /**
   * Sets the close.
   *
   * @param isClose
   *          the new close
   */
  public void setIsClose(final boolean isClose) {
    this.isClose = isClose;
  }

  /**
   * Sets the contact.
   *
   * @param isContact
   *          the new contact
   */
  public void setIsContact(final boolean isContact) {
    this.isContact = isContact;
  }

  /**
   * Sets the viable.
   *
   * @param isViable
   *          the new viable
   */
  public void setIsViable(final boolean isViable) {
    this.isViable = isViable;
  }

  /**
   * Sets the linkedin url.
   *
   * @param linkedinUrl
   *          the new linkedin url
   */
  public void setLinkedinUrl(final String linkedinUrl) {
    this.linkedinUrl = linkedinUrl;
  }

  /**
   * Sets the phone.
   *
   * @param phone
   *          the new phone
   */
  public void setPhone(final String phone) {
    this.phone = phone;
  }

  /**
   * Sets the updated by.
   *
   * @param updatedBy
   *          the new updated by
   */
  public void setUpdatedBy(final Integer updatedBy) {
    this.updatedBy = updatedBy;
  }

  /**
   * Sets the updated on.
   *
   * @param updatedOn
   *          the new updated on
   */
  public void setUpdatedOn(final Date updatedOn) {
    this.updatedOn = ObjectUtils.clone(updatedOn);
  }

}
