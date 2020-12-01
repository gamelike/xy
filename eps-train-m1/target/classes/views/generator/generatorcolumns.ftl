<@xy.html>
<@xy.html_head value="表单列表">
</@xy.html_head>
<@xy.html_body>
<@xy.nav/>
    <@xy.form id="columnsForm">
        <@xy.container>
        <@xy.page_head title="说明">
            <@xy.page_head_top>
            如果表单类型为单选按钮、单选下拉框、多选下拉框、复选框、code组件、图片和其他附件时，需要填写规则内容<br/>
        1、规则内容字段对应的语法如下：<br/>
          (1)常量形式，例如：cmap=com.xinyuan.base.common.Constants_base.GG_STUDENT_SEX_MAP<br/>
          (2)sql语句形式，例如：sql=select id id,xtmc mc from gg_zxtxx<br/>
          (3)code组件直接写gg_dmlb的lbbs，例如：XZQY<br/>
          (4)图片类和其他附件类需要规定上传文件的最大值，例如：max_file_size="200mb"<br/>
          其中(1)(2)适用于单选按钮、单选下拉框、多选下拉框、复选框
         2、字段校验格式例如：required: true,maxlength:200
            <div id="headlist" class="collapse in"></div>
            <@xy.text value=querycode name="querycode" id="querycode" type="hidden"/>
            <@xy.select_line label="表名称" list=tablecodeData value="${queryVo.includeItem['tableid']}" type="single" isshowall=false id="tableid" name="includeItem[tableid]" position="search"/>
        </@xy.page_head_top>
        </@xy.page_head>
        <@xy.page_content>
        <@xy.content_title value="编辑基本信息">
            <@xy.button type="sort" onclick="openWindow(this);" ignoretrt=true url="/ananymous/generator/sortGg_column" parameters="{'tableid':'${querycode}'}" text="排序"/>
            <@xy.button type="refresh" onclick="submiSysn(this,'columnsForm')" ignoretrt=true url="${ctx}/ananymous/generator/synchronizeGg_column" text="同步字段"/>
        </@xy.content_title>
        <@xy.content_body type="edit">
        <div class="scrollbar-inner">
           <div class="grid-edit" style="width:2000px">
              <div class="thead">
               <ul>
                  <li style="width:4%">序号</li>
                  <li style="width:5%">列标识</li>
                  <li style="width:6%">列名称</li>
                  <li style="width:8%">列类型</li>
                  <li style="width:5%">列表字段</li>
                  <li style="width:8%">查询字段</li>
                  <li style="width:8%">查询方式</li>
                  <li style="width:5%">排序字段</li>
                  <li style="width:5%">列表宽度(%)</li>
                  <li style="width:5%">编辑字段</li>
                  <li style="width:8%">组件类型</li>
                  <li style="width:5%">是否可空</li>
                  <li style="width:8%">规则内容</li>
                  <li style="width:8%">自动补充数据</li>
                  <li style="width:8%">字段校验</li>
                  <#if gg_table.isdc == sf_s>
                    <li style="width:5%">是否导出</li>
                  </#if>
              </ul>
              </div>
              <div class="tbody">
                 <#list gg_columnList as gg_column>
                 <ul>
                     <li style="width:4%"><@xy.index gg_column_index /></li>
                     <li style="width:5%"><@xy.insert value=gg_column.column_code/></li>
                     <li style="width:6%"><@xy.text type="text" value=gg_column.column_name name="${gg_column.id}column_name" id="${gg_column.id}column_name"/></li>
                     <li style="width:8%">
                        <@xy.insert value= gg_column.column_type/><br/>
                        [<@xy.insert value= gg_column.length/>,<@xy.insert value= gg_column.xsw/>]
                     </li>
                     <li style="width:5%"><@xy.checkboxsingle name="${gg_column.id}is_list" id="${gg_column.id}is_list" value=sf_s checked="${gg_column.is_list==sf_s}" onchange="changeChecked(this)"/></li>
                     <li style="width:8%"><@xy.select position="search" list=queryMap value=gg_column.is_query name="${gg_column.id}is_query" id="${gg_column.id}is_query" headerValue="请选择"/></li>
                     <li style="width:8%"><@xy.select position="search" list=query_typeMap value=gg_column.query_type name="${gg_column.id}query_type" id="${gg_column.id}query_type" headerValue="请选择" /></li>
                     <li style="width:5%"><@xy.checkboxsingle name="${gg_column.id}is_sort" id="${gg_column.id}is_sort" value=sf_s checked="${gg_column.is_sort==sf_s}"/></li>
                     <li style="width:5%"><@xy.text type="text" value= gg_column.list_width name="${gg_column.id}list_width" id="${gg_column.id}list_width"/></li>
                     <li style="width:5%"><@xy.checkboxsingle name="${gg_column.id}is_edit" id="${gg_column.id}is_edit" value=sf_s checked="${gg_column.is_edit==sf_s}"/></li>
                     <li style="width:8%"><@xy.select position="search" list=show_typeMap value=gg_column.show_type name="${gg_column.id}show_type" id="${gg_column.id}show_type" headerValue="请选择" /></li>
                     <li style="width:5%"><@xy.checkboxsingle name="${gg_column.id}is_null" id="${gg_column.id}is_null" value=sf_s checked="${gg_column.is_null==sf_s}"/></li>
                     <li style="width:8%"><@xy.textarea position="search" autoheight=true value=gg_column.list_data name="${gg_column.id}list_data" id="${gg_column.id}list_data"/></li>
                     <li style="width:8%"><@xy.select position="search"  list=insert_typeMap value=gg_column.insert_type name="${gg_column.id}insert_type" id="${gg_column.id}insert_type" headerValue="请选择" /></li>
                     <li style="width:8%">
                        <@xy.textarea position="search" autoheight=true value=gg_column.show_validate name="${gg_column.id}show_validate" id="${gg_column.id}show_validate"/>
                     </li>
                     <#if gg_table.isdc == sf_s>
                        <li style="width:5%"><@xy.checkboxsingle name="${gg_column.id}is_dc" id="${gg_column.id}is_dc" value=sf_s checked="${gg_column.is_dc==sf_s}"/></li>
                     </#if>
                     <@xy.text value=gg_column.id name="id" type="hidden"/>
                 </ul>
                 </#list>
                  <@xy.text value=gg_table.id name="gg_table_id" id="gg_table_id" type="hidden"/>
                  <@xy.text value=sfzb name="sfzb" id="sfzb" type="hidden"/>
              </div>
          </div>
        </div>
          <@xy.content_submit>
             <@xy.button url="${ctx}/ananymous/generator/saveGg_column" type="save_bottom" onclick="submitx(this,'columnsForm')"/>
             <@xy.button type="back_bottom" onclick="back('${ctx}/ananymous/generator')"/>
          </@xy.content_submit>
          <@xy.foot_script >
             <@xy.scriptCurrent src="js/generator/GeneratorColumnValidate.js"/>
          </@xy.foot_script>
          <script type="text/javascript">
              function submiSysn(obj, formid) {
                 if ($("#" + formid).validate(validate).form()) {
                    hold(obj, function (returnValue) {
                        popupOk(returnValue, function () {
                            $("#tableid").val(";"+returnValue.data+";");
                            submitThis();
                        }, function () {
                            $("#" + formid).validate(validate).form();
                        })
                    })
                 }
              }
              function changeChecked(obj){
                  if($(obj).attr("checked")){
                      $(obj).removeAttr("checked");
                  }else{
                      $(obj).attr("checked","checked")
                  }
              }
              function submitx(obj, formid) {
                  $("#columnsForm").validate(validate);
                  <#list gg_columnList as gg_column>
                  if($("input[name='${gg_column.id}is_list']").attr("checked") && ($("#${gg_column.id}list_width").val()=="" || $("#${gg_column.id}list_width").val()=="undefined")){
                      $("#${gg_column.id}list_width").rules("add", {
                          required: true
                      });
                  }else{
                      $("#${gg_column.id}list_width").rules("remove");
                  }
                  </#list>
                  if ($("#" + formid).validate(validate).form()) {
                      hold(obj, function (returnValue) {
                          popupOk(returnValue, function () {
                              $("#tableid").val(";"+returnValue.data+";");
                              submitThis();
                          }, function () {
                              $("#" + formid).validate(validate).form();
                          })
                      })
                  }
              }
              function initCode(querycode){
                  $("#tableid").val(";"+querycode+";");
                  submitThis();
              }
              $(function () {
                  $("#columnsForm").validate(validate);
                  <#list gg_columnList as gg_column>
                    if(${gg_column.is_list?default(0)}==${sf_s} && ($("#${gg_column.id}list_width").val()=="" || $("#${gg_column.id}list_width").val()=="undefined")){
                        $("#${gg_column.id}list_width").rules("add", {
                            required: true
                        });
                    }
                  </#list>
              });
          </script>
        </@xy.content_body>
        </@xy.page_content>
        <@xy.page_footer>
        </@xy.page_footer>
    </@xy.container>
    </@xy.form>
</@xy.html_body>
</@xy.html>
