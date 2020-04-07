package org.xftm.common.util;

import org.mybatis.generator.api.CommentGenerator;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.api.dom.xml.XmlElement;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.generator.internal.util.StringUtility;

import javax.xml.bind.DatatypeConverter;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * mybatis文件生成自定义注释
 * @author liuyu
 */
public class CustomCommentGenerator implements CommentGenerator {
    public static void main(String[] args) throws Exception {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        File configFile = new File("common-service/src/main/resources/generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(configFile);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);
    }

    private Properties properties = new Properties();
    private boolean suppressDate = false;
    private boolean suppressAllComments = false;
    private boolean addRemarkComments = false;
    private SimpleDateFormat dateFormat;

    public CustomCommentGenerator() {
    }

    public void addJavaFileComment(CompilationUnit compilationUnit) {
    }

    public void addComment(XmlElement xmlElement) {
        /*
        if (!this.suppressAllComments) {
            xmlElement.addElement(new TextElement("<!--"));
            StringBuilder sb = new StringBuilder();
            sb.append("  WARNING - ");
            sb.append("@mbg.generated");
            xmlElement.addElement(new TextElement(sb.toString()));
            xmlElement.addElement(new TextElement("  This element is automatically generated by MyBatis Generator, do not modify."));
            String s = this.getDateString();
            if (s != null) {
                sb.setLength(0);
                sb.append("  This element was generated on ");
                sb.append(s);
                sb.append('.');
                xmlElement.addElement(new TextElement(sb.toString()));
            }

            xmlElement.addElement(new TextElement("-->"));
        }
        */
    }

    public void addRootComment(XmlElement rootElement) {
    }

    public void addConfigurationProperties(Properties properties) {
        this.properties.putAll(properties);
        this.suppressDate = StringUtility.isTrue(properties.getProperty("suppressDate"));
        this.suppressAllComments = StringUtility.isTrue(properties.getProperty("suppressAllComments"));
        this.addRemarkComments = StringUtility.isTrue(properties.getProperty("addRemarkComments"));
        String dateFormatString = properties.getProperty("dateFormat");
        if (StringUtility.stringHasValue(dateFormatString)) {
            this.dateFormat = new SimpleDateFormat(dateFormatString);
        }

    }

    protected void addJavadocTag(JavaElement javaElement, boolean markAsDoNotDelete) {
        javaElement.addJavaDocLine(" *");
        StringBuilder sb = new StringBuilder();
        sb.append(" * ");
        sb.append("@mbg.generated");
        if (markAsDoNotDelete) {
            sb.append(" do_not_delete_during_merge");
        }

        String s = this.getDateString();
        if (s != null) {
            sb.append(' ');
            sb.append(s);
        }

        javaElement.addJavaDocLine(sb.toString());
    }

    protected String getDateString() {
        if (this.suppressDate) {
            return null;
        } else {
            return this.dateFormat != null ? this.dateFormat.format(new Date()) : (new Date()).toString();
        }
    }

    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable) {
        if (!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            innerClass.addJavaDocLine("/**");
            innerClass.addJavaDocLine(" * This class was generated by MyBatis Generator.");
            sb.append(" * This class corresponds to the database table ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            innerClass.addJavaDocLine(sb.toString());
            this.addJavadocTag(innerClass, false);
            innerClass.addJavaDocLine(" */");
        }
    }

    public void addClassComment(InnerClass innerClass, IntrospectedTable introspectedTable, boolean markAsDoNotDelete) {
        if (!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            innerClass.addJavaDocLine("/**");
            innerClass.addJavaDocLine(" * This class was generated by MyBatis Generator.");
            sb.append(" * This class corresponds to the database table ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            innerClass.addJavaDocLine(sb.toString());
            this.addJavadocTag(innerClass, markAsDoNotDelete);
            innerClass.addJavaDocLine(" */");
        }
    }

    public void addModelClassComment(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        if (!this.suppressAllComments && this.addRemarkComments) {
            topLevelClass.addJavaDocLine("/**");
            String remarks = introspectedTable.getRemarks();
            if (this.addRemarkComments && StringUtility.stringHasValue(remarks)) {
                topLevelClass.addJavaDocLine(" * Database Table Remarks:");
                String[] remarkLines = remarks.split(System.getProperty("line.separator"));
                String[] var5 = remarkLines;
                int var6 = remarkLines.length;

                for(int var7 = 0; var7 < var6; ++var7) {
                    String remarkLine = var5[var7];
                    topLevelClass.addJavaDocLine(" *   " + remarkLine);
                }
            }

            topLevelClass.addJavaDocLine(" *");
            topLevelClass.addJavaDocLine(" * This class was generated by MyBatis Generator.");
            StringBuilder sb = new StringBuilder();
            sb.append(" * This class corresponds to the database table ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            topLevelClass.addJavaDocLine(sb.toString());
            this.addJavadocTag(topLevelClass, true);
            topLevelClass.addJavaDocLine(" */");
        }
    }

    public void addEnumComment(InnerEnum innerEnum, IntrospectedTable introspectedTable) {
        if (!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            innerEnum.addJavaDocLine("/**");
            innerEnum.addJavaDocLine(" * This enum was generated by MyBatis Generator.");
            sb.append(" * This enum corresponds to the database table ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            innerEnum.addJavaDocLine(sb.toString());
            this.addJavadocTag(innerEnum, false);
            innerEnum.addJavaDocLine(" */");
        }
    }

    public void addFieldComment(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if (!this.suppressAllComments) {
            field.addJavaDocLine("/**");
            String remarks = introspectedColumn.getRemarks();
            if (this.addRemarkComments && StringUtility.stringHasValue(remarks)) {
                field.addJavaDocLine(" * Database Column Remarks:");
                String[] remarkLines = remarks.split(System.getProperty("line.separator"));
                String[] var6 = remarkLines;
                int var7 = remarkLines.length;

                for(int var8 = 0; var8 < var7; ++var8) {
                    String remarkLine = var6[var8];
                    field.addJavaDocLine(" *   " + remarkLine);
                }
            }
            if (!CommonUtil.isNullString(introspectedColumn.getRemarks())) {
                field.addJavaDocLine(" * " + introspectedColumn.getRemarks());
            }
            StringBuilder sb = new StringBuilder();
            /**
             * 获取字段注释20200118 update by yu3
             * */
            sb.append(" * ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            sb.append('.');
            sb.append(introspectedColumn.getActualColumnName());
            field.addJavaDocLine(sb.toString());
            this.addJavadocTag(field, false);
            field.addJavaDocLine(" */");
        }
    }

    public void addFieldComment(Field field, IntrospectedTable introspectedTable) {
        if (!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            field.addJavaDocLine("/**");
            if (!CommonUtil.isNullString(introspectedTable.getRemarks())) {
                field.addJavaDocLine(" * " + introspectedTable.getRemarks());
            }
            /**
             * 获取字段注释20200118 update by yu3
             * */
            sb.append(" * ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            field.addJavaDocLine(sb.toString());
            this.addJavadocTag(field, false);
            field.addJavaDocLine(" */");
        }
    }

    public void addGeneralMethodComment(Method method, IntrospectedTable introspectedTable) {
        if (!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            method.addJavaDocLine("/**");
            method.addJavaDocLine(" * This method was generated by MyBatis Generator.");
            sb.append(" * This method corresponds to the database table ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            method.addJavaDocLine(sb.toString());
            this.addJavadocTag(method, false);
            method.addJavaDocLine(" */");
        }
    }

    public void addGetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if (!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            method.addJavaDocLine("/**");
            if (!CommonUtil.isNullString(introspectedTable.getRemarks())) {
                method.addJavaDocLine(" * " + introspectedColumn.getRemarks());
            }
            sb.append(" * ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            sb.append('.');
            sb.append(introspectedColumn.getActualColumnName());
            method.addJavaDocLine(sb.toString());
            method.addJavaDocLine(" *");
            sb.setLength(0);
            sb.append(" * @return the value of ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            sb.append('.');
            sb.append(introspectedColumn.getActualColumnName());
            method.addJavaDocLine(sb.toString());
            this.addJavadocTag(method, false);
            method.addJavaDocLine(" */");
        }
    }

    public void addSetterComment(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn) {
        if (!this.suppressAllComments) {
            StringBuilder sb = new StringBuilder();
            method.addJavaDocLine("/**");
            if (!CommonUtil.isNullString(introspectedTable.getRemarks())) {
                method.addJavaDocLine(" * " + introspectedColumn.getRemarks());
            }
            sb.append(" * "+introspectedTable.getFullyQualifiedTable() + ".");
            sb.append(introspectedColumn.getActualColumnName());
            method.addJavaDocLine(sb.toString());
            method.addJavaDocLine(" *");
            Parameter parm = (Parameter)method.getParameters().get(0);
            sb.setLength(0);
            sb.append(" * @param ");
            sb.append(parm.getName());
            sb.append(" the value for ");
            sb.append(introspectedTable.getFullyQualifiedTable());
            sb.append('.');
            sb.append(introspectedColumn.getActualColumnName());
            method.addJavaDocLine(sb.toString());
            this.addJavadocTag(method, false);
            method.addJavaDocLine(" */");
        }
    }

    public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> imports) {
        imports.add(new FullyQualifiedJavaType("javax.annotation.Generated"));
        String comment = "Source Table: " + introspectedTable.getFullyQualifiedTable().toString();
        method.addAnnotation(this.getGeneratedAnnotation(comment));
    }

    public void addGeneralMethodAnnotation(Method method, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> imports) {
        imports.add(new FullyQualifiedJavaType("javax.annotation.Generated"));
        String comment = "Source field: " + introspectedTable.getFullyQualifiedTable().toString() + "." + introspectedColumn.getActualColumnName();
        method.addAnnotation(this.getGeneratedAnnotation(comment));
    }

    public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> imports) {
        imports.add(new FullyQualifiedJavaType("javax.annotation.Generated"));
        String comment = "Source Table: " + introspectedTable.getFullyQualifiedTable().toString();
        field.addAnnotation(this.getGeneratedAnnotation(comment));
    }

    public void addFieldAnnotation(Field field, IntrospectedTable introspectedTable, IntrospectedColumn introspectedColumn, Set<FullyQualifiedJavaType> imports) {
        imports.add(new FullyQualifiedJavaType("javax.annotation.Generated"));
        String comment = "Source field: " + introspectedTable.getFullyQualifiedTable().toString() + "." + introspectedColumn.getActualColumnName();
        field.addAnnotation(this.getGeneratedAnnotation(comment));
    }

    public void addClassAnnotation(InnerClass innerClass, IntrospectedTable introspectedTable, Set<FullyQualifiedJavaType> imports) {
        imports.add(new FullyQualifiedJavaType("javax.annotation.Generated"));
        String comment = "Source Table: " + introspectedTable.getFullyQualifiedTable().toString();
        innerClass.addAnnotation(this.getGeneratedAnnotation(comment));
    }

    private String getGeneratedAnnotation(String comment) {
        StringBuilder buffer = new StringBuilder();
        buffer.append("@Generated(");
        if (this.suppressAllComments) {
            buffer.append('"');
        } else {
            buffer.append("value=\"");
        }

        buffer.append(MyBatisGenerator.class.getName());
        buffer.append('"');
        if (!this.suppressDate && !this.suppressAllComments) {
            buffer.append(", date=\"");
            buffer.append(DatatypeConverter.printDateTime(Calendar.getInstance()));
            buffer.append('"');
        }

        if (!this.suppressAllComments) {
            buffer.append(", comments=\"");
            buffer.append(comment);
            buffer.append('"');
        }

        buffer.append(')');
        return buffer.toString();
    }
}