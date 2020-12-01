<@xy.html>
  <@xy.html_head value="排序">
  </@xy.html_head>
  <@xy.html_body type="popup">
    <@xy.container type="popup">
      <@xy.page_content>
        <@xy.content_body type="popup">
          <@xy.form id="cdform" >
                    <ul class="sortable-list connectList agile-list">
                        <#list listGg_column as gg_column>
                            <li class="info-element">
                                <div class="agile-detail row">
                                    <div class="col-sm-8"><@xy.text value=gg_column.id name="gg_column_id"  type="hidden"/><@xy.insert value= gg_column.column_name/></div>
                                    <div class="col-sm-4"></div>
                                </div>
                            </li>
                        </#list>
                    </ul>
            <@xy.content_submit>
              <@xy.text value=querycode name="querycode" id="querycode" type="hidden"/>
              <@xy.button url="${ctx}/ananymous/generator/saveSortGg_column" type="save_bottom" onclick="submitx(this,'cdform')"/>
              <@xy.button type="return_bottom" onclick="shutCors()"/>
            </@xy.content_submit>
          </@xy.form>
          <@xy.foot_script >
            <@xy.script src="js/jquery-ui-1.10.4.min.js"/>
          </@xy.foot_script>
                <!--suppress ALL -->
                <script type="text/javascript">
                    function submitx(obj, formid) {
                        hold(obj, function (returnValue) {
                            popupOk(returnValue, function () {
                                getParentPop().initCode(returnValue.data);
                            })
                        })
                    }

                    $(document).ready(function () {
                        $(".sortable-list").sortable({
                            connectWith: ".connectList"
                        }).disableSelection();
                    });
                </script>
        </@xy.content_body>
      </@xy.page_content>
      <@xy.page_footer>
      </@xy.page_footer>
    </@xy.container>
  </@xy.html_body>
</@xy.html>

