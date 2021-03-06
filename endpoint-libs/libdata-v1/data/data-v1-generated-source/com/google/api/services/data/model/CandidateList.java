/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://code.google.com/p/google-apis-client-generator/
 * (build: 2013-05-14 03:07:32 UTC)
 * on 2013-05-16 at 07:43:41 UTC 
 * Modify at your own risk.
 */

package com.google.api.services.data.model;

/**
 * Model definition for CandidateList.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the . For a detailed explanation see:
 * <a href="http://code.google.com/p/google-api-java-client/wiki/Json">http://code.google.com/p/google-api-java-client/wiki/Json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class CandidateList extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long cListId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String candidateName;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long candidateNum;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long gcId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long listId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long partyId;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getCListId() {
    return cListId;
  }

  /**
   * @param cListId cListId or {@code null} for none
   */
  public CandidateList setCListId(java.lang.Long cListId) {
    this.cListId = cListId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getCandidateName() {
    return candidateName;
  }

  /**
   * @param candidateName candidateName or {@code null} for none
   */
  public CandidateList setCandidateName(java.lang.String candidateName) {
    this.candidateName = candidateName;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getCandidateNum() {
    return candidateNum;
  }

  /**
   * @param candidateNum candidateNum or {@code null} for none
   */
  public CandidateList setCandidateNum(java.lang.Long candidateNum) {
    this.candidateNum = candidateNum;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getGcId() {
    return gcId;
  }

  /**
   * @param gcId gcId or {@code null} for none
   */
  public CandidateList setGcId(java.lang.Long gcId) {
    this.gcId = gcId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getListId() {
    return listId;
  }

  /**
   * @param listId listId or {@code null} for none
   */
  public CandidateList setListId(java.lang.Long listId) {
    this.listId = listId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getPartyId() {
    return partyId;
  }

  /**
   * @param partyId partyId or {@code null} for none
   */
  public CandidateList setPartyId(java.lang.Long partyId) {
    this.partyId = partyId;
    return this;
  }

  @Override
  public CandidateList set(String fieldName, Object value) {
    return (CandidateList) super.set(fieldName, value);
  }

  @Override
  public CandidateList clone() {
    return (CandidateList) super.clone();
  }

}
