package edu.ynu.docmanagesystem.mapper.Rms;

import edu.ynu.docmanagesystem.po.Rms.systemauthority;
import edu.ynu.docmanagesystem.po.Rms.systemauthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface systemauthorityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Rms.systemAuthority
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    int countByExample(systemauthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Rms.systemAuthority
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    int deleteByExample(systemauthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Rms.systemAuthority
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    int insert(systemauthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Rms.systemAuthority
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    int insertSelective(systemauthority record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Rms.systemAuthority
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    List<systemauthority> selectByExample(systemauthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Rms.systemAuthority
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    int updateByExampleSelective(@Param("record") systemauthority record, @Param("example") systemauthorityExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Rms.systemAuthority
     *
     * @mbggenerated Wed May 25 22:46:33 CST 2016
     */
    int updateByExample(@Param("record") systemauthority record, @Param("example") systemauthorityExample example);
}