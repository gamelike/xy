<@xy.html>
<@xy.html_head value="表单列表">
</@xy.html_head>
<@xy.html_body>
<@xy.nav />
    <@xy.form id="tableForm" position="search">
        <@xy.container>
            <@xy.page_head value="表单列表" value_note="您可以在这里查看及维护表单生成信息">
                <@xy.page_head_top>
                    <@xy.text label="表名称" value="${queryVo.likeItem['table_code']}" name="likeItem[table_code]" type="text" position="search"/>
                    <@xy.select_line label="使用模板" list=tplMap multiple="multiple" value="${queryVo.includeItem['tpl_category']}" id="tpl_category" name="includeItem[tpl_category]" position="search"/>
                    <@xy.text label="token值" type="text" value="${token}" id="token" name="token" style="width:800px;" position="search"/>
                </@xy.page_head_top>
                <@xy.searchButton />
            </@xy.page_head>
            <@xy.page_content>
                <@xy.content_title value="表单列表">
                    <@xy.button type="add" onclick="forward(this)" url="${ctx}/ananymous/generator/addGg_table"/>
                    <@xy.button type="export" onclick="forward(this)" url="${ctx}/ananymous/generator/addPo" text="导出PO"/>
                    <@xy.button type="build" onclick="submitx(this)" url="${ctx}/ananymous/generator/genToken" text="生成token"/>
                </@xy.content_title>
                <@xy.content_body>
                <div class="grid">
                    <div class="thead">
                        <ul>
                            <li style="width:15%">表名称</li>
                            <li style="width:15%">表注释</li>
                            <li style="width:20%">使用模板</li>
                            <li style="width:15%">生成功能作者</li>
                            <li style="width:15%">创建时间</li>
                            <li style="width:20%">操 作</li>
                        </ul>
                    </div>
                    <div class="tbody">
             <#list listGg_table as gg_table>
                 <ul>
                     <li style="width:15%"><@xy.insert value= gg_table.table_code /></li>
                     <li style="width:15%"><@xy.insert value= gg_table.table_name /></li>
                     <li style="width:20%"><@xy.insert value= gg_table.tpl_category type="map" list=tplMap /></li>
                     <li style="width:15%"><@xy.insert value= gg_table.function_author /></li>
                     <li style="width:15%"><@xy.insert value= gg_table.cjsj type="calendar"/></li>
                     <li style="width:20%">
                         <@xy.button type="edit_line" onclick="forward(this);" url="${ctx}/ananymous/generator/editGg_table" parameters="{'id':'${gg_table.id}'}"/>
                         <@xy.button type="delete_line" onclick="confirmRefresh(this,CONFIRM_TITLE_DELETE );" url="${ctx}/ananymous/generator/deleteGg_table" parameters="{'id':'${gg_table.id}'}" />
                         <@xy.button type="view_line" onclick="forward(this);" url="${ctx}/ananymous/generator/Gg_column" parameters="{'gg_table_id':'${gg_table.id}'}" text="字段信息"/>
                         <@xy.button type="view_line" onclick="forward(this);" url="${ctx}/ananymous/generator/code" parameters="{'id':'${gg_table.id}'}" text="生成代码"/>
                     </li>
                 </ul>
             </#list>
                    </div>
                </div>
                    <@xy.splittoolbar />
                    <@xy.foot_script >
                    </@xy.foot_script>
                    <script type="text/javascript">
                        $(function(){
                            if($("#token").val()==""){
                                $("#token").hide();
                            }else{
                                $("#token").show();
                            }
                        })
                        function submitx(obj, formid) {
                            hold(obj, function (returnValue) {
                                popupOk(returnValue, function () {
                                    alert(returnValue.data);
                                    $("#token").val(returnValue.data);
                                    submitThis();
                                }, function () {
                                })
                            })
                        }
                    </script>
                </@xy.content_body>
            </@xy.page_content>
            <@xy.page_footer>
            </@xy.page_footer>
        </@xy.container>
    </@xy.form>
</@xy.html_body>
</@xy.html>
