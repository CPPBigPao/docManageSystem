package edu.ynu.docmanagesystem.po.Rms;

public class userauthority {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Rms.userauthority.userAuthorityId
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    private Integer userauthorityid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column Rms.userauthority.userAuthorityDescribe
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    private String userauthoritydescribe;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Rms.userauthority.userAuthorityId
     *
     * @return the value of Rms.userauthority.userAuthorityId
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    public Integer getUserauthorityid() {
        return userauthorityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Rms.userauthority.userAuthorityId
     *
     * @param userauthorityid the value for Rms.userauthority.userAuthorityId
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    public void setUserauthorityid(Integer userauthorityid) {
        this.userauthorityid = userauthorityid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column Rms.userauthority.userAuthorityDescribe
     *
     * @return the value of Rms.userauthority.userAuthorityDescribe
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    public String getUserauthoritydescribe() {
        return userauthoritydescribe;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column Rms.userauthority.userAuthorityDescribe
     *
     * @param userauthoritydescribe the value for Rms.userauthority.userAuthorityDescribe
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    public void setUserauthoritydescribe(String userauthoritydescribe) {
        this.userauthoritydescribe = userauthoritydescribe == null ? null : userauthoritydescribe.trim();
    }
}