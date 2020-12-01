<@xy.html>
<@xy.html_head value="按钮增删查改[kf_anzscg]管理">
</@xy.html_head>
<@xy.html_body>
<@xy.nav/>
<@xy.container>
<@xy.page_content>
<@xy.content_title value="编辑按钮增删查改[kf_anzscg]">
</@xy.content_title>
<@xy.content_body type="edit">
<@xy.form id="form">
    <@xy.text label="标识" type="text" value=kf_anzscg.bs name="bs" id="bs" position="edit" placeholder="标识" required=true />
    <@xy.text label="名称" type="text" value=kf_anzscg.mc name="mc" id="mc" position="edit" placeholder="名称" required=true />
<@xy.content_submit>
    <@xy.button url="${ctx}/base/kfpt/kfyl/anzscg/saveKf_anzscg" type="save_bottom" onclick="submitx(this,'form')"/>
    <@xy.button type="back_bottom" onclick="back('${ctx}/base/kfpt/kfyl/anzscg')"/>
</@xy.content_submit>
    <@xy.text value=kf_anzscg.id name="id" id="id" type="hidden"/>
</@xy.form>
<@xy.foot_script>
    <@xy.scriptCurrent src="js/base/kfpt/kfyl/anzscg/anzscgvalidate.js"/>
</@xy.foot_script>
<script type="text/javascript">
    function submitx(obj, formid) {
        $("#form").validate(validate);
        if ($("#" + formid).validate(validate).form()) {
            hold(obj, function (returnValue) {
                popupOk(returnValue, function () {
                    back("${ctx}/base/kfpt/kfyl/anzscg");
                }, function () {
                    $("#" + formid).validate(validate).form();
                })
            })
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

