package com.xinyuan.generator.common;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * generator代码生成器常量类
 *
 * @author 丁小青
 * @date 2017年6月16日
 */
public class Constants_generator {
    // 代码生成器列名 标志是否 0-否 1-是
    public static final int SF_F = 0;
    public static final int SF_S = 1;
    public static Map<Integer, String> GG_COLUMN_SF_Map = new LinkedHashMap<>();

    static {
        GG_COLUMN_SF_Map.put(SF_F, "否");
        GG_COLUMN_SF_Map.put(SF_S, "是");
    }

    // 匹配方式
    public static final String equalItem = "=";
    public static final String likeItem = "%";
    public static final String greaterItem = ">";
    public static final String lessItem = "<";
    public static final String unequalItem = "!=";
    public static Map<String, String> GG_COLUMN_QUERY_TYPE_Map = new LinkedHashMap<>();
    static {
        GG_COLUMN_QUERY_TYPE_Map.put(equalItem, "=");
        GG_COLUMN_QUERY_TYPE_Map.put(likeItem, "%");
        GG_COLUMN_QUERY_TYPE_Map.put(greaterItem, ">");
        GG_COLUMN_QUERY_TYPE_Map.put(lessItem, "<");
        GG_COLUMN_QUERY_TYPE_Map.put(unequalItem, "!=");
    }

    // 控件类型 1-单行文本框 2-多行文本框 3-隐藏域字段 4-单选下拉框 5-多选下拉框 6-单选按钮 7-复选框 8-日期选择 9-日期时间 10-人员选择 11-机构选择 12-区域选择
    public static final String TEXT = "text";
    public static final String TEXTAREA = "textarea";
    public static final String HIDDEN = "hidden";
    public static final String SELECT = "select";
    public static final String SELECT_MORE = "selectmore";
    public static final String RADIO = "radio";
    public static final String CHECKBOX = "checkbox";
    public static final String DATE = "date";
    public static final String DATE_TIME = "datetime";
    public static final String SELECT_RY = "ry";
    public static final String SELECT_JG = "jg";
    public static final String SELECT_AREA = "area";

    public static Map<String, String> GG_COLUMN_SHOW_TYPE_Map = new LinkedHashMap<>();

    static {
        GG_COLUMN_SHOW_TYPE_Map.put(TEXT, "单行文本框");
        GG_COLUMN_SHOW_TYPE_Map.put(TEXTAREA, "多行文本框");
        GG_COLUMN_SHOW_TYPE_Map.put(HIDDEN, "隐藏域字段");
        GG_COLUMN_SHOW_TYPE_Map.put(SELECT, "单选下拉框");
        GG_COLUMN_SHOW_TYPE_Map.put(SELECT_MORE, "多选下拉框");
        GG_COLUMN_SHOW_TYPE_Map.put(RADIO, "单选按钮");
        GG_COLUMN_SHOW_TYPE_Map.put(CHECKBOX, "复选框");
        GG_COLUMN_SHOW_TYPE_Map.put(DATE, "日期选择");
        GG_COLUMN_SHOW_TYPE_Map.put(DATE_TIME, "日期时间");
        GG_COLUMN_SHOW_TYPE_Map.put(SELECT_RY, "人员选择");
        GG_COLUMN_SHOW_TYPE_Map.put(SELECT_JG, "机构选择");
        GG_COLUMN_SHOW_TYPE_Map.put(SELECT_AREA, "区域选择");
    }

    // 属性类型-String 1-NVARCHAR2 2-VARCHAR2 3-CLOB
    public static final String attr_type_String = "String";
    public static final String attr_type_Number = "Number";
    public static Map<String, String> attr_type_Map = new LinkedHashMap<>();
    static {
        attr_type_Map.put(attr_type_String, "String");
        attr_type_Map.put(attr_type_Number, "Number");
    }

    // 模板类型-
    public static final String vm_type_tree_list = "treelisttemplate";
    public static final String vm_type_list = "dbzscgtemplate";
    public static final String vm_type_list_child = "paternitytemplate";
    public static final String vm_type_single_edit = "dbdthtemplate";
    public static final String vm_type_treeform = "treeformtemplate";
    public static final String vm_type_publicpage = "publicpagetemplate";
    public static final String vm_type_anzscg = "anzscgtemplate";
    public static final String vm_type_slbjck = "slbjcktemplate";
    public static Map<String, String> VM_TYPE_StringMap = new LinkedHashMap<>();
    static {
        VM_TYPE_StringMap.put(vm_type_tree_list, "树形表单增删查改");
        VM_TYPE_StringMap.put(vm_type_list, "单表增删查改");
        VM_TYPE_StringMap.put(vm_type_list_child, "主子表增删查改(动态行)");
        VM_TYPE_StringMap.put(vm_type_single_edit, "单表动态行");
        VM_TYPE_StringMap.put(vm_type_treeform, "树+表单");
        VM_TYPE_StringMap.put(vm_type_publicpage, "公共多选页面");
        VM_TYPE_StringMap.put(vm_type_anzscg, "按钮增删查改");
        VM_TYPE_StringMap.put(vm_type_slbjck, "双列编辑查看");
    }

    // 自动补充数据
    public static final String cjr = "cjr";
    public static final String cjrmc = "cjrmc";
    public static final String cjsj = "cjsj";
    public static Map<String, String> insert_typeMap = new LinkedHashMap<>();
    static {
        insert_typeMap.put(cjr, "创建人");
        insert_typeMap.put(cjrmc, "创建人名称");
        insert_typeMap.put(cjsj, "创建时间");
    }
    public static String getinsert_typeMap(String lx) {
        return insert_typeMap.get(lx);
    }

    // 列表宽度
    public static final String list_width_shw = "35";
    public static final String list_width_lhw = "65";
    public static Map<String, String> list_widthMap = new LinkedHashMap<>();
    static {
        list_widthMap.put(list_width_shw, "35");
        list_widthMap.put(list_width_lhw, "65");
    }

    // 字段验证
    public static final String options_email = "email";
    public static final String options_url = "url";
    public static final String options_date = "date";
    public static final String options_datetime = "datetime";
    public static final String options_number = "number";
    public static final String options_string = "string";
    public static final String options_phone = "phone";
    public static final String options_card = "card";
    public static Map<String, String> options_Map = new LinkedHashMap<>();
    static {
        options_Map.put(options_email, "邮箱");
        options_Map.put(options_url, "网址");
        options_Map.put(options_date, "日期");
        options_Map.put(options_datetime, "时间");
        options_Map.put(options_number, "数值");
        options_Map.put(options_string, "字符串");
        options_Map.put(options_phone, "电话或手机");
        options_Map.put(options_card, "身份证号");
    }
    // PO模板
    public static final String vm_type_po = "po";
    public static final String vm_type_to = "to";
    public static Map<String, String> VM_TYPE_POMap = new LinkedHashMap<>();
    static {
        VM_TYPE_POMap.put(vm_type_po, "PO模板");
        VM_TYPE_POMap.put(vm_type_to, "TO模板");
    }

    //学生性别 1-男 2-女
    public static final Integer GG_STUDENT_SEX_BOY = 1;
    public static final Integer GG_STUDENT_SEX_GIRL = 2;
    public final static Map<Integer, String> GG_STUDENT_SEX_MAP = new LinkedHashMap<>();

    static {
        GG_STUDENT_SEX_MAP.put(GG_STUDENT_SEX_BOY, "男");
        GG_STUDENT_SEX_MAP.put(GG_STUDENT_SEX_GIRL, "女");
    }
    public static String getGG_STUDENT_SEX_MAP(Integer lx) {
        return GG_STUDENT_SEX_MAP.get(lx);
    }

    //爱好 1-篮球 2-长跑 3-听音乐 4-看书 5-乒乓球 6-羽毛球 7-跳绳
    public static final String GG_STUDENT_HOBBY_LQ = "basketball";
    public static final String GG_STUDENT_HOBBY_CP = "run";
    public static final String GG_STUDENT_HOBBY_TYY = "music";
    public static final String GG_STUDENT_HOBBY_KS = "book";
    public static final String GG_STUDENT_HOBBY_PBQ = "pinp";
    public static final String GG_STUDENT_HOBBY_YMQ = "yumaoq";
    public static final String GG_STUDENT_HOBBY_TS = "tiaos";
    public final static Map<String, String> GG_STUDENT_HOBBY_MAP = new LinkedHashMap<>();

    static {
        GG_STUDENT_HOBBY_MAP.put(GG_STUDENT_HOBBY_LQ, "篮球");
        GG_STUDENT_HOBBY_MAP.put(GG_STUDENT_HOBBY_CP, "长跑");
        GG_STUDENT_HOBBY_MAP.put(GG_STUDENT_HOBBY_TYY, "听音乐");
        GG_STUDENT_HOBBY_MAP.put(GG_STUDENT_HOBBY_KS, "看书");
        GG_STUDENT_HOBBY_MAP.put(GG_STUDENT_HOBBY_PBQ, "乒乓球");
        GG_STUDENT_HOBBY_MAP.put(GG_STUDENT_HOBBY_YMQ, "羽毛球");
        GG_STUDENT_HOBBY_MAP.put(GG_STUDENT_HOBBY_TS, "跳绳");
    }
    public static String getGG_STUDENT_HOBBY_MAP(String bblx) {
        return GG_STUDENT_HOBBY_MAP.get(bblx);
    }

    //科目 1-语文 2-数学 3-英语
    public static final String GG_STUDENT_SUBJECT_YW = "yuwen";
    public static final String GG_STUDENT_SUBJECT_SX = "shuxue";
    public static final String GG_STUDENT_SUBJECT_YY = "yingyu";
    public final static Map<String, String> GG_STUDENT_SUBJECT_MAP = new LinkedHashMap<>();

    static {
        GG_STUDENT_SUBJECT_MAP.put(GG_STUDENT_SUBJECT_YW, "语文");
        GG_STUDENT_SUBJECT_MAP.put(GG_STUDENT_SUBJECT_SX, "数学");
        GG_STUDENT_SUBJECT_MAP.put(GG_STUDENT_SUBJECT_YY, "英语");
    }
    public static String getGG_STUDENT_SUBJECT_MAP(String bblx) {
        return GG_STUDENT_SUBJECT_MAP.get(bblx);
    }

    // 动态字段类型[GG_ZDLX] ZDZLX 字段值类型(1-数字型 3-字符型 12-图片型 15-附件型)
    public final static int GG_ZDLX_ZDZLX_NUMBER = 1;
    public final static int GG_ZDLX_ZDZLX_CHAR = 3;
    public final static int GG_ZDLX_ZDZLX_IMAGE = 12;
    public final static int GG_ZDLX_ZDZLX_FILE = 15;
    public final static Map<Integer, String> KJGL_WLJK_MAP = new LinkedHashMap<>();

    static {
        KJGL_WLJK_MAP.put(GG_ZDLX_ZDZLX_NUMBER, "数字型");
        KJGL_WLJK_MAP.put(GG_ZDLX_ZDZLX_CHAR, "字符型");
        KJGL_WLJK_MAP.put(GG_ZDLX_ZDZLX_IMAGE, "图片型");
        KJGL_WLJK_MAP.put(GG_ZDLX_ZDZLX_FILE, "附件型");
    }

    public static String getKJGL_WLJK_MAP_Label(Integer zdzlx) {
        return KJGL_WLJK_MAP.get(zdzlx);
    }

    // 联系人类别 (1-一般联系人 2-负责人 3-职业人员)
    public final static int GG_DBZSCG_LB_YBLXR = 1;
    public final static int GG_DBZSCG_LB_FZR = 2;
    public final static int GG_DBZSCG_LB_ZYRY = 3;
    public final static Map<Integer, String> GG_DBZSCG_LB_MAP = new LinkedHashMap<>();
    static {
        GG_DBZSCG_LB_MAP.put(GG_DBZSCG_LB_YBLXR, "一般联系人");
        GG_DBZSCG_LB_MAP.put(GG_DBZSCG_LB_FZR, "负责人");
        GG_DBZSCG_LB_MAP.put(GG_DBZSCG_LB_ZYRY, "职业人员");
    }
    public static String getGG_DBZSCG_LB_MAP_Label(Integer lb) {
        return GG_DBZSCG_LB_MAP.get(lb);
    }

    // 项目类型 (1-货物 2-工程 3-服务)
    public final static Integer GG_DBZSCG_XMLX_HW = 1;
    public final static Integer GG_DBZSCG_XMLX_GC = 2;
    public final static Integer GG_DBZSCG_XMLX_FW = 3;
    public final static Map<Integer, String> GG_DBZSCG_XMLX_MAP = new LinkedHashMap<>();
    static {
        GG_DBZSCG_XMLX_MAP.put(GG_DBZSCG_XMLX_HW, "货物");
        GG_DBZSCG_XMLX_MAP.put(GG_DBZSCG_XMLX_GC, "工程");
        GG_DBZSCG_XMLX_MAP.put(GG_DBZSCG_XMLX_FW, "服务");
    }
    public static String getGG_DBZSCG_XMLX_MAP_Label(Integer lb) {
        return GG_DBZSCG_XMLX_MAP.get(lb);
    }

    // 学历(1-专科以下 2-专科 3-本科 4-研究生 5-博士及以上
    public final static int XS_TEACHER_ZGXL_ZKYX = 1;
    public final static int XS_TEACHER_ZGXL_ZK = 2;
    public final static int XS_TEACHER_ZGXL_BK = 3;
    public final static int XS_TEACHER_ZGXL_YJS = 4;
    public final static int XS_TEACHER_ZGXL_BSJYS = 5;
    public static Map<Integer, String> XS_TEACHER_ZGXL = new LinkedHashMap<>();
    static {
        XS_TEACHER_ZGXL.put(XS_TEACHER_ZGXL_ZKYX,"专科以下");
        XS_TEACHER_ZGXL.put(XS_TEACHER_ZGXL_ZK,"专科");
        XS_TEACHER_ZGXL.put(XS_TEACHER_ZGXL_BK,"本科");
        XS_TEACHER_ZGXL.put(XS_TEACHER_ZGXL_YJS,"研究生");
        XS_TEACHER_ZGXL.put(XS_TEACHER_ZGXL_BSJYS,"博士及以上");
    }

}
