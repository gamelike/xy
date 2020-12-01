<@xy.html>
<@xy.html_head value="树[kf_tree]管理">
</@xy.html_head>
<@xy.html_body>
<@xy.nav/>
<@xy.container>
<@xy.page_content>
<@xy.content_title value="编辑树[kf_tree]">
</@xy.content_title>
<@xy.content_body type="edit">
<@xy.form id="form">
    <@xy.text label="标题" type="text" value=kf_tree.bt name="bt" id="bt" position="edit" placeholder="标题" required=true />
     <@xy.code label="标识" lbbs="CGFS" id="bs" placeholder="代码选择" value=kf_tree.bs name="bs" position="edit" required=true />

<@xy.content_submit>
<@xy.button url="${ctx}/base/kfpt/kfyl/tree/saveKf_tree" type="save_bottom" onclick="submitx(this,'form')"/>
<@xy.button type="back_bottom" onclick="back('${ctx}/base/kfpt/kfyl/tree')"/>
</@xy.content_submit>
<@xy.text value=kf_tree.id name="id" id="id" type="hidden"/>
<@xy.text value=kf_tree.pid name="pid" id="pid" type="hidden"/>
<@xy.text value=kf_tree.lj name="lj" id="lj" type="hidden"/>
</@xy.form>
<@xy.foot_script >
    <@xy.scriptCurrent src="js/base/kfpt/kfyl/tree/treevalidate.js"/>
</@xy.foot_script>
<script type="text/javascript">
    function submitx(obj, formid) {
        $("#form").validate(validate);
        if ($("#" + formid).validate(validate).form()) {
            hold(obj, function (returnValue) {
                popupOk(returnValue, function () {
                    back("${ctx}/base/kfpt/kfyl/tree");
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

