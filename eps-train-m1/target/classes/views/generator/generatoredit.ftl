<@xy.html>
<@xy.html_head value="表单列表">
</@xy.html_head>
<@xy.html_body>
<@xy.nav />
    <@xy.container>
        <@xy.page_content>
            <@xy.content_title value="编辑基本信息">
            </@xy.content_title>
            <@xy.content_body type="edit">
                <@xy.form id="generatorform" >
                    <@xy.select label="子系统标识" list=zxtMap  name="zxtbs" id="zxtbs" value=gg_table.zxtbs  headerValue="全部" required=true />
                    <@xy.select label="表名称" list=tableMap  name="table_code" id="table_code" value=gg_table.table_code  headerValue="全部" required=true onchange="initMsg(this)"/>
                    <@xy.text label="表注释" type="text" value=gg_table.table_name name="table_name" id="table_name" position="edit" required=true placeholder="例如：代码内容【gg_dmnr】" />
                    <@xy.text label="类名" type="text" value=gg_table.class_name name="class_name" id="class_name" position="edit" required=true placeholder="例如：dmnr" />
                    <@xy.text label="类注释" type="text" value=gg_table.comments name="comments" id="comments" position="edit" required=true placeholder="例如：base子系统/系统管理/日常管理" />
                    <@xy.select label="使用模板" list=tplMap value=gg_table.tpl_category name="tpl_category" id="tpl_category" required=true headerValue="请选择"/>
                    <@xy.text label="子表信息" type="text" value=gg_table.child_info name="child_info" id="child_info" position="edit" placeholder="固定格式：子表名称1.关联字段;子表名称2.关联字段;"/>
                    <#--<@xy.select label="关联父表" list=parent_tableMap value=gg_table.parent_table_name name="parent_table_name" id="parent_table_name" />
                    <@xy.select label="关联外键" list=columnMap listKey="id" listValue="column_code" value=gg_table.parent_table_pk_name name="parent_table_pk_name" id="parent_table_pk_name" />-->
                    <@xy.text label="生成包根路径" type="text" value=gg_table.package_name name="package_name" id="package_name" position="edit" required=true placeholder="例如：com.xinyuan"/>
                    <#--<@xy.text label="生成基础路径" type="text" value=gg_table.gen_base_dir name="gen_base_dir" id="gen_base_dir" position="edit" placeholder="例如："/>-->
                    <@xy.text label="生成模块名" type="text" value=gg_table.module_name name="module_name" id="module_name" position="edit" required=true placeholder="例如：xtgl"/>
                    <@xy.text label="生成子模块名" type="text" value=gg_table.sub_module_name name="sub_module_name" id="sub_module_name" position="edit" placeholder="例如：rcgl"/>
                    <@xy.text label="生成功能名" type="text" value=gg_table.function_name name="function_name" id="function_name" position="edit" required=true placeholder="例如：sjzd"/>
                    <@xy.text label="生成功能作者" type="text" value=function_author name="function_author" id="function_author" position="edit"  />
                    <@xy.radio label="是否有扩展字段" list=sfMap value=gg_table.iskzzd name="iskzzd" position="edit" />
                    <@xy.radio label="是否有排序" list=sfMap value=gg_table.issort name="issort" position="edit" onclick="showpxzd(this)"/>
                    <@xy.text label="排序字段" type="text" value=gg_table.pxzd name="pxzd" id="pxzd" position="edit" placeholder="例如：排序功能页面展示的字段"/>
                    <@xy.radio label="是否有导出" list=sfMap value=gg_table.isdc name="isdc" position="edit"/>
                    <@xy.text label="流程标识" type="text" value=gg_table.lcbs name="lcbs" id="lcbs" position="edit" placeholder="例如：zbxm"/>
                    <@xy.content_submit>
                        <@xy.button url="${ctx}/ananymous/generator/saveGg_table" type="save_bottom" onclick="submitx(this,'generatorform')"/>
                        <@xy.button type="back_bottom" onclick="back('${ctx}/ananymous/generator')"/>
                    </@xy.content_submit>
                    <@xy.text value=gg_table.id name="id"  id="id" type="hidden"/>
                </@xy.form>
                <@xy.foot_script >
                    <@xy.scriptCurrent src="js/generator/GeneratorValidate.js"/>
                </@xy.foot_script>
                <script type="text/javascript">
                    function submitx(obj, formid) {
                        if ($("#" + formid).validate(validate).form()) {
                            hold(obj, function (returnValue) {
                                popupOk(returnValue, function () {
                                    back("${ctx}/ananymous/generator");
                                }, function () {
                                    $("#" + formid).validate(validate).form();
                                })
                            })
                        }
                    }
                    function initMsg(obj){
                        ajaxDefault("${ctx}/ananymous/generator/ajaxGetTableInfo", {"table_code": $(obj).val(),"gg_table_id": $("#id").val()}, function (returnValue) {
                            $("#table_name").val(returnValue.data.table_comments);
                            $("#class_name").val(returnValue.text);
                        });
                    }
                </script>
        </@xy.content_body>
    </@xy.page_content>
    <@xy.page_footer>
    </@xy.page_footer>
    </@xy.container>
</@xy.html_body>
</@xy.html>
