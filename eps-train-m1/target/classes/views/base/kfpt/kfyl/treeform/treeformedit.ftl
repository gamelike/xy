<@xy.html>
<@xy.html_head value="${child_name}管理">
</@xy.html_head>
<@xy.html_body>
<@xy.nav />
<@xy.container>
<@xy.page_content>
<@xy.content_title value="编辑${child_name}">
</@xy.content_title>
<@xy.content_body type="edit">
<@xy.form id="form" >
        <@xy.text label="单行文本框" type="text" value=gg_tree_detail.danhwb name="danhwb" id="danhwb" position="edit" placeholder="单行文本框" required=true />
        <@xy.textarea label="多行文本框" maxlength="500" value=gg_tree_detail.duohwb name="duohwb" id="duohwb" position="edit" placeholder="多行文本框" required=true />
        <@xy.radio label="单选框" list=dxkData value=gg_tree_detail.dxk name="dxk" position="edit" required=true />
        <@xy.checkbox label="复选框" list=fxkData value=fxkArrays name="fxk" position="edit" required=true />
        <@xy.select label="下拉框" placeholder="请选择" headerValue="请选择" list=xlkData value=gg_tree_detail.xlk name="xlk" id="xlk" position="edit" placeholder="下拉框" required=true />
        <@xy.button_group label="人员" id="rymc" placeholder="人员" value=gg_tree_detail.rymc name="rymc" position="edit" onclick="openWindowForzj(this,'ry','${ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_BASE, xtwwdzColumn) + PublicPageHelper.RY_TREE}','nomal');" required=true />
        <@xy.text value=gg_tree_detail.ry id="ryxz" name="ry" type="hidden"/>
        <@xy.button_group label="机构" id="jgmc" placeholder="机构" value=gg_tree_detail.jgmc name="jgmc" position="edit" onclick="openWindowForzj(this,'jg','${ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_BASE, xtwwdzColumn) + PublicPageHelper.JG_TREE}','small','机构选择');" required=true />
        <@xy.text value=gg_tree_detail.jg id="jgxz" name="jg" type="hidden"/>
        <@xy.code label="区域" lbbs="XZQY" id="qy" placeholder="区域选择" value=gg_tree_detail.qy  name="qy" position="edit" required= false />
        <@xy.code check="true" label="区域多选" lbbs="XZQY" id="qydx" placeholder="区域多选选择" value=gg_tree_detail.qydx  name="qydx" position="edit" required=true />
        <@xy.upload label="附件" id="fj" name="fj" value=gg_tree_detail.fj max_count="1" max_file_size="200mb" required=true />

<@xy.content_submit>
    <@xy.button url="${ctx}/base/kfpt/kfyl/treeform/saveGg_tree_detail" type="save_bottom" onclick="submitx(this,'form')"/>
    <@xy.button type="back_bottom" onclick="back('${ctx}/base/kfpt/kfyl/treeform')"/>
</@xy.content_submit>
    <@xy.text value=gg_tree_detail.id name="id" id="id" type="hidden"/>
    <@xy.text value=gg_tree_detail.treeid name="treeid" id="treeid" type="hidden"/>
</@xy.form>
<@xy.foot_script >
    <@xy.scriptCurrent src="js/base/kfpt/kfyl/treeform/treeformvalidate.js"/>
</@xy.foot_script>
<script type="text/javascript">
    var buttonId;
    $(function () {
        window.addEventListener('message', function (e) {
            var datas = JSON.parse(e.data);
            if (datas.method == "sendRyValue") {
                $("#" + buttonId + "xz").val(datas.params.ryid);
                $("#" + buttonId + "mc").val(datas.params.rymc);
                shut(datas.params.windowName);
            }
            if (datas.method == "sendZzValue") {
                $("#" + buttonId + "xz").val(datas.params.zzid);
                $("#" + buttonId + "mc").val(datas.params.zzmc);
                shut(datas.params.windowName);
            }
        }, false);
        
    });
    function openWindowForzj(obj, buttonid, url,size,title) {
        buttonId = buttonid;
        openWindow({
            action: url,
            size:size,
            title:title
        })
    }
    function submitx(obj, formid) {
        $("#form").validate(validate);
        if ($("#" + formid).validate(validate).form()) {
            hold(obj, function (returnValue) {
                popupOk(returnValue, function () {
                    back("${ctx}/base/kfpt/kfyl/treeform");
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

