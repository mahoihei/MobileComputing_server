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
 * Model definition for Elector.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the . For a detailed explanation see:
 * <a href="http://code.google.com/p/google-api-java-client/wiki/Json">http://code.google.com/p/google-api-java-client/wiki/Json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Elector extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Integer age;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long electorId;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String gender;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String income;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Integer getAge() {
    return age;
  }

  /**
   * @param age age or {@code null} for none
   */
  public Elector setAge(java.lang.Integer age) {
    this.age = age;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getElectorId() {
    return electorId;
  }

  /**
   * @param electorId electorId or {@code null} for none
   */
  public Elector setElectorId(java.lang.Long electorId) {
    this.electorId = electorId;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getGender() {
    return gender;
  }

  /**
   * @param gender gender or {@code null} for none
   */
  public Elector setGender(java.lang.String gender) {
    this.gender = gender;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getIncome() {
    return income;
  }

  /**
   * @param income income or {@code null} for none
   */
  public Elector setIncome(java.lang.String income) {
    this.income = income;
    return this;
  }

  @Override
  public Elector set(String fieldName, Object value) {
    return (Elector) super.set(fieldName, value);
  }

  @Override
  public Elector clone() {
    return (Elector) super.clone();
  }

}
