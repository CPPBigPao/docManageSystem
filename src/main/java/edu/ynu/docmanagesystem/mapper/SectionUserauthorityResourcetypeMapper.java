package edu.ynu.docmanagesystem.mapper;

import edu.ynu.docmanagesystem.po.SectionUserauthorityResourcetype;
import edu.ynu.docmanagesystem.po.SectionUserauthorityResourcetypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SectionUserauthorityResourcetypeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section_userauthority_ resourcetype
     *
     * @mbggenerated Thu May 26 16:11:13 CST 2016
     */
    int countByExample(SectionUserauthorityResourcetypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section_userauthority_ resourcetype
     *
     * @mbggenerated Thu May 26 16:11:13 CST 2016
     */
    int deleteByExample(SectionUserauthorityResourcetypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section_userauthority_ resourcetype
     *
     * @mbggenerated Thu May 26 16:11:13 CST 2016
     */
    int insert(SectionUserauthorityResourcetype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section_userauthority_ resourcetype
     *
     * @mbggenerated Thu May 26 16:11:13 CST 2016
     */
    int insertSelective(SectionUserauthorityResourcetype record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section_userauthority_ resourcetype
     *
     * @mbggenerated Thu May 26 16:11:13 CST 2016
     */
    List<SectionUserauthorityResourcetype> selectByExample(SectionUserauthorityResourcetypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section_userauthority_ resourcetype
     *
     * @mbggenerated Thu May 26 16:11:13 CST 2016
     */
    int updateByExampleSelective(@Param("record") SectionUserauthorityResourcetype record, @Param("example") SectionUserauthorityResourcetypeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table section_userauthority_ resourcetype
     *
     * @mbggenerated Thu May 26 16:11:13 CST 2016
     */
    int updateByExample(@Param("record") SectionUserauthorityResourcetype record, @Param("example") SectionUserauthorityResourcetypeExample example);
}