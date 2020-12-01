<@xy.html>
  <@xy.html_head value="按钮增删查改[kf_anzscg]管理">
  </@xy.html_head>
  <@xy.html_body>
    <@xy.container type="popup">
      <@xy.page_content>
        <@xy.content_body>
          <@xy.form id="form" >
            <ul class="sortable-list connectList agile-list">
                <#list listKf_anzscg as kf_anzscg>
                    <li class="info-element">
                        <div class="agile-detail row">
                            <div class="col-sm-8"><@xy.text value=kf_anzscg.id name="kf_anzscg_ids"  type="hidden"/><@xy.insert value= kf_anzscg.mc/></div>
                            <div class="col-sm-4"></div>
                        </div>
                    </li>
                </#list>
            </ul>
            <@xy.content_submit>
              <@xy.button url="${ctx}/base/kfpt/kfyl/anzscg/saveSortKf_anzscg" type="save_bottom"  onclick="submitx(this,'form')"/>
              <@xy.button type="back_bottom" onclick="shutCors()"/>
            </@xy.content_submit>
          </@xy.form>
          <@xy.foot_script >
            <@xy.script src="js/jquery-ui-1.10.4.min.js"/>
          </@xy.foot_script>
          <script type="text/javascript">
              function submitx(obj, formid) {
                hold(obj, function (returnValue) {
                    popupOk(returnValue, function () {
                        shutCors();
                        getParentPop().refresh();
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

