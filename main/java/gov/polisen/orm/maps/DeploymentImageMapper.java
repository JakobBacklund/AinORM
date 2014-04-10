package gov.polisen.orm.maps;

import gov.polisen.orm.clients.DeploymentImageSqlProvider;
import gov.polisen.orm.examples.DeploymentImageExample;
import gov.polisen.orm.models.DeploymentImage;
import java.util.List;
import org.apache.ibatis.annotations.Arg;
import org.apache.ibatis.annotations.ConstructorArgs;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.type.JdbcType;

public interface DeploymentImageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deploymentimages
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    @SelectProvider(type=DeploymentImageSqlProvider.class, method="countByExample")
    int countByExample(DeploymentImageExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deploymentimages
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    @Insert({
        "insert into deploymentimages (imageid, deploymentid)",
        "values (#{imageid,jdbcType=INTEGER}, #{deploymentid,jdbcType=INTEGER})"
    })
    int insert(DeploymentImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deploymentimages
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    @InsertProvider(type=DeploymentImageSqlProvider.class, method="insertSelective")
    int insertSelective(DeploymentImage record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table deploymentimages
     *
     * @mbggenerated Wed Apr 09 16:26:54 CEST 2014
     */
    @SelectProvider(type=DeploymentImageSqlProvider.class, method="selectByExample")
    @ConstructorArgs({
        @Arg(column="imageid", javaType=Integer.class, jdbcType=JdbcType.INTEGER),
        @Arg(column="deploymentid", javaType=Integer.class, jdbcType=JdbcType.INTEGER)
    })
    List<DeploymentImage> selectByExample(DeploymentImageExample example);
}