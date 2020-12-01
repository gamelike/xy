<@xy.html>
<@xy.html_head value="双列编辑查看管理">
</@xy.html_head>
<@xy.html_body>
<@xy.nav/>
<@xy.container>
<@xy.page_content>
<@xy.content_title value="编辑双列编辑查看">
</@xy.content_title>
<@xy.content_body type="edit">
<@xy.form id="form">
<@xy.sub type="main-left">
    <@xy.text label="单行文本框" type="text" value=kf_slbjck.danhwb name="danhwb" id="danhwb" position="edit_two" placeholder="单行文本框" required=true />
    <@xy.textarea label="多行文本框" maxlength="500" value=kf_slbjck.duohwb name="duohwb" id="duohwb" position="edit_two" placeholder="多行文本框" required=true />
    <@xy.select label="下拉框" headerValue="请选择" list=xlkData value=kf_slbjck.xlk name="xlk" id="xlk" position="edit_two" placeholder="下拉框" required=true />
    <@xy.select label="下拉框多选" multiple="multiple" listValue="name" headerValue="请选择" list=xlkdxData value=xlkdxArrays name="xlkdx" id="xlkdx" position="edit_two" placeholder="下拉框多选" required=true />
    <@xy.radio label="单选按钮" list=dxkData value=kf_slbjck.dxk name="dxk" position="edit_two" required=true />
    <@xy.checkbox label="复选框" list=fxkData value=fxkArrays name="fxk" position="edit_two" required=true />
</@xy.sub>
<@xy.sub type="main-right">
    <@xy.calendar label="日期" id=rq+"rq" placeholder="日期" time=false value=kf_slbjck.rq name="rq" position="edit_two" required=true />
    <@xy.calendar label="日期时间" id=rqsj+"rqsj" placeholder="日期时间" value=kf_slbjck.rqsj name="rqsj" position="edit_two" required=true />
    <@xy.button_group label="用户" id="yhmc" placeholder="用户" value=kf_slbjck.yhmc name="yhmc" position="edit_two" onclick="openWindowForzj(this,'yh','${ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_BASE, xtwwdzColumn) + PublicPageHelper.RY_TREE}','nomal');" required=true />
    <@xy.text value=kf_slbjck.yh id="yhxz" name="yh" type="hidden"/>
    <@xy.button_group label="机构" id="jgmc" placeholder="机构" value=kf_slbjck.jgmc  name="jgmc" position="edit_two" onclick="openWindowForzj(this,'jg','${ZxtxxUtil.getXtwwdz(Constants.CONST_ZXT_ID_BASE, xtwwdzColumn) + PublicPageHelper.JG_TREE}','small','机构选择');" required=true />
    <@xy.text value=kf_slbjck.jg id="jgxz" name="jg" type="hidden"/>
    <@xy.code label="区域" lbbs="XZQY" id="qy" position="edit_two" placeholder="区域选择" value=kf_slbjck.qy name="qy" required=true />
    <@xy.code check="true" label="区域多选" lbbs="XZQY" id="qydx" position="edit_two" placeholder="区域多选选择" value=kf_slbjck.qydx name="qydx" required=true />
    <@xy.upload label="图片" type="img" id="tp" name="tp" position="edit_two" value=kf_slbjck.tp max_count="1" max_file_size="200mb" required=true />
    <@xy.upload label="附件" id="fj" name="fj" position="edit_two" value=kf_slbjck.fj max_count="1" max_file_size="200mb" required=true />
</@xy.sub>

<@xy.content_submit>
    <@xy.button url="${ctx}/base/kfpt/kfyl/slbjck/saveKf_slbjck" type="save_bottom" onclick="submitx(this,'form')"/>
    <@xy.button type="back_bottom" onclick="back('${ctx}/base/kfpt/kfyl/slbjck')"/>
</@xy.content_submit>
    <@xy.text value=kf_slbjck.id name="id" id="id" type="hidden"/>
</@xy.form>
<@xy.foot_script>
    <@xy.scriptCurrent src="js/base/kfpt/kfyl/slbjck/slbjckvalidate.js"/>
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
                    back("${ctx}/base/kfpt/kfyl/slbjck");
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

