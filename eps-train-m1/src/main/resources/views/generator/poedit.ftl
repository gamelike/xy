<@xy.html>
<@xy.html_head value="po生成">
</@xy.html_head>
<@xy.html_body>
<@xy.nav />
        <@xy.container>
            <@xy.page_content>
                <@xy.content_title value="PO生成基本信息">
                </@xy.content_title>
                <@xy.content_body type="edit">
                    <@xy.form id="generatorform" >
                        <@xy.checkbox list=mbMap  value=po_table.mbbs id="mbbs" name="mbbs" position="edit" required=true  label="导出模板"/>
                        <@xy.text label="表名" type="text" value=po_table.table_name name="table_name" id="table_name" position="edit" required=true placeholder="例如：gg_dmnr" />
                        <@xy.content_submit>
                            <@xy.button url="${ctx}/ananymous/generator/pocode" type="save_bottom" onclick="submitx(this,'generatorform')" text="导出" />
                            <@xy.button type="back_bottom" onclick="back('${ctx}/ananymous/generator')"/>
                        </@xy.content_submit>
                    </@xy.form>
                    <@xy.foot_script >
                        <@xy.scriptCurrent src="js/generator/povalidate.js"/>
                    </@xy.foot_script>
                    <script type="text/javascript">
                        function submitx(obj, formid) {
                            var checks = "";
                            $('input[name="mbbs"]:checked').each(function () {
                                checks += $(this).val() + ",";
                            });
                            if ($("#" + formid).validate(validate).form()) {
                                $(obj).attr("parameters","{'mbbs':'"+checks+"','table_name':'"+$("#table_name").val()+"'}")
                                forward(obj,{'target':'_blank','queryCriteria':false});
                                       // back("${ctx}/ananymous/generator");

                            }
                        }
                    </script>
            </@xy.content_body>
        </@xy.page_content>
        <@xy.page_footer>
        </@xy.page_footer>
    </@xy.container>
</@xy.html_body>
</@xy.html>
