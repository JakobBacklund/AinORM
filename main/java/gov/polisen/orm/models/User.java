package gov.polisen.orm.models;

public class User {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.id
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.user_name
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    private String userName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.real_name
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    private String realName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.salt
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    private String salt;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column users.passwond_hash
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    private String passwondHash;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table users
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public User(Integer id, String userName, String realName, String salt, String passwondHash) {
        this.id = id;
        this.userName = userName;
        this.realName = realName;
        this.salt = salt;
        this.passwondHash = passwondHash;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.id
     *
     * @return the value of users.id
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.user_name
     *
     * @return the value of users.user_name
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.real_name
     *
     * @return the value of users.real_name
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public String getRealName() {
        return realName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.salt
     *
     * @return the value of users.salt
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public String getSalt() {
        return salt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column users.passwond_hash
     *
     * @return the value of users.passwond_hash
     *
     * @mbggenerated Fri Apr 25 17:12:46 CEST 2014
     */
    public String getPasswondHash() {
        return passwondHash;
    }
}